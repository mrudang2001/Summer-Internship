package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent i=getIntent();
        String name=i.getStringExtra("Name");
        String email=i.getStringExtra("Email");
        String password=i.getStringExtra("Password");
        String phone=i.getStringExtra("Phone");
        String gender=i.getStringExtra("Gender");
        String hobbie=i.getStringExtra("Hobbie");

        tvDisplay=findViewById(R.id.tvDisplay);

        tvDisplay.setText("Name: "+name+ "\nEmail: "+email+"\nPassword:"+password+"\nPhone:"+phone+"\nGender: "+gender+"\nHobbie"+hobbie);

    }
}