package com.example.exercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText name, city, username, password;
    Button signup, back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name = findViewById(R.id.name);
        city = findViewById(R.id.city);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        signup = findViewById(R.id.signup);
        back = findViewById(R.id.backbtn);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences data1 = getSharedPreferences("details",MODE_PRIVATE);
                SharedPreferences.Editor editor = data1.edit();
                editor.putString("NAME", name.getText().toString());
                editor.putString("CITY", city.getText().toString());
                editor.putString("USERNAME", username.getText().toString());
                editor.putString("PASSWORD", password.getText().toString());

                editor.commit();
                Toast.makeText(SignUpActivity.this, "DATA_SAVED",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}