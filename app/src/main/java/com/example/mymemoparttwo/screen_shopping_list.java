package com.example.mymemoparttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class screen_shopping_list extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_shopping_list);
        imageButton = (ImageButton) findViewById(R.id.btn_event1);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iEvent = new Intent(screen_shopping_list.this, screen_event.class);
                startActivity(iEvent);
            }
        });
    }
}