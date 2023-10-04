package com.esm.servicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent serviceIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(getString(R.string.service_demo_tag), " MainActivity onCreate: Thread ID : " + Thread.currentThread().getId());


        serviceIntent = new Intent(getApplicationContext(), MyService.class);


        findViewById(R.id.buttonBindService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(serviceIntent);
            }
        });

        findViewById(R.id.buttonUnBindService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(serviceIntent);

            }
        });

    }
}