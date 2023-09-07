package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView name;
    TextView address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        name = findViewById(R.id.textViewname);
        address = findViewById(R.id.textViewaddress);
        Intent content = getIntent();
        Bundle get = content.getExtras();
        String name2 = get.getString("NAME");
        String address2 = get.getString("ADDRESS");
        name.setText(name2);
        address.setText(address2);
    }
}