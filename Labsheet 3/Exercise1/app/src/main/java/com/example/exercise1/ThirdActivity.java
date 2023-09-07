package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView username,indexnum,dep,fac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        username = findViewById(R.id.usrname);
        indexnum = findViewById(R.id.index);
        dep = findViewById(R.id.dept);
        fac = findViewById(R.id.fac);
        Intent content = getIntent();
        Bundle get = content.getExtras();
        String name = get.getString("NAME");
        String indexNumber = get.getString("INDEXNUMBER");
        String department = get.getString("DEPARTMENT");
        String faculty = get.getString("FACULTY");
        username.setText(name);
        indexnum.setText(indexNumber);
        dep.setText(department);
        fac.setText(faculty);
    }
}