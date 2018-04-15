package com.example.android.musicapp;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_now);

        // get intent and extra values from others activity

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView itemFirstLine = (TextView)findViewById(R.id.item_first_line);
            TextView itemSecondLine = (TextView)findViewById(R.id.item_second_line);
            itemFirstLine.setText(extras.getString("FIRSTLINE"));
            itemSecondLine.setText(extras.getString("SECONDLINE"));
        }
    }
}
