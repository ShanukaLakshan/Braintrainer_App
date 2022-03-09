package com.unique.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade8);


        LinearLayout button8_M_1;
        button8_M_1 = findViewById(R.id.button8_M_1);
        button8_M_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade8.this,Grade8English.class);
                startActivity(intent);
            }
        });
        LinearLayout button8_M_2;
        button8_M_2 = findViewById(R.id.button8_M_2);
        button8_M_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade8.this,Grade8Sinhala.class);
                startActivity(intent);
            }
        });
    }
}