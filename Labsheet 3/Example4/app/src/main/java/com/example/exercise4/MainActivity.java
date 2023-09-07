package com.example.exercise4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText town;
    Button read;
    Button write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editTextTextPersonName);
        town = findViewById(R.id.editTextTextPersonName2);
        read = findViewById(R.id.readbtn);
        write = findViewById(R.id.writebtn);

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences data1 = getSharedPreferences("details",MODE_PRIVATE);
                SharedPreferences.Editor editor = data1.edit();
                editor.putString("NAME", name.getText().toString());
                editor.putString("TOWN", town.getText().toString());
                editor.commit();
                Toast.makeText(getApplicationContext(),"Data stored",Toast.LENGTH_SHORT).show();
            }
        });

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences data2 = getSharedPreferences("details",MODE_PRIVATE);
                String name = data2.getString("NAME", "name not stored");
                String town = data2.getString("TOWN", "town not stored");
                Toast.makeText(getApplicationContext(),"Your name : "+name+" City : "+town,Toast.LENGTH_LONG).show();
            }
        });
    }
}