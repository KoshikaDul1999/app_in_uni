package com.example.exercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    EditText username,password;
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        username = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextTextPersonName2);
        signin = findViewById(R.id.signin);

        SharedPreferences data2 = getSharedPreferences("details", MODE_PRIVATE);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eusername = username.getText().toString();
                String epassword = password.getText().toString();

                String susername = data2.getString("USERNAME", "");
                String spassword = data2.getString("PASSWORD", "");

                if (eusername.equals(susername) && epassword.equals(spassword)){
                    Intent intent = new Intent(SignInActivity.this, LastActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(SignInActivity.this, "SignIn error", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}