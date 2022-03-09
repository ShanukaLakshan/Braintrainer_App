package com.unique.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import com.unique.examapp.R;

public class Grade4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade4);


        LinearLayout button4_1;
        button4_1 = findViewById(R.id.button4_1);
        button4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade4.this,Grade4Buddhism.class);
                startActivity(intent);
            }
        });
        LinearLayout button4_2;
        button4_2 = findViewById(R.id.button4_2);
        button4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade4.this,Grade4English.class);
                startActivity(intent);
            }
        });
        LinearLayout button4_3;
        button4_3 = findViewById(R.id.button4_3);
        button4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade4.this,Grade4EnvironmentalStudeis.class);
                startActivity(intent);
            }
        });
        LinearLayout button4_4;
        button4_4 = findViewById(R.id.button4_4);
        button4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade4.this,Grade4Mathametics.class);
                startActivity(intent);
            }
        });
        LinearLayout button4_5;
        button4_5 = findViewById(R.id.button4_5);
        button4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade4.this,Grade4SinhalaLanguage.class);
                startActivity(intent);
            }
        });
        LinearLayout button4_6;
        button4_6 = findViewById(R.id.button4_6);
        button4_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade4.this,Grade4Tamil.class);
                startActivity(intent);
            }
        });
    }
}