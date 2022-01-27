package com.example.mymemoparttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class screen_event extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_event);
        imageButton = (ImageButton) findViewById(R.id.btn_sport1);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iSport = new Intent(screen_event.this, screen_sport.class);
                startActivity(iSport);
            }
        });
    }
}