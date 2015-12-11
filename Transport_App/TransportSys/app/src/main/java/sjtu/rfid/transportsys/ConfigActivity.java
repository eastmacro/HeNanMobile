package sjtu.rfid.transportsys;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ConfigActivity extends Activity {

    private CheckBox checkBoxApply;
    private CheckBox checkBoxTempCharge;
    private CheckBox checkBoxConstructCharge;
    private CheckBoxOnClickListener mCheckBoxListener;
    private Button btnSave;
    private int checked = 0;
    private String name;
    private String phone;
    private String company;
    private String role;

    class CheckBoxOnClickListener implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            CheckBox tmp = (CheckBox) findViewById(checked);
            if( checked == 0 ) {
                checked = buttonView.getId();
            } else if( checked != buttonView.getId() ){
                tmp.setChecked(false);
                checked = buttonView.getId();
            } else if( checked == buttonView.getId() ) {
                tmp.setChecked(false);
                checked = 0;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        TextView title = (TextView) findViewById(R.id.text_title);
        title.setText("配置信息");
        iniBtns();
        iniCheckBox();
        iniInfo();
    }

    public void iniBtns() {
        final Button btnBack = (Button) findViewById(R.id.btn_title_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnSave = (Button) findViewById(R.id.btn_config_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ((EditText) findViewById(R.id.editext_config_name)).getText().toString();
                String phone = ((EditText) findViewById(R.id.edittext_config_phone)).getText().toString();
                String company = ((EditText) findViewById(R.id.edittext_config_company)).getText().toString();
                if (name.equals("") || phone.equals("") || company.equals("") || checked == 0)
                    Toast.makeText(getApplicationContext(), "您未完成全部信息的填选！", Toast.LENGTH_SHORT).show();
                else {
                    String role = "";
                    switch (checked) {
                        case R.id.checkbox_config_apply:
                            role = "1";
                            break;
                        case R.id.checkbox_config_temporary:
                            role = "2";
                            break;
                        case R.id.checkbox_config_construct:
                            role = "3";
                            break;
                    }
                }
            }
        });
    }

    public void iniCheckBox() {
        mCheckBoxListener = new CheckBoxOnClickListener();
        checkBoxApply = (CheckBox) findViewById(R.id.checkbox_config_apply);
        checkBoxTempCharge = (CheckBox) findViewById(R.id.checkbox_config_temporary);
        checkBoxConstructCharge = (CheckBox) findViewById(R.id.checkbox_config_construct);
        checkBoxApply.setOnCheckedChangeListener(mCheckBoxListener);
        checkBoxTempCharge.setOnCheckedChangeListener(mCheckBoxListener);
        checkBoxConstructCharge.setOnCheckedChangeListener(mCheckBoxListener);
    }

    public void iniInfo() {
        InputStream inputStream = getResources().openRawResource(R.raw.info);
        InputStreamReader inputStreamReader = null;
        try{
            inputStreamReader = new InputStreamReader(inputStream,"UTF-8");
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line;
            if( (line = reader.readLine()) != null ) {
                name = line;
                phone = reader.readLine();
                company = reader.readLine();
                role = reader.readLine();
                ((EditText)findViewById(R.id.editext_config_name)).setText(name.toCharArray(),0,name.length());
                ((EditText)findViewById(R.id.edittext_config_phone)).setText(phone.toCharArray(),0,phone.length());
                ((EditText)findViewById(R.id.edittext_config_company)).setText(company.toCharArray(),0,company.length());
                switch (role) {
                    case "1":
                        checkBoxApply.setChecked(true);
                        checked = checkBoxApply.getId();
                        break;
                    case "2":
                        checkBoxTempCharge.setChecked(true);
                        checked = checkBoxTempCharge.getId();
                        break;
                    case "3":
                        checkBoxConstructCharge.setChecked(true);
                        checked = checkBoxConstructCharge.getId();
                        break;
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
