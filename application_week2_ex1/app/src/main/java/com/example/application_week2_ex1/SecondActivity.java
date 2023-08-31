package com.example.application_week2_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView name;
    TextView city;
    Intent intent;
    String data_name;
    String data_city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name = (TextView) findViewById(R.id.textView6);
        city = (TextView) findViewById(R.id.textView7);
        intent = getIntent();
        data_name = intent.getStringExtra("Name");
        data_city = intent.getStringExtra("City");
        name.setText(data_name);
        city.setText(data_city);
    }
}