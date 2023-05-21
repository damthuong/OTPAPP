package com.example.callapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TagViewAdapter extends ArrayAdapter<TagView> {
    public TagViewAdapter(@NonNull Context context, ArrayList<TagView> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // convertView which is recyclable view
        View currTag = convertView;

        // of the recyclable view is null then inflate the custom layout for the same
        if (currTag == null) {
            currTag = LayoutInflater.from(getContext()).inflate(R.layout.call_tag, parent, false);
        }

        TagView currPos = getItem(position);

        ImageView stt = currTag.findViewById(R.id.calSTT);
        assert currPos != null;
        stt.setImageResource(currPos.getCallSTT());

        TextView num = currTag.findViewById(R.id.phoneNum);
        num.setText(currPos.getPhoneNumber());

        TextView dTime = currTag.findViewById(R.id.dateT);
        Date curr = currPos.getDateTime();
        dTime.setText(android.text.format.DateFormat.format("dd/MM/yyyy hh:mm a", curr));

        return currTag;
    }
}
