package com.example.callapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView barmenu;
    CallLog call_log = new CallLog();
    Dial dial = new Dial();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        barmenu = findViewById(R.id.buttonBar);
        getSupportFragmentManager().beginTransaction().replace(R.id.mainscreen,dial).commit();

        barmenu.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.calltab:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainscreen,dial).commit();
                        return true;
                    case R.id.historytab:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainscreen,call_log).commit();
                        return true;
                }

                return false;
            }
        });

        /*TextView mTextview = (TextView) findViewById(R.id.sdt);
        mTextview.setText("");

        androidx.appcompat.widget.AppCompatButton button1 = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.num1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.d("BUTTONS", mTextview.getText().toString() + 1);
                mTextview.setText(mTextview.getText().toString() + "1");
                Log.d("BUTTONS", mTextview.getText().toString());
            }
        });

        androidx.appcompat.widget.AppCompatButton button2 = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.num2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "2");
                mTextview.setText(mTextview.getText().toString() + "2");
                Log.d("BUTTONS", mTextview.getText().toString());
            }
        });

        androidx.appcompat.widget.AppCompatButton button3 = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.num3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "3");
                mTextview.setText(mTextview.getText().toString() + "3");
                Log.d("BUTTONS", mTextview.getText().toString());
            }
        });

        androidx.appcompat.widget.AppCompatButton button4 = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.num4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "4");
                mTextview.setText(mTextview.getText().toString() + "4");
                Log.d("BUTTONS", mTextview.getText().toString());
            }
        });

        androidx.appcompat.widget.AppCompatButton button5 = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.num5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "5");
                mTextview.setText(mTextview.getText().toString() + "5");
                Log.d("BUTTONS", mTextview.getText().toString());
            }
        });

        androidx.appcompat.widget.AppCompatButton button6 = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.num6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "6");
                mTextview.setText(mTextview.getText().toString() + "6");
                Log.d("BUTTONS", mTextview.getText().toString());
            }
        });

        androidx.appcompat.widget.AppCompatButton button7 = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.num7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "7");
                mTextview.setText(mTextview.getText().toString() + "7");
                Log.d("BUTTONS", mTextview.getText().toString());
            }
        });

        androidx.appcompat.widget.AppCompatButton button8 = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.num8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "8");
                mTextview.setText(mTextview.getText().toString() + "8");
                Log.d("BUTTONS", mTextview.getText().toString());
            }
        });

        androidx.appcompat.widget.AppCompatButton button9 = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.num9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "9");
                mTextview.setText(mTextview.getText().toString() + "9");
                Log.d("BUTTONS", mTextview.getText().toString());
            }
        });

        androidx.appcompat.widget.AppCompatButton button0 = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.num0);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "0");
                mTextview.setText(mTextview.getText().toString() + "0");
                Log.d("BUTTONS", mTextview.getText().toString());
            }
        });

        androidx.appcompat.widget.AppCompatImageButton unclear = (androidx.appcompat.widget.AppCompatImageButton) findViewById(R.id.clr);
        unclear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mTextview.setText("");
                Log.d("BUTTONS", mTextview.getText().toString());
            }
        });

        androidx.appcompat.widget.AppCompatImageButton undelete = (androidx.appcompat.widget.AppCompatImageButton) findViewById(R.id.del);
        undelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str = mTextview.getText().toString();
                int len = str.length();
                if(len > 0) mTextview.setText(str.substring(0, len - 1));
                Log.d("BUTTONS", mTextview.getText().toString());
            }
        });

        androidx.appcompat.widget.AppCompatImageButton btncall = (androidx.appcompat.widget.AppCompatImageButton) findViewById(R.id.call);
        btncall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "Calling...");
            }
        });

        androidx.appcompat.widget.AppCompatImageButton btnvidcall = (androidx.appcompat.widget.AppCompatImageButton) findViewById(R.id.vidcall);
        btnvidcall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "Video call...");
            }
        });*/
    }
}