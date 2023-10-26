package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Name, Age, Gender, City, Email, Mobile;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.name);
        Age = findViewById(R.id.age);
        Gender = findViewById(R.id.gender);
        City = findViewById(R.id.city);
        Email = findViewById(R.id.email);
        Mobile = findViewById(R.id.mobile);
        submitButton = findViewById(R.id.submitbtn);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                String age = Age.getText().toString();
                String gender = Gender.getText().toString();
                String city = City.getText().toString();
                String mail = Email.getText().toString();
                String contact = Mobile.getText().toString();

                Toast.makeText(this, "Data entered successfully",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                intent.putExtra("gender", gender);
                intent.putExtra("city", city);
                intent.putExtra("mail", mail);
                intent.putExtra("contact", contact);

                startActivity(intent);
            }
        });
    }
}