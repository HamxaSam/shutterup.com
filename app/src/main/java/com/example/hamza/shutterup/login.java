package com.example.hamza.shutterup;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hamza.shutterup.listOptionSelect.tab;

public class login extends AppCompatActivity {
TextView   textView_website,textView_SignUp;
    Intent intent;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView_website =(TextView)findViewById(R.id.textView_website);
        textView_SignUp =(TextView)findViewById(R.id.textView_SignUp);
        login =(Button)findViewById(R.id.btn_login);

        textView_website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });

        textView_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),signup.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplication(), tab.class);
                startActivity(intent);

            }
        });

    }
}
