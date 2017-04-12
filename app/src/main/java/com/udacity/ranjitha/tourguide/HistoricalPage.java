package com.udacity.ranjitha.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HistoricalPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new HistoricalFragment())
                .commit();
    }
}

