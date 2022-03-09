package com.unique.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade6SinhalaMedium extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade6_sinhala_medium);


        LinearLayout button6_M_2_1;
        button6_M_2_1 = findViewById(R.id.button6_M_2_1);
        button6_M_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade6SinhalaMedium.this,Grade6SinhalaMediumBuddhismn.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_2_2;
        button6_M_2_2 = findViewById(R.id.button6_M_2_2);
        button6_M_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade6SinhalaMedium.this,Grade6SinhalaMediumCivicn.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_2_3;
        button6_M_2_3 = findViewById(R.id.button6_M_2_3);
        button6_M_2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade6SinhalaMedium.this,Grade6SinhalaMediumEnglishn.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_2_4;
        button6_M_2_4 = findViewById(R.id.button6_M_2_4);
        button6_M_2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade6SinhalaMedium.this,Grade6SinhalaMediumGeographyn.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_2_5;
        button6_M_2_5 = findViewById(R.id.button6_M_2_5);
        button6_M_2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade6SinhalaMedium.this,Grade6SinhalaMediumHealthn.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_2_6;
        button6_M_2_6 = findViewById(R.id.button6_M_2_6);
        button6_M_2_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade6SinhalaMedium.this,Grade6SinhalaMediumHistoryn.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_2_7;
        button6_M_2_7 = findViewById(R.id.button6_M_2_7);
        button6_M_2_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade6SinhalaMedium.this,Grade6SinhalaMediumMathameticsn.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_2_8;
        button6_M_2_8 = findViewById(R.id.button6_M_2_8);
        button6_M_2_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade6SinhalaMedium.this,Grade6SinhalaMediumPtsn.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_2_9;
        button6_M_2_9 = findViewById(R.id.button6_M_2_9);
        button6_M_2_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade6SinhalaMedium.this,Grade6SinhalaMediumSciencen.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_2_10;
        button6_M_2_10 = findViewById(R.id.button6_M_2_10);
        button6_M_2_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade6SinhalaMedium.this,Grade6SinhalaMediumSinhalan.class);
                startActivity(intent);
            }
        });


    }
}