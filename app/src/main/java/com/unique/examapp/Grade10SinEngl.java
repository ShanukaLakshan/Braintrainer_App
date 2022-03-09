package com.unique.examapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade10SinEngl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade10_sin_engl);
    }
    public void browserurl1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1o0NJyEuwNcPpyqDWUkCyjMrktlGLnU6B&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1r2gOnaHLdIJ4K7uqAxwhQT9A31JOc6LO&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1PEoolU21iQBtP7q8_AQJiSBRfH1LQxD-&export=download"));
        startActivity(browserIntent);
    }

}