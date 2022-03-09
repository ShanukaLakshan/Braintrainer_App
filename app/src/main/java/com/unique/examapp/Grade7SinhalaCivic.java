package com.unique.examapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade7SinhalaCivic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade7_sinhala_civic);
    }
    public void browserurl1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/16a_aV5nUBNxgsddH3Rli1bqDcxsJGLBV/view"));
        startActivity(browserIntent);
    }
    public void browserurl2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/13f8lMpW4gy5Afk6ilW2XjqViKRu-ocZN/view"));
        startActivity(browserIntent);
    }
    public void browserurl3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1O6wmrxjKOJkKN69Orzg9PvaRaJR9hOPZ/view"));
        startActivity(browserIntent);
    }

}