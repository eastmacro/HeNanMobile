package sjtu.rfid.rfidsys;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import com.atid.lib.dev.ATRfidManager;
import com.atid.lib.dev.ATRfidReader;
import com.atid.lib.dev.event.RfidReaderEventListener;
import com.atid.lib.dev.rfid.exception.ATRfidReaderException;
import com.atid.lib.dev.rfid.type.ActionState;
import com.atid.lib.dev.rfid.type.ConnectionState;
import com.atid.lib.dev.rfid.type.ResultCode;
import com.atid.lib.dev.rfid.type.TagType;
import com.atid.lib.diagnostics.ATLog;
import com.atid.lib.dialog.WaitDialog;
import com.atid.lib.util.SysUtil;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rfid.service.ASN;
import rfid.service.Good;
import sjtu.rfid.entity.Config;
import sjtu.rfid.thread.BindThread;
import sjtu.rfid.thread.PutInStorageScanBoxThread;
import sjtu.rfid.thread.PutInStorageScanLocThread;
import sjtu.rfid.thread.PutInStorageThread;
import sjtu.rfid.tools.CheckByPosExpandableAdapter;
import sjtu.rfid.tools.Converters;
import sjtu.rfid.tools.PutInStorageExpandableAdapter;
import sjtu.rfid.tools.SoundPlay;
import sjtu.rfid.tools.TitleBar;

public class PutInStorageActivity extends Activity implements RfidReaderEventListener {

    private ExpandableListView sheetListView;
    private PutInStorageExpandableAdapter tmpAdapter;
    private Map<String, Map<String, String>> mPutInStorageDetailList;
    private List<Map<String,String>> mPutInStorageList;
    private TitleBar mTitleBar;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    private PutInStorageThread putInStorageThread;
    private PutInStorageScanLocThread scanLocThread;
    private PutInStorageScanBoxThread scanBoxThread;
    private BindThread bindThread;
    private String CNum="EPC201509000000";
    private Good good;
    public int goodPos=-1;
    private boolean bindResult;

    private static final String TAG = "MainActivity";
    private static final boolean ENABLE_LOG = false;
    private static final String LOG_PATH = "Log";
    private SoundPlay mSound;

    private int mOperationTime;
    private int mInventoryTime;
    private int mIdleTime;
    private int mPowerLevel;

