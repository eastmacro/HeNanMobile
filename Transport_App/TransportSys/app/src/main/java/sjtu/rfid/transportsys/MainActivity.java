package sjtu.rfid.transportsys;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import sjtu.rfid.thread.TestThread;

public class MainActivity extends AppCompatActivity {

    private Button btnConfig,btnApply,btnArriveTmp,btnArriveConstruct;
    private MainButtonListener mBtnListener = new MainButtonListener();

    private TestThread testThread;

    private Handler TestHandler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            Toast.makeText(getApplicationContext(), msg.obj.toString(), Toast.LENGTH_LONG).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniBtns();

    }

    public void iniBtns() {

        btnConfig = (Button) findViewById(R.id.btn_main_config);
        btnApply = (Button) findViewById(R.id.btn_main_check);
        btnArriveTmp = (Button) findViewById(R.id.btn_main_arrive_tmp);
        btnArriveConstruct = (Button) findViewById(R.id.btn_main_arrive_construct);

        btnConfig.setOnClickListener(mBtnListener);
        btnApply.setOnClickListener(mBtnListener);
        btnArriveTmp.setOnClickListener(mBtnListener);
        btnArriveConstruct.setOnClickListener(mBtnListener);

    }

    private class MainButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            switch (v.getId()) {
                case R.id.btn_main_config:
                    intent.setClass(MainActivity.this, ConfigActivity.class);
                    testThread=new TestThread(TestHandler);
                    testThread.start();
                    break;
                case R.id.btn_main_check:
                    intent.setClass(MainActivity.this, ConfirmActivity.class);
                    break;
                case R.id.btn_main_arrive_tmp:
                    intent.setClass(MainActivity.this, ArrivalActivity.class);
                    intent.putExtra("function", 0);
                    break;
                case R.id.btn_main_arrive_construct:
                    intent.setClass(MainActivity.this, ArrivalActivity.class);
                    intent.putExtra("function", 1);
                    break;
            }
            startActivity(intent);
        }
    }
}
