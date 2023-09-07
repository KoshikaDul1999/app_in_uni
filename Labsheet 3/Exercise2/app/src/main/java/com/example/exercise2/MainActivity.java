package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstNameEditText, lastNameEditText;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameEditText = findViewById(R.id.fname);
        lastNameEditText = findViewById(R.id.lname);
        show = findViewById(R.id.showbtn);
    }

    public void showMsg(View view) {
        String firstname = firstNameEditText.getText().toString();
        String lastname = lastNameEditText.getText().toString();

        String fullName = firstname + " " + lastname;

        Toast.makeText(MainActivity.this, "Full Name : " + fullName, Toast.LENGTH_SHORT).show();
    }
}