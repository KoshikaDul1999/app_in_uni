package com.example.application_week2_ex1.example3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.application_week2_ex1.R;

public class Example3Activity1 extends AppCompatActivity {
    Button go;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        go = (Button) findViewById(R.id.button3);
        intent = new Intent(this, Example3Activity2.class);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }
}