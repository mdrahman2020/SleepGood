package com.example.sleepgood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.format.Time;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Date;
import java.time.LocalTime;
import java.util.Calendar;

public class RecordSleep extends AppCompatActivity {

    static private int start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_sleep);
        Button sleepbutton = (Button) findViewById(R.id.sleepbutton);
        sleepbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start = Calendar.getInstance().getTime().getHours();
                openWakeUp();
            }
        });
    }
    public void openWakeUp(){
        Intent intent = new Intent(this,WakeUp.class);
        startActivity(intent);
    }

    static public int getStart(){
        return start;
    }


}

