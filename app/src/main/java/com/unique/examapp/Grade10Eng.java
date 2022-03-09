package com.unique.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade10Eng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade10_eng);


        LinearLayout button6_M_1_1;
        button6_M_1_1 = findViewById(R.id.button6_M_1_1);
        button6_M_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade10Eng.this,Grade10EngBus.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_1_2;
        button6_M_1_2 = findViewById(R.id.button6_M_1_2);
        button6_M_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade10Eng.this,Grade10EngHeal.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_1_3;
        button6_M_1_3 = findViewById(R.id.button6_M_1_3);
        button6_M_1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade10Eng.this,Grade10EngIct.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_1_4;
        button6_M_1_4 = findViewById(R.id.button6_M_1_4);
        button6_M_1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade10Eng.this,Grade10EngMat.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_1_5;
        button6_M_1_5 = findViewById(R.id.button6_M_1_5);
        button6_M_1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade10Eng.this,Grade10EngWes.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_1_6;
        button6_M_1_6 = findViewById(R.id.button6_M_1_6);
        button6_M_1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade10Eng.this,Grade10EngSci.class);
                startActivity(intent);
            }
        });

    }
}