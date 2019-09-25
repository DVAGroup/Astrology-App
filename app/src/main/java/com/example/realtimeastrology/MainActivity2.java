package com.example.realtimeastrology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button buttonBack = (Button) findViewById(R.id.buttonBack);
        Button buttonNextPage = (Button) findViewById(R.id.buttonNextPage);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_next_page = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(go_to_next_page);
            }
        });

        buttonNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_next_page = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(go_to_next_page);
            }
        });
    }

}

