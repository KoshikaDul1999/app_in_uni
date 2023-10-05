package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectFragment(View view) {
        Fragment fr;

        if (view == findViewById(R.id.button1)) {
            fr = new fragment_one();
        }

        else {
            fr = new fragment_two();
        }

        FragmentManager fm = getFragmentManager();

        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        FragmentTransaction.replace(R.id.fragment_section, fr);

        fragmentTransaction.commit();
    }
}