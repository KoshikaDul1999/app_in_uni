package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
    EditText name;
    EditText dept;
    EditText salary;
    Button btnadd;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        name = findViewById(R.id.name);
        dept = findViewById(R.id.dept);
        salary = findViewById(R.id.salary);
        btnadd = findViewById(R.id.addbtn);
        dbHandler = new DBHandler(this);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String empName = name.getText().toString();
                String empDept = dept.getText().toString();
                String empSalary = salary.getText().toString();
                Employee emp = new Employee(empName, empDept, empSalary);
                dbHandler.addEmployee(emp);
                Toast.makeText(getApplicationContext(), "data inserted",Toast.LENGTH_LONG).show();
            }
        });
    }
}