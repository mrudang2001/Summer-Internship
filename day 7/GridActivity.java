package com.example.listtype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class GridActivity extends AppCompatActivity {
GridView gv1;
String course[]={"C++","java","Android",".Net","Python","Json","HTML","css","C","PHP","JAVASCRIPT","Node js"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        gv1=findViewById(R.id.gv1);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,course);
        gv1.setAdapter(arrayAdapter);

        gv1.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(getApplicationContext(),course[position], Toast.LENGTH_SHORT).show();

        });
    }
}