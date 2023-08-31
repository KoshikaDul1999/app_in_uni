package com.example.application_week2_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    Button go;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        go = (Button) findViewById(R.id.button5);
        intent = new Intent(this, SecondActivity.class);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Name", "Koshika");
                intent.putExtra("City", "Horana");
                startActivity(intent);
            }
        });
    }
}