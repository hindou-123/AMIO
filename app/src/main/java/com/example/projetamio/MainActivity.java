package com.example.projetamio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.projetamio.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Création de l'activité");

        super.startService(new Intent(this, MainService.class));
        super.stopService(new Intent(this, MainService.class));
        //super.startService(new Intent("andro.jf.manageServiceAction"));
    }






}