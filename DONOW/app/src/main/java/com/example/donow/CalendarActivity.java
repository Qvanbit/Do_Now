package com.example.donow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class CalendarActivity extends AppCompatActivity {
    TextView Time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        Timer time = new Timer();
        final Handler handler = new Handler();
        final TextView textView = (TextView) findViewById(R.id.timeNow);
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
                final String strDate = simpleDateFormat.format(calendar.getTime());

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(strDate);
                    }
                });
            }
        }, 5000);

    }
}