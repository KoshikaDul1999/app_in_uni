package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name, address;
    Button login;
    Bundle bundle;
    Intent check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.submitbtn);
        name = findViewById(R.id.editTextTextPersonName);
        address = findViewById(R.id.editTextTextPersonName2);
        check = new Intent(this, Activity2.class);
        bundle = new Bundle();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putString("NAME", name.getText().toString());
                bundle.putString("ADDRESS", address.getText().toString());
                check.putExtras(bundle);
                startActivity(check);
            }
        });
    }
}