package com.example.example3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView simpleListView;

    String[] animalName = {"Rabbit", "Squirrel", "Dog", "Tiger", "Elephant", "Deer"};
    int[] animalImages = {R.drawable.ani1, R.drawable.ani2, R.drawable.ani3, R.drawable.ani4, R.drawable.ani5, R.drawable.ani6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListView = findViewById(R.id.simpleListView);
        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
        for (int i=0; i<animalName.length;i++)
        {
            HashMap<String,String> hashMap = new HashMap<>();
            hashMap.put("name",animalName[i]);
            hashMap.put("image",animalImages[i]+"");
            arrayList.add(hashMap);
        }

        String[] from = {"name","image"};
        int[] to = {R.id.textView, R.id.imageView};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, arrayList, R.layout.list_view_items, from, to);
        simpleListView.setAdapter(simpleAdapter);

        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), animalName[i], Toast.LENGTH_LONG).show();
            }
        });
    }
}