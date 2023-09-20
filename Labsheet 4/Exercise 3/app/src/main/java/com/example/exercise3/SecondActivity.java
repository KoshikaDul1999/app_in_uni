package com.example.exercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText colorCodeEditText;
    private Button confirmButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        colorCodeEditText = findViewById(R.id.colorcode);
        confirmButton = findViewById(R.id.confirmbtn);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colorCode = colorCodeEditText.getText().toString();
                String selectedCylinder = matchColorCode(colorCode);

                Intent resultIntent = new Intent();
                resultIntent.putExtra("selectedCylinder", selectedCylinder);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }

    private String matchColorCode(String colorCode) {
        switch (colorCode.toLowerCase()) {
            case "red":
                return "Hydrogen (Red)";
            // Add more cases for other color codes and cylinders
            default:
                return "Unknown Cylinder";
        }
    }

}