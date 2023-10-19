package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertActivity extends AppCompatActivity {
    EditText name;
    EditText age;
    EditText address;
    EditText department;
    Button btninsert;
    DBHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        address = findViewById(R.id.address);
        department = findViewById(R.id.department);
        btninsert = findViewById(R.id.addbtn);
        dbHandler = new DBHandler(this);
        btninsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stuName = name.getText().toString();
                String stuAge = age.getText().toString();
                String stuAddress = address.getText().toString();
                String stuDept = department.getText().toString();
                Student stu = new Student(stuName, stuAge, stuAddress, stuDept);
                dbHandler.addStudent(stu);
                Toast.makeText(getApplicationContext(), "Data insert successfully", Toast.LENGTH_LONG).show();
            }
        });
    }
}