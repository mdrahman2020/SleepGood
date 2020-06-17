package com.example.sleepgood;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
public class Survey extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        Button continuebutton = (Button) findViewById(R.id.con1);
        continuebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Question Q1 = new Question();
                Question Q2 = new Question();
                if (checkQuestion1()){return;}
                else if (checkQuestion2()){return;}
                else
                    openSurveyContinued();
                    setQuestion1(Q1);
                    setQuestion2(Q2);
                    MainActivity.Question1list.add(Q1);
                    MainActivity.Question2list.add(Q2);
            }
        });

    }

    public void openSurveyContinued() {
        Intent intent = new Intent(this, SurveyContinued.class);
        startActivity(intent);
    }

    public boolean checkQuestion1() {
        CheckBox q1c1 = (CheckBox) findViewById(R.id.q1c1);
        CheckBox q1c2 = (CheckBox) findViewById(R.id.q1c2);
        CheckBox q1c3 = (CheckBox) findViewById(R.id.q1c3);
        CheckBox q1c4 = (CheckBox) findViewById(R.id.q1c4);

        if (q1c1.isChecked() == false && q1c2.isChecked() == false && q1c3.isChecked() == false && q1c4.isChecked() == false) {
            AlertDialog.Builder alert1 = new AlertDialog.Builder(this);
            alert1.setTitle("Wait");
            alert1.setMessage("Please Answer Question 1!");
            alert1.show();
            return true;

        }
        else return false;

    }
    public boolean checkQuestion2() {
        CheckBox q2c1 = (CheckBox) findViewById(R.id.q2c1);
        CheckBox q2c2 = (CheckBox) findViewById(R.id.q2c2);
        CheckBox q2c3 = (CheckBox) findViewById(R.id.q2c3);
        CheckBox q2c4 = (CheckBox) findViewById(R.id.q2c4);


        if (q2c1.isChecked() == false && q2c2.isChecked() == false && q2c3.isChecked() == false && q2c4.isChecked() == false) {
            AlertDialog.Builder alert1 = new AlertDialog.Builder(this);
            alert1.setTitle("Wait");
            alert1.setMessage("Please Answer Question 2!");
            alert1.show();
            return true;

        }
        else return false;

    }

    public void setQuestion1 (Question Q1){
        CheckBox q1c1 = (CheckBox) findViewById(R.id.q1c1);
        CheckBox q1c2 = (CheckBox) findViewById(R.id.q1c2);
        CheckBox q1c3 = (CheckBox) findViewById(R.id.q1c3);
        CheckBox q1c4 = (CheckBox) findViewById(R.id.q1c4);

        if(q1c1.isChecked()){
            Q1.setq1("Yes");
        }
        if (q1c2.isChecked()){
            Q1.setq2("Yes");
        }
        if (q1c3.isChecked()){
            Q1.setq3("Yes");
        }
        if (q1c4.isChecked()){
            Q1.setq4("Yes");
        }
        else {}

    }

    public void setQuestion2 (Question Q1){
        CheckBox q2c1 = (CheckBox) findViewById(R.id.q2c1);
        CheckBox q2c2 = (CheckBox) findViewById(R.id.q2c2);
        CheckBox q2c3 = (CheckBox) findViewById(R.id.q2c3);
        CheckBox q2c4 = (CheckBox) findViewById(R.id.q2c4);

        if(q2c1.isChecked()){
            Q1.setq1("Yes");
        }
        if (q2c2.isChecked()){
            Q1.setq2("Yes");
        }
        if (q2c3.isChecked()){
            Q1.setq3("Yes");
        }
        if (q2c4.isChecked()){
            Q1.setq4("Yes");
        }
        else {}

    }
}
