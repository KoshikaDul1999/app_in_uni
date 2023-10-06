package com.example.exercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        List<ListItem> itemList = new ArrayList<>();
        itemList.add(new ListItem("Cat",R.drawable.u24Stg));
        itemList.add(new ListItem("Dog",R.drawable.u24Stg));
        itemList.add(new ListItem("Elephant",R.drawable.u24Stg));
        itemList.add(new ListItem("Lion",R.drawable.u24Stg));
        itemList.add(new ListItem("Tiger",R.drawable.u24Stg));

        CustomAdapter adapter = new CustomAdapter(this, itemList);
        listView.setAdapter(adapter);
    }
}