package com.example.application_week2_ex1.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.application_week2_ex1.R;

public class Example1 extends AppCompatActivity {

    private TextView display;
    private Button click;
    private boolean isTextOne = true; // Initial state

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.textView);
        click = findViewById(R.id.button);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTextOne) {
                    display.setText("Welcome to Android Studio!!!");
                } else {
                    display.setText("Hello, World!");
                }

                isTextOne = !isTextOne;
            }
        });
    }
}