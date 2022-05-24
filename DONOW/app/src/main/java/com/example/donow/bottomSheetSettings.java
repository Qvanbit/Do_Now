package com.example.donow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.Chronometer;

public class bottomSheetSettings extends AppCompatActivity {
    Chronometer Chronometer;
    Button start, stop, restart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet_settings);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        Chronometer = (Chronometer) findViewById(R.id.Chronometer);
        start = (Button) findViewById(R.id.startButton);
        stop = (Button) findViewById(R.id.stopButton);
        restart = (Button) findViewById(R.id.restartButton);
        start.setOnClickListener((view->Chronometer.start()));
        stop.setOnClickListener(view -> Chronometer.stop());
        restart.setOnClickListener(view ->Chronometer
                .setBase(SystemClock.elapsedRealtime()));
    }
}