package com.example.hamza.shutterup;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class signup extends AppCompatActivity {
   Button btn_signup;
    EditText editText_name,editText_email,editText_contactNo,editText_password;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btn_signup=(Button)findViewById(R.id.btn_signup);
        editText_name=(EditText) findViewById(R.id.editText_name);
        editText_email=(EditText) findViewById(R.id.editText_email);
        editText_contactNo=(EditText) findViewById(R.id.editText_contactNo);
        editText_password=(EditText) findViewById(R.id.editText_password);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.radioButton_customer:

                        break;
                    case R.id.radioButton_photographer:
                        break;

                }
            }
        });



    }
}
