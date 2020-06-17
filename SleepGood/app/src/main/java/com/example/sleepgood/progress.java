package com.example.sleepgood;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class progress extends AppCompatActivity {
    static public int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        final EditText daytext = (EditText) findViewById(R.id.daytext);
        Button submitbutton = (Button) findViewById(R.id.submitbutton);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day = Integer.valueOf(daytext.getText().toString()) -1;
                if (checkdaytext()){}
                else openprogresscontinued();
            }
        });
    }
    public void openprogresscontinued(){
        Intent intent = new Intent(this,progresscontinued.class);
        startActivity(intent);
    }

    public boolean checkdaytext (){
        final EditText daytext = (EditText) findViewById(R.id.daytext);
        if (Integer.valueOf(daytext.getText().toString()) < 1 || Integer.valueOf(daytext.getText().toString()) > MainActivity.ranklist.size()){
                AlertDialog.Builder alert1 = new AlertDialog.Builder(this);
                alert1.setTitle("Wait");
                alert1.setMessage("Invalid Date. Please Try Again!");
                alert1.show();
                return true;

        }
        else return false;

    }
}
