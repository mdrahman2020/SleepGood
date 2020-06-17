package com.example.sleepgood;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SurveyContinued extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_continued);


        Button finishbutton = (Button) findViewById(R.id.Finish);
        finishbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Question Q3 = new Question();
                if (checkQuestion3()){return;}
                else
                    OpenRecordSleep();
                    setQuestion3(Q3);
                    MainActivity.Question3list.add(Q3);
            }
        });

    }

    void OpenRecordSleep (){
        Intent intent = new Intent(this,RecordSleep.class);
        startActivity(intent);

    }

    public boolean checkQuestion3() {
        Button continuebutton = (Button) findViewById(R.id.con1);
        CheckBox q3c1 = (CheckBox) findViewById(R.id.q3c1);
        CheckBox q3c2 = (CheckBox) findViewById(R.id.q3c2);
        CheckBox q3c3 = (CheckBox) findViewById(R.id.q3c3);
        CheckBox q3c4 = (CheckBox) findViewById(R.id.q3c4);
        CheckBox q3c5 = (CheckBox) findViewById(R.id.q3c5);


        if (q3c1.isChecked() == false && q3c2.isChecked() == false && q3c3.isChecked() == false && q3c4.isChecked() == false && q3c5.isChecked() == false) {
            AlertDialog.Builder alert1 = new AlertDialog.Builder(this);
            alert1.setTitle("Wait");
            alert1.setMessage("Please Answer Question 3!");
            alert1.show();
            return true;
        }
        else return false;

    }

    public void setQuestion3 (Question Q){
        CheckBox q3c1 = (CheckBox) findViewById(R.id.q3c1);
        CheckBox q3c2 = (CheckBox) findViewById(R.id.q3c2);
        CheckBox q3c3 = (CheckBox) findViewById(R.id.q3c3);
        CheckBox q3c4 = (CheckBox) findViewById(R.id.q3c4);

        if(q3c1.isChecked()){
            Q.setq1("Yes");
        }
        if (q3c2.isChecked()){
            Q.setq2("Yes");
        }
        if (q3c3.isChecked()){
            Q.setq3("Yes");
        }
        if (q3c4.isChecked()){
            Q.setq4("Yes");
        }
        else {}

    }


}
