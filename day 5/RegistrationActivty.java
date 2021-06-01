package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivty extends AppCompatActivity {
Button btnDisplay;
EditText etname;
EditText etEmail;
EditText etPhone;
    EditText etPsw;
    EditText etGender;
    EditText etHobbie;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_activty);
        btnDisplay=findViewById(R.id.btnDisplay);
        etname=findViewById(R.id.etname);
        etEmail=findViewById(R.id.etEmail);
        etGender=findViewById(R.id.etGender);
        etPhone=findViewById(R.id.etPhone);
        etPsw=findViewById(R.id.etPsw);
        etHobbie=findViewById(R.id.etHobbie);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etname.getText().toString();
                String email=etEmail.getText().toString();
                String phone=etPhone.getText().toString();
                String password=etPsw.getText().toString();
                String gender=etGender.getText().toString();
                String hobbie=etHobbie.getText().toString();


                Intent i= new Intent(RegistrationActivty.this,DisplayActivity.class);

                i.putExtra("Name", name);
                i.putExtra("Email", email);
                i.putExtra("phone", phone);
                i.putExtra("Password", password);
                i.putExtra("Gender", gender);
                i.putExtra("Hobbie", hobbie);
                startActivity(i);



            }
        });
    }
}