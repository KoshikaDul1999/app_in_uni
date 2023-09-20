package com.example.exercise4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openEmailClient(View view) {
        TextView emailTextView = (TextView) findViewById(R.id.email);
        String emailAddress = emailTextView.getText().toString().split(": ")[1];
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + emailAddress));
        startActivity(intent);
    }

    public void openDialer(View view) {
        TextView phoneTextView = (TextView) findViewById(R.id.phone);
        String phoneNumber = phoneTextView.getText().toString().split(": ")[1]; // Extract phone number
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        startActivity(intent);
    }

}