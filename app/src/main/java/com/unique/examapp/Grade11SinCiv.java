package com.unique.examapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade11SinCiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade11_sin_civ);
    }
    public void browserurl1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1Lggli2WF4DKN6L7JKrjCO4y_FQ0g2R2E&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1a-Ip7J7Sc9CZG2pKVxJdzi51e6mQrkuP&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=15tOoi01i5h3qffIwQIfCayzODj4RH_6e&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1sxd7F_ywSI9pYfe_dmDmJx1JlgHizZxK&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl5(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=14ZfX8FPrS2G4v4jCIye1Guz6vYCizZUZ&export=download"));
        startActivity(browserIntent);
    }

}