package com.example.application_week2_ex1.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.application_week2_ex1.R;

public class Exercise2 extends AppCompatActivity {

    EditText number1EditText, number2EditText;
    Button addButton, subtractButton, multiplyButton, divideButton, resetButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        number1EditText = findViewById(R.id.editTextTextPersonName4);
        number2EditText = findViewById(R.id.editTextTextPersonName5);
        addButton = findViewById(R.id.addbtn);
        subtractButton = findViewById(R.id.subbtn);
        multiplyButton = findViewById(R.id.mulbtn);
        divideButton = findViewById(R.id.divbtn);
        resetButton = findViewById(R.id.resetbtn);
        resultTextView = findViewById(R.id.result);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("+");
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("-");
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("*");
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("/");
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1EditText.setText("");
                number2EditText.setText("");
                resultTextView.setText("");
            }
        });
    }

    private void calculate(String operator) {
        double number1 = Double.parseDouble(number1EditText.getText().toString());
        double number2 = Double.parseDouble(number2EditText.getText().toString());
        double result = 0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 != 0){
                    result = number1 / number2;
                } else {
                    resultTextView.setText("Division by zero not allowed");
                    return;
                }
                break;
        }
        resultTextView.setText("Result: " + result);
    }
}