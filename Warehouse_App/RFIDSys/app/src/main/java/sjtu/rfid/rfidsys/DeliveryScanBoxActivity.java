package sjtu.rfid.rfidsys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sjtu.rfid.tools.DeliverySheetsScanBoxExpandableAdapter;
import sjtu.rfid.tools.ReceivingSheetsScanBoxExpandableAdapter;

public class DeliveryScanBoxActivity extends AppCompatActivity {

    private TextView vDeliverySheetCode;
    ExpandableListView sheetListView;
    DeliverySheetsScanBoxExpandableAdapter tmpAdapter;
    private Map<String, List<Map<String, String>>> mDeliveryBoxesDetails;
    private List<String> mDeliveryBoxes;
    private List<Map<String, String>> mapList;
    private int prePos=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_scan_box);
        vDeliverySheetCode=(TextView)findViewById(R.id.text_delivery_scan_box_code);
        Bundle bundle=this.getIntent().getExtras();
        String delivery_sheet_code=bundle.getString("delivery_sheet_code");
        vDeliverySheetCode.setText(vDeliverySheetCode.getText()+delivery_sheet_code);

        iniListView();
    }

    public void iniListView() {
        mDeliveryBoxesDetails=new HashMap<String, List<Map<String, String>>>();
        mapList = new ArrayList<Map<String,String>>();
        mDeliveryBoxes = new ArrayList<>();
        sheetListView = (ExpandableListView) findViewById(R.id.list_delivery_box_sheets);
        mDeliveryBoxes.add("201509000101501");
        mDeliveryBoxes.add("201509000101502");
        mDeliveryBoxes.add("201509000101503");
        mDeliveryBoxes.add("201509000101504");
        mDeliveryBoxes.add("201509000101505");
        mDeliveryBoxes.add("201509000101506");
        mDeliveryBoxes.add("201509000101507");
        mDeliveryBoxes.add("201509000101508");
        mDeliveryBoxes.add("201509000101509");
        mDeliveryBoxes.add("201509000101510");

        for (int i = 0; i < mDeliveryBoxes.size(); i++) {
            Map<String, String> detailMap = new HashMap<>();
            detailMap.put("isBom", "Y");
            detailMap.put("itemCode", "10091005");
            detailMap.put("itemName", "传统型光缆交接箱\\复合材料（SMC）\\满配壁挂式\\144芯");
            detailMap.put("quantity", "1");
            detailMap.put("cartonOrderNumber", mDeliveryBoxes.get(i)+"/1/1");
            detailMap.put("cartonNumber", mDeliveryBoxes.get(i));
            mapList.clear();
            mapList.add(detailMap);
            mDeliveryBoxesDetails.put(mDeliveryBoxes.get(i), mapList);
        }
        tmpAdapter = new DeliverySheetsScanBoxExpandableAdapter(this, mDeliveryBoxesDetails, mDeliveryBoxes);
        sheetListView.setAdapter(tmpAdapter);


        sheetListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                /*
                if(prePos==-1) {
                    sheetListView.expandGroup(groupPosition);
                    prePos=groupPosition;
                }
                else{
                    sheetListView.collapseGroup(prePos);
                    sheetListView.expandGroup(groupPosition);
                }
                */
                for (int i = 0; i < tmpAdapter.getGroupCount(); i++) {
                    if (groupPosition != i) {
                        sheetListView.collapseGroup(i);
                    }
                }
            }
        });
    }
}
