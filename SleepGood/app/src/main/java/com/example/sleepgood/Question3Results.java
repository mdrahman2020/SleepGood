package com.example.sleepgood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Question3Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3_results);

        TextView d3text = (TextView) findViewById(R.id.dayQ3text);
        d3text.setText("Day: " +Integer.toString(Sleepfactor.day +1));
        TextView c1text = (TextView) findViewById(R.id.Q3c1txt);
        TextView c2text = (TextView) findViewById(R.id.Q3c2txt);
        TextView c3text = (TextView) findViewById(R.id.Q3c3txt);
        TextView c4text = (TextView) findViewById(R.id.Q3c4txt);

        c1text.setText(MainActivity.Question3list.get(Sleepfactor.day).getq1());
        c2text.setText(MainActivity.Question3list.get(Sleepfactor.day).getq2());
        c3text.setText(MainActivity.Question3list.get(Sleepfactor.day).getq3());
        c4text.setText(MainActivity.Question3list.get(Sleepfactor.day).getq4());
    }
}
