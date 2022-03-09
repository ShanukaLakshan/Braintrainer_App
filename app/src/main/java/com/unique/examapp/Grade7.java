package com.unique.examapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade7);


        LinearLayout button6_M_1;
        button6_M_1 = findViewById(R.id.button7_M_1);
        button6_M_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade7.this,Grade7English.class);
                startActivity(intent);
            }
        });
        LinearLayout button6_M_2;
        button6_M_2 = findViewById(R.id.button7_M_2);
        button6_M_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade7.this,Grade7Sinhala.class);
                startActivity(intent);
            }
        });
    }
}