package com.example.listdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etName,etEmail,etPsw,etNumber;
Button btnsignup;

    public static final String main_key="myPref";
    public static final String name_key="namekey";
    public static final String email_key="emailkey";
    public static final String password_key="passwordkey";
    public static final String contact_key="contactkey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=findViewById(R.id.etName);
        etEmail=findViewById(R.id.etEmail);
        etPsw=findViewById(R.id.etPsw);
        etNumber=findViewById(R.id.etNumber);
        btnsignup=findViewById(R.id.btnsignup);

    btnsignup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);
            String name,email,password,contact;
             name=etName.getText().toString();
             email=etEmail.getText().toString();
             password=etPsw.getText().toString();
             contact=etNumber.getText().toString();

             SharedPreferences.Editor editor=preferences.edit();
             editor.putString(name_key,name);
            editor.putString(email_key,email);
            editor.putString(password_key,password);
            editor.putString(contact_key,contact);

            editor.commit();

            Intent i=new Intent(MainActivity.this,LoginActivity.class);
            startActivity(i);



        }
    });



    }

}