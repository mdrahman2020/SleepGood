package com.example.sleepgood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Question2Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2_results);

        TextView dtext = (TextView) findViewById(R.id.dayq2text);
        dtext.setText("Day: " +Integer.toString(Sleepfactor.day +1));
        TextView c1text = (TextView) findViewById(R.id.Q2sfc1);
        TextView c2text = (TextView) findViewById(R.id.Q2sfC2);
        TextView c3text = (TextView) findViewById(R.id.Q2sfc3);
        TextView c4text = (TextView) findViewById(R.id.Q2sfc4);

        c1text.setText(MainActivity.Question2list.get(Sleepfactor.day).getq1());
        c2text.setText(MainActivity.Question2list.get(Sleepfactor.day).getq2());
        c3text.setText(MainActivity.Question2list.get(Sleepfactor.day).getq3());
        c4text.setText(MainActivity.Question2list.get(Sleepfactor.day).getq4());
    }
}
