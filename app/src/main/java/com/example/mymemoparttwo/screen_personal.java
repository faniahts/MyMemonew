package com.example.mymemoparttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class screen_personal extends AppCompatActivity {
ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_personal);
        imageButton = (ImageButton) findViewById(R.id.btn_shop1);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iShop = new Intent(screen_personal.this, screen_shopping_list.class);
                startActivity(iShop);
            }
        });
    }
}