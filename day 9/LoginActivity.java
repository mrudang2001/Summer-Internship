package com.example.listdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
EditText etEmail,etPsw;
Button btnsignin,btnsignuup;
    public static final String main_key="myPref";
    public static final String email_key="emailkey";
    public static final String password_key="passwordkey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail=findViewById(R.id.etEmail);
        etPsw=findViewById(R.id.etPsw);
        btnsignin=findViewById(R.id.btnsignin);
        btnsignuup=findViewById(R.id.btnsignup);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String useremail, userpassword;
                useremail = etEmail.getText().toString();
                userpassword = etPsw.getText().toString();

                SharedPreferences preferences = getSharedPreferences(main_key, MODE_PRIVATE);
                String email = preferences.getString(email_key, "");
                String password = preferences.getString(password_key, "");

                if (useremail.equals(email) && userpassword.equals(password)) {
                    Intent i = new Intent(LoginActivity.this, DisplayActivity.class);
                    startActivity(i);

                } else {
                    Toast.makeText(LoginActivity.this, "Invalid email or password!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnsignuup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}