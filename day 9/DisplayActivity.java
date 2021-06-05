package com.example.listdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
Button btnlogout;
TextView tv1,tv2,tv3;


    public static final String main_key="myPref";
    public static final String name_key="namekey";
    public static final String email_key="emailkey";
    public static final String contact_key="contactkey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        btnlogout=findViewById(R.id.btnlogout);

        SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);

        String name=preferences.getString(name_key,"");
        String  email=preferences.getString(email_key,"");
        String  contact=preferences.getString(contact_key,"");

        if (name!=null || email !=null || contact !=null){
            tv1.setText("Name:  "+name);
            tv2.setText("Email:  "+email);
            tv3.setText("Contact:  "+contact);

        }

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SharedPreferences.Editor editor=preferences.edit();
                editor.clear();
                editor.commit();
                finish();
                moveTaskToBack(true);


            }
        });
    }
}