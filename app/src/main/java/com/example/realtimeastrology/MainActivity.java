package com.example.realtimeastrology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button buttonNext = (Button) findViewById(R.id.buttonNext);
        Button buttonExit = (Button) findViewById(R.id.buttonExit);


        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_next = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(go_to_next);
            }
        });

        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

}

