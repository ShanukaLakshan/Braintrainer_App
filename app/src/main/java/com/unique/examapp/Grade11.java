package com.unique.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade11);


        LinearLayout button11_M_1;
        button11_M_1 = findViewById(R.id.button11_M_1);
        button11_M_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade11.this,Grade11Eng.class);
                startActivity(intent);
            }
        });
        LinearLayout button11_M_2;
        button11_M_2 = findViewById(R.id.button11_M_2);
        button11_M_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade11.this,Grade11Sin.class);
                startActivity(intent);
            }
        });
    }
}