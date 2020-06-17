package com.example.sleepgood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Question1results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1results);

        TextView dtext = (TextView) findViewById(R.id.q1dtext);
        dtext.setText("Day: " +Integer.toString(Sleepfactor.day +1));
        TextView c1text = (TextView) findViewById(R.id.Q1C1txt);
        TextView c2text = (TextView) findViewById(R.id.Q1C2txt);
        TextView c3text = (TextView) findViewById(R.id.Q1C3txt);
        TextView c4text = (TextView) findViewById(R.id.Q1C4txt);

        c1text.setText(MainActivity.Question1list.get(Sleepfactor.day).getq1());
        c2text.setText(MainActivity.Question1list.get(Sleepfactor.day).getq2());
        c3text.setText(MainActivity.Question1list.get(Sleepfactor.day).getq3());
        c4text.setText(MainActivity.Question1list.get(Sleepfactor.day).getq4());

    }
}
