package com.example.callapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

public class CallLog extends Fragment {

    public CallLog() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_call_log, container, false);

        final ArrayList<TagView> historyList = new ArrayList<TagView>();

        historyList.add(new TagView(R.drawable.layer_call_made, "0123456789", Calendar.getInstance(TimeZone.getTimeZone("GMT+7:00")).getTime()));
        historyList.add(new TagView(R.drawable.layer_call_received, "2", Calendar.getInstance(TimeZone.getTimeZone("GMT+7:00")).getTime()));
        historyList.add(new TagView(R.drawable.layer_call_missed, "2", Calendar.getInstance(TimeZone.getTimeZone("GMT+7:00")).getTime()));

        TagViewAdapter numbersArrayAdapter = new TagViewAdapter(getActivity(), historyList);

        ListView numbersListView = view.findViewById(R.id.hisList);

        numbersListView.setAdapter(numbersArrayAdapter);

        // Inflate the layout for this fragment
        return view;
    }
}