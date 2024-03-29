package com.gzeinnumer.androidjetpacklifecycleaware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: Owner");
        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: Owner");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: Owner");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: Owner");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: Owner");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: Owner");
    }
}
