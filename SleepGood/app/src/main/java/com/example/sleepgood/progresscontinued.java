package com.example.sleepgood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class progresscontinued extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progresscontinued);

        TextView daytext = (TextView) findViewById(R.id.dtext);
        daytext.setText("Day: " +Integer.toString(progress.day +1));
        TextView ranktext = (TextView) findViewById(R.id.progtext);
        ranktext.setText(MainActivity.ranklist.get(progress.day));

    }
}
