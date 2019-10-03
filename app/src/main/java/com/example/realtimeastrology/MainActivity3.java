package com.example.realtimeastrology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void SendEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"Harry.waldauer@gmail.com"});
        intent.putExtra(Intent.EXTRA_CC, new String[] {"yeprem.ayvazyan@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Mail from Real Time Astrology!");
        intent.putExtra(Intent.EXTRA_TEXT, "Testing email function please confirm with Yeprem");

        try {
            startActivity(Intent.createChooser(intent, "Testing email?"));
        } catch (android.content.ActivityNotFoundException ex) {
            //do something else
        }
    }
}
