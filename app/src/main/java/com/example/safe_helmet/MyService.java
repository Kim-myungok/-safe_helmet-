package com.example.Safe_Helmet;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {


    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}