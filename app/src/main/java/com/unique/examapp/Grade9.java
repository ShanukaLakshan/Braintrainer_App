package com.unique.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade9);


        LinearLayout button9_M_1;
        button9_M_1 = findViewById(R.id.button9_M_1);
        button9_M_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade9.this,Grade9English.class);
                startActivity(intent);
            }
        });
        LinearLayout button9_M_2;
        button9_M_2 = findViewById(R.id.button9_M_2);
        button9_M_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade9.this,Grade9Sinhala.class);
                startActivity(intent);
            }
        });
    }
}