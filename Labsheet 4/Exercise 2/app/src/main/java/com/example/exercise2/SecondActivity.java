package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText product1EditText, product2EditText, product3EditText, product4EditText, product5EditText;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        product1EditText = findViewById(R.id.p1);
        product2EditText = findViewById(R.id.p2);
        product3EditText = findViewById(R.id.p3);
        product4EditText = findViewById(R.id.p4);
        product5EditText = findViewById(R.id.p5);
        calculateButton = findViewById(R.id.calbtn);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total = calculateTotal();
                Intent resultIntent = new Intent();
                resultIntent.putExtra("total", total);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }

    private double calculateTotal(){
        double product1Price = Double.parseDouble(product1EditText.getText().toString());
        double product2Price = Double.parseDouble(product2EditText.getText().toString());
        double product3Price = Double.parseDouble(product3EditText.getText().toString());
        double product4Price = Double.parseDouble(product4EditText.getText().toString());
        double product5Price = Double.parseDouble(product5EditText.getText().toString());

        return product1Price + product2Price + product3Price + product4Price + product5Price;
    }
}