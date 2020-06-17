package com.example.sleepgood;

import java.security.PublicKey;

public class Question {

    private String q1;
    private String q2;
    private String q3;
    private String q4;

    public Question(){
        q1= "no";
        q2 = "no";
        q3 = "no";
        q4 = "no";
        }

    public String getq1(){
        return q1;
    }
    public String getq2(){
        return q2;
    }
    public String getq3(){
        return q3;
    }
    public String getq4(){
        return q4;
    }

    public void setq1(String x){
        this.q1 =x;
    }
    public void setq2(String x){
        this.q2 = x;
    }
    public void setq3(String x){
        this.q3 =x;
    }
    public void setq4(String x){
        this.q4 =x;
    }

}
