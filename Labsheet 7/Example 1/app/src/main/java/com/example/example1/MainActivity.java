package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView simpleGrid;

    int animals[] = {R.drawable.ani1, R.drawable.ani2,R.drawable.ani3, R.drawable.ani4, R.drawable.ani5, R.drawable.ani6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleGrid = findViewById(R.id.grid);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), animals);
        simpleGrid.setAdapter(customAdapter);
    }
}