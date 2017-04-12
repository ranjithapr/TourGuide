package com.udacity.ranjitha.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MythologyPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MythologyFragment())
                .commit();
    }
}
