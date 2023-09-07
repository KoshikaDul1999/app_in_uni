package com.example.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static  final String MAIN_ACTIVITY_TAG = MainActivity.class.getSimpleName();

    private void showlog(String text){
        Log.d(MAIN_ACTIVITY_TAG, text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showlog("Activity Created");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showlog("Activity restarted");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showlog("Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showlog("Activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showlog("Activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showlog("Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showlog("Activity destroyed");
    }
}