package com.example.callapp;

import java.time.DateTimeException;
import java.util.Date;

public class TagView {
    private int callStt;
    private String phoneNumber;
    private Date dateTime;

    public TagView(int stt, String num, Date dtime)
    {
        callStt = stt;
        phoneNumber = num;
        dateTime = dtime;
    }

    public int getCallSTT() { return callStt; }

    public String getPhoneNumber() { return phoneNumber; }

    public Date getDateTime() { return dateTime;}
}