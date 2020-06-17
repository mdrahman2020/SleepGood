package com.example.sleepgood;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static public ArrayList<String> ranklist = new ArrayList<>();
    static public ArrayList<Question> Question1list = new ArrayList<>();
    static public ArrayList<Question> Question2list = new ArrayList<>();
    static public ArrayList<Question> Question3list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        Button nextbutton = (Button) findViewById(R.id.next);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSurvey();

            }
        });

        final Button myprogressbutton = (Button) findViewById(R.id.progress);
        myprogressbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkzerosize(ranklist) == true) {}
                else openProgress();
            }
        });

        final Button sfbtn = (Button) findViewById(R.id.sfbtn);
        sfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkzerosize(Question1list) || checkzerosize(Question2list) || checkzerosize(Question3list)) {}
                else openSleepfactor();
            }
        });

    }

    public boolean checkzerosize(ArrayList Somelist){
        if(Somelist.size() == 0 ){
        AlertDialog.Builder alert1 = new AlertDialog.Builder(this);
        alert1.setTitle("WHOA");
        alert1.setMessage("You dont have any progress yet. Click Next!");
        alert1.show();
        return true;
        }
        else return false;

    }

    public void openSurvey(){
        Intent intent = new Intent(this,Survey.class);
        startActivity(intent);
    }

    public void openProgress(){
        Intent intent = new Intent(this,progress.class);
        startActivity(intent);
    }
    public void openSleepfactor(){
        Intent intent = new Intent(this,Sleepfactor.class);
        startActivity(intent);
    }

}
