package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String currentInput = "";
    private double result = 0;
    private String currentOperator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
    }

    public void onNumberClick(View view) {
        String value = ((Button) view).getText().toString();
        currentInput += value;
        updateDisplay();
    }

    public void onOperatorClick(View view) {
        String operator = ((Button) view).getText().toString();
        if (!currentInput.isEmpty()) {
            if (currentOperator.isEmpty()) {
                result = Double.parseDouble(currentInput);
            } else {
                result = performOperation(result, Double.parseDouble(currentInput), currentOperator);
            }
            currentInput = "";
            currentOperator = operator;
            updateDisplay();
        }
    }

    public void onEqualsClick(View view) {
        if (!currentInput.isEmpty() && !currentOperator.isEmpty()) {
            result = performOperation(result, Double.parseDouble(currentInput), currentOperator);
            currentInput = "";
            currentOperator = "";
            updateDisplay();
        }
    }

    public void onClearClick(View view) {
        currentInput = "";
        currentOperator = "";
        result = 0;
        updateDisplay();
    }

    private double performOperation(double operand1, double operand2, String oprator) {
        switch (oprator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return  operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    return Double.NaN;
                }
            default:
                return operand2;
        }
    }

    private void updateDisplay() {
        display.setText(currentInput.isEmpty() ? Double.toString(result) : currentInput);
    }

}