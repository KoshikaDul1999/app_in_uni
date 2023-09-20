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
                String cylinderInfo = getCylinderInfo(colorCode);

                Intent resultIntent = new Intent();
                resultIntent.putExtra("CYLINDERINFO", cylinderInfo);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }

    private String getCylinderInfo(String colorCode) {
        String fcylinderInfo;

        switch (colorCode) {
            case "red":
                fcylinderInfo = "Red Cylinder";
                break;
            case "black":
                fcylinderInfo = "Black Cylinder";
                break;
            case "yellow":
                fcylinderInfo = "Yellow Cylinder";
                break;
            case "blue":
                fcylinderInfo = "Blue Cylinder";
                break;
            case "white":
                fcylinderInfo = "White Cylinder";
                break;
            default:
                return "Unknown Cylinder";
        }
        return fcylinderInfo;
    }

}