    private ATRfidReader mReader = null;

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if(msg.what==0||msg.obj==null)
                Toast.makeText(getApplicationContext(), "获取信息失败", Toast.LENGTH_SHORT).show();
            bindResult=(boolean)msg.obj;
            if(bindResult)
                Toast.makeText(getApplicationContext(), "绑定成功", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(getApplicationContext(), "绑定失败", Toast.LENGTH_SHORT).show();
        }
    };

    private Handler scanHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if(msg.what == 0){
                try {
                    String epc = ((String) msg.obj).substring(0,3);
                    TextView vGoodsPos = (TextView) findViewById(R.id.text_put_in_storage_loc);
                    if (Config.LocationMap.containsKey(epc)) {
                        goodPos = Integer.parseInt(Config.LocationMap.get(epc));
                        ((TextView) findViewById(R.id.text_put_in_storage_loc)).setText(epc);
                    }
                } catch (Exception e ) {
                    Log.e("error",e.getMessage());
                }
            }
            else if(msg.what == 1){
                Good good = (Good)msg.obj;
                iniListView(good);

            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put_in_storage);

        mSound = new SoundPlay(getApplicationContext());
        WaitDialog.show(this, "连接RFID模块中", "请稍等", new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                PutInStorageActivity.this.finish();
            }
        });

        if ((mReader = ATRfidManager.getInstance()) == null) {
            WaitDialog.hide();
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setIcon(android.R.drawable.ic_dialog_alert);
            builder.setTitle("出错啦");
            builder.setMessage("连接UHF模块错误,请检查UHF 模块！");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.show();
        }
        mSound.playSuccess();

        mPutInStorageDetailList = new HashMap<String, Map<String, String>>();
        mPutInStorageList = new ArrayList<>();
        iniActivity();
        iniEvent();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    protected void onDestroy() {

        ATRfidManager.onDestroy();
        SysUtil.wakeUnlock();
        ATLog.d(TAG, "INFO. onDestroy");
        ATLog.shutdown();
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mReader != null) {
            ATRfidManager.wakeUp();
            try
            {
                saveOption();
                ATLog.i(TAG, String.valueOf(mReader.getPower()));
            }
            catch (ATRfidReaderException ax)
            {
            }

        }
    }

    @Override
    protected void onStop() {
        ATRfidManager.sleep();
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mReader != null)
            mReader.setEventListener(this);
    }

    @Override
    protected void onPause() {
        if (mReader != null)
            mReader.removeEventListener(this);
        super.onPause();
    }

    protected void stopAction() {
        ResultCode res;
        if ((res = mReader.stop()) != ResultCode.NoError) {
            return;
        }
    }

    // ------------------------------------------------------------------------
    // Reader Control Methods
    // ------------------------------------------------------------------------

    // Start Action
    protected void startAction(boolean type) {

        ResultCode res;
        TagType tagType = TagType.Tag6C;//getTagType();


        if (type) {
            // Multi Reading
            switch (tagType) {
                case Tag6C:
                    if ((res = mReader.inventory6cTag()) != ResultCode.NoError) {
                        return;
                    }
                    break;
                case Tag6B:
                    if ((res = mReader.inventory6bTag()) != ResultCode.NoError) {
                        return;
                    }
                    break;
            }
        } else {
            // Single Reading
            switch (tagType) {
                case Tag6C:
                    if ((res = mReader.readEpc6cTag()) != ResultCode.NoError) {
                        return;
                    }
                    break;
                case Tag6B:
                    if ((res = mReader.readEpc6bTag()) != ResultCode.NoError) {
                        return;
                    }
                    break;
            }
        }
    }

    @Override
    public void onReaderStateChanged(final ATRfidReader reader, final ConnectionState state) {
        switch (state) {
            case Connected:
                WaitDialog.hide();
                String version = "";
                try {
                    version = mReader.getFirmwareVersion();
                } catch (ATRfidReaderException e) {
                    version = "";
                    mReader.disconnect();
                }
                Toast.makeText(this, version, Toast.LENGTH_SHORT);
                break;
            case Disconnected:
                WaitDialog.hide();
                break;
            default:
                break;
        }
    }

    @Override
    public void onReaderActionChanged(ATRfidReader reader, final ActionState action) {
        if (action == ActionState.Stop) {
        }
    }

    @Override
    public void onReaderReadTag(ATRfidReader reader, final String tag, final float rssi) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                stopAction();
                mReader.stop();
                String epc = new String(Converters.fromHexString(tag.substring(4)));
                Toast.makeText(getApplicationContext(),tag+","+epc,Toast.LENGTH_SHORT).show();
                Message msg=scanHandler.obtainMessage();
                msg.what=0;
                msg.obj=epc;
                scanHandler.sendMessage(msg);
            }
        });
        mSound.playSuccess();

    }

    @Override
    public void onReaderResult(ATRfidReader reader, final ResultCode code, ActionState action, final String epc, final String data) {

    }

    public void iniActivity() {
        mTitleBar = new TitleBar(this,"入库上架");
    }

    public void iniListView(Good good) {
        if(good==null)
            return;

        sheetListView = (ExpandableListView) findViewById(R.id.list_put_in_storage_sheets);
        Map<String,String> map=new HashMap<>();
        map.put("boxCode", CNum);
        map.put("matName", good.getDetail());
        mPutInStorageList.add(map);

        Map<String, String> detailMap = new HashMap<>();
        detailMap.put("matCode", good.getCode());
        detailMap.put("unit", good.getUnit());
        detailMap.put("count", String.valueOf(good.getNum()));
        mPutInStorageDetailList.put(CNum, detailMap);

        tmpAdapter = new PutInStorageExpandableAdapter(this,mPutInStorageDetailList,mPutInStorageList);
        sheetListView.setAdapter(tmpAdapter);

        sheetListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                for (int i = 0; i < tmpAdapter.getGroupCount(); i++) {
                    if (groupPosition != i) {
                        sheetListView.collapseGroup(i);
                    }
                }
            }
        });

    }

    public void iniEvent(){
        Button btnScanLoc=(Button)findViewById(R.id.btn_put_in_storage_scan_loc);
        Button btnScanBox=(Button)findViewById(R.id.btn_put_in_storage_scan_box);
        Button btnClear=(Button)findViewById(R.id.btn_put_in_storage_clear);
        Button btnBind=(Button)findViewById(R.id.btn_put_in_storage_bind);

        btnScanLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                scanLocThread = new PutInStorageScanLocThread(scanHandler);
//                scanLocThread.start();

                startAction(false);
                mReader.connect();
            }
        });
        btnScanBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scanBoxThread = new PutInStorageScanBoxThread(scanHandler);
                scanBoxThread.start();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPutInStorageDetailList.clear();
                mPutInStorageList.clear();
            }
        });
        btnBind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> CNumList = new ArrayList<String>();
                for (Map.Entry<String, Map<String, String>> entry : mPutInStorageDetailList.entrySet()) {
                    String cartonNum = entry.getKey();
                    CNumList.add(cartonNum);
                }
                bindThread = new BindThread(CNumList, goodPos, handler);
                bindThread.start();

            }
        });


    }

    private void saveOption() {
        WaitDialog.show(this, "Save Properties...\r\nPlease Wait...");

        mOperationTime = 0;
        mInventoryTime = 1200;
        mIdleTime = 200;
        mPowerLevel = 130;

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    mReader.setReportRssi(true);
                } catch (ATRfidReaderException e) {
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            WaitDialog.hide();
                        }
                    });
                    return;
                }
                // Set Operation Time
                try {
                    mReader.setOperationTime(mOperationTime);
                } catch (ATRfidReaderException e) {
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            WaitDialog.hide();
                        }
                    });
                    return;
                }

                // Set Inventory Time
                try {
                    mReader.setInventoryTime(mInventoryTime);
                } catch (ATRfidReaderException e) {

                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            WaitDialog.hide();
                        }
                    });
                    return;
                }

                // Set Idle Time
                try {
                    mReader.setIdleTime(mIdleTime);
                } catch (ATRfidReaderException e) {

                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            WaitDialog.hide();
                        }
                    });
                    return;
                }

                // Set Power Level
                try {
                    mReader.setPower(mPowerLevel);
                } catch (ATRfidReaderException e) {

                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            WaitDialog.hide();
                        }
                    });
                    return;
                }

                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        WaitDialog.hide();
                        //finish();
                    }
                });
            }
        }).start();
    }
    class ScanThread extends Thread{

        private  String epc;

        public ScanThread(String epc) {
            this.epc = epc;
        }

        @Override
        public void run() {
//                if( Config.LocationMap.containsKey(epc) ) {
//                    goodPos = Integer.parseInt(Config.LocationMap.get(epc));
//                    ((TextView)findViewById(R.id.text_put_in_storage_loc)).setText(epc);
//                }

        }
    }
}
