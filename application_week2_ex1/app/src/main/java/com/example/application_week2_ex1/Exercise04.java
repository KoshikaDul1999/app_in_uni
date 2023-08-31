package com.example.application_week2_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exercise04 extends AppCompatActivity {

    Button show;
    EditText input;
    TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise04);
        input = (EditText) findViewById(R.id.editTextTextPersonName2);
        show = (Button) findViewById(R.id.button4);
        output = (TextView) findViewById(R.id.textView5);
        show.setOnClickListener();
    }
}