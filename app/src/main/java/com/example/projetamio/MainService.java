package com.example.projetamio;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.TimerTask;
import java.util.Timer;
import android.os.Handler;
import android.widget.Toast;


public class MainService extends Service {
    Timer timer;
    TimerTask task;
    public MainService() {
    }

    public void onCreate() {
        // Création du service
        Log.d("MainActivity","onCreate()");
        timer = new Timer();
    }

    public void onDestroy() {
        // Destruction du service
        Log.d("MainActivity","onDestroy()");
        timer.cancel();
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        // Démarrage du service
        Log.d("MainActivity","onStartCommand()");
        final Handler handler = new Handler();
        task = new TimerTask() {
            public void run() {
                handler.post(new Runnable() {
                    public void run() {
                        Toast.makeText(MainService.this, "plop !", Toast.LENGTH_SHORT).show();
                        Log.d("MainActivity","Timer successful");
                    } });
            }};
        timer.schedule(task, 0, 30);
        return START_STICKY;
    }
    public IBinder onBind(Intent arg0) {
        return null;
    }




}