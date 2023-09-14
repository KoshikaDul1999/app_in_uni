package com.example.example03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        link = findViewById(R.id.text1);
        link.setText("Android.com is the official website for Android");
        Linkify.addLinks(link, Linkify.WEB_URLS);
    }
}