package com.example.application_week2_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exercise04 extends AppCompatActivity {

    Button displaybtn;
    EditText input;
    TextView displayView;
    String data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise04);
        input = (EditText) findViewById(R.id.editTextTextPersonName2);
        displaybtn = (Button) findViewById(R.id.button4);
        displayView = (TextView) findViewById(R.id.textView5);
        displaybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                displayView.setText(data);
            }
        });
    }
}