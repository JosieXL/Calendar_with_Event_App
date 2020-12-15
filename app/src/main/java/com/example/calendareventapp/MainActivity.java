package com.example.calendareventapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CustomerCalendarView customerCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customerCalendarView = (CustomerCalendarView) findViewById(R.id.custom_calendar_view);
    }
}