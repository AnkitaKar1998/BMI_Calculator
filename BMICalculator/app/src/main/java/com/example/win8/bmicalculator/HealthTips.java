package com.example.win8.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HealthTips extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tips);
        getSupportActionBar().setTitle("Health Tips");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
