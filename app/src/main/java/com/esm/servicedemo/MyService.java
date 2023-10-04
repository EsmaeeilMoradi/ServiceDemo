package com.esm.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        Log.e(getString(R.string.service_demo_tag), "  onDestroy: : Thread ID : " + Thread.currentThread().getId());

        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e(getString(R.string.service_demo_tag), "  onStartCommand: Thread ID : " + Thread.currentThread().getId());
        return super.onStartCommand(intent, flags, startId);
    }
}
