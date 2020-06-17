package com.example.sleepgood;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Sleepfactor extends AppCompatActivity {
    static public int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleepfactor);


        final EditText daytext1 = (EditText) findViewById(R.id.editTextsf);

        final Button submit1button = (Button) findViewById(R.id.Question1button);
        submit1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day = Integer.valueOf(daytext1.getText().toString()) -1;
                if (checkdaytext(MainActivity.Question1list)){return;}
                else openQuestion1results();
            }
        });

        final Button submit2button = (Button) findViewById(R.id.Question2button);
        submit2button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            day = Integer.valueOf(daytext1.getText().toString()) -1;
            if (checkdaytext(MainActivity.Question2list)){return;}
            else openQuestion2results();
        }
    });
        final Button submit3button = (Button) findViewById(R.id.Question3Button);
        submit3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day = Integer.valueOf(daytext1.getText().toString()) -1;
                if (checkdaytext(MainActivity.Question3list)){return;}
                else openQuestion3results();
            }
        });

    }

    public boolean checkdaytext (ArrayList Somelist){
        final EditText daytext = (EditText) findViewById(R.id.editTextsf);
        if (Integer.valueOf(daytext.getText().toString()) < 1 || Integer.valueOf(daytext.getText().toString()) > Somelist.size()){
            AlertDialog.Builder alert1 = new AlertDialog.Builder(this);
            alert1.setTitle("Wait");
            alert1.setMessage("Invalid Date. Please Try Again!");
            alert1.show();
            return true;
        }
        else return false;
    }


    public void openQuestion1results(){
        Intent intent = new Intent(this,Question1results.class);
        startActivity(intent);
    }

    public void openQuestion2results(){
        Intent intent = new Intent(this,Question2Results.class);
        startActivity(intent);
    }

    public void openQuestion3results(){
        Intent intent = new Intent(this,Question3Results.class);
        startActivity(intent);
    }



}
