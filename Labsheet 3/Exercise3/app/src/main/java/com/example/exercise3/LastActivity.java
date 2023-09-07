package com.example.exercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    TextView jname, jcity;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        jname = findViewById(R.id.usrname);
        jcity = findViewById(R.id.citytext);

        sharedPreferences = getSharedPreferences("details", MODE_PRIVATE);

        String sname = sharedPreferences.getString("NAME", "");
        String scity = sharedPreferences.getString("CITY", "");

        jname.setText("Name : " + jname);
        jcity.setText("City : " + scity);
    }
}