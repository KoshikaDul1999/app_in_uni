package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText link;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        link = findViewById(R.id.editTextTextPersonName);
        go = findViewById(R.id.gobtn);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                link.getText().toString();
                Linkify.addLinks(link, Linkify.WEB_URLS);
            }
        });
    }
}

