package com.example.mymemoparttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class screen_all extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_all);
        imageButton = (ImageButton) findViewById(R.id.buttonPersonal);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPersonal = new Intent(screen_all.this, screen_personal.class);
                startActivity(iPersonal);
            }
        });
    }
}