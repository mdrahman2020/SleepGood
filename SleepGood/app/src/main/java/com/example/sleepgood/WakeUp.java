package com.example.sleepgood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Calendar;

public class WakeUp extends AppCompatActivity {

    private int end;
    private int timeelapsed;
    static public String Sleeprank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);
        Button wakebutton = (Button) findViewById(R.id.wakebutton);
        wakebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stime = RecordSleep.getStart();
                end = Calendar.getInstance().getTime().getHours();
                timeelapsed = end - stime;
                setSleepScore();
                MainActivity.ranklist.add(Sleeprank);
                openSleeprankanouncment();
            }
        });
    }

    public void setSleepScore(){
        if(timeelapsed <= 2 ){
            Sleeprank = "Owl";
        }
        else if (timeelapsed >2 && timeelapsed <=6){
            Sleeprank = "Giraffe";
        }
        else if(timeelapsed>6 && timeelapsed <= 9){
            Sleeprank = "Panda";
        }
        else{
            Sleeprank = "Sloth";
        }
    }

    public void openSleeprankanouncment(){
        Intent intent = new Intent(this,Sleeprankanouncment.class);
        startActivity(intent);
    }

}

