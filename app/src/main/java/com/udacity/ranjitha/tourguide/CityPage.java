package com.udacity.ranjitha.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CityPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new CityFragment())
                .commit();
    }
}