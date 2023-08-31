package com.example.application_week2_ex1.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.application_week2_ex1.R;

public class Exercise1 extends AppCompatActivity {

    EditText num1Text;
    EditText num2Text;
    Button addBtn;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);
        num1Text = findViewById(R.id.editTextTextPersonName);
        num2Text = findViewById(R.id.editTextTextPersonName3);
        addBtn = findViewById(R.id.button7);
        answer = findViewById(R.id.textView12);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText((int) (Double.parseDouble(num1Text.getText().toString()) +Double.parseDouble(num2Text.getText().toString()))) ;
            }
        });
    }
}