package com.unique.examapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade5);


        LinearLayout button5_1;
        button5_1 = findViewById(R.id.button5_1);
        button5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade5.this,Grade5Buddhism.class);
                startActivity(intent);
            }
        });
        LinearLayout button5_2;
        button5_2 = findViewById(R.id.button5_2);
        button5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade5.this,Grade5EnvironmentalStudeis.class);
                startActivity(intent);
            }
        });
        LinearLayout button5_3;
        button5_3 = findViewById(R.id.button5_3);
        button5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade5.this,Grade5Mathametics.class);
                startActivity(intent);
            }
        });
        LinearLayout button5_4;
        button5_4 = findViewById(R.id.button5_4);
        button5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade5.this,Grade5SinhalaLanguage.class);
                startActivity(intent);
            }
        });
        LinearLayout button5_5;
        button5_5 = findViewById(R.id.button5_5);
        button5_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade5.this,Grade5Tamil.class);
                startActivity(intent);
            }
        });
    }
}