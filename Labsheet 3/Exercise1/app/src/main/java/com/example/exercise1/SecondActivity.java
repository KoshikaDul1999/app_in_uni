package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText name,index_number,department, faculty;
    Button ok;
    Bundle bundle;
    Intent check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ok = findViewById(R.id.okbtn);
        name = findViewById(R.id.name);
        index_number = findViewById(R.id.indexnumber);
        department = findViewById(R.id.department);
        faculty = findViewById(R.id.faculty);
        check = new Intent(this, ThirdActivity.class);
        bundle = new Bundle();
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putString("NAME", name.getText().toString());
                bundle.putString("INDEXNUMBER",index_number.getText().toString());
                bundle.putString("DEPARTMENT",department.getText().toString());
                bundle.putString("FACULTY", faculty.getText().toString());
                check.putExtras(bundle);
                startActivity(check);
            }
        });

    }
}