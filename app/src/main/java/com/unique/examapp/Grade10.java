package com.unique.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade10);



        LinearLayout button10_M_1;
        button10_M_1 = findViewById(R.id.button10_M_1);
        button10_M_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade10.this,Grade10Eng.class);
                startActivity(intent);
            }
        });
        LinearLayout button10_M_2;
        button10_M_2 = findViewById(R.id.button10_M_2);
        button10_M_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade10.this,Grade10Sin.class);
                startActivity(intent);
            }
        });

    }
}