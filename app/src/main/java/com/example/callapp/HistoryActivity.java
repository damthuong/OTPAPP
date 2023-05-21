package com.example.callapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        final ArrayList<TagView> historyList = new ArrayList<TagView>();

        historyList.add(new TagView(R.drawable.layer_call_made, "0123456789", Calendar.getInstance(TimeZone.getTimeZone("GMT+7:00")).getTime()));
        historyList.add(new TagView(R.drawable.layer_call_received, "2", Calendar.getInstance(TimeZone.getTimeZone("GMT+7:00")).getTime()));
        historyList.add(new TagView(R.drawable.layer_call_missed, "2", Calendar.getInstance(TimeZone.getTimeZone("GMT+7:00")).getTime()));

        TagViewAdapter numbersArrayAdapter = new TagViewAdapter(this, historyList);

        ListView numbersListView = findViewById(R.id.hisList);

        numbersListView.setAdapter(numbersArrayAdapter);
    }

}