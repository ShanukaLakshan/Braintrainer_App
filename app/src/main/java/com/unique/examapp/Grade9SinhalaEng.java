package com.unique.examapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade9SinhalaEng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade9_sinhala_eng);
    }
    public void browserurl1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1d8yopi1cOAn3ir1bj4ibjrtMvGc40Heg&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1pjaQbeWZh6xG_Am3HCm0iLiRpqLi9vc8&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1Cl9OQ9kW0JOZSRkrlop5SVli4IreLn3j&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1lm19skS3GVbG5pTVyGZy8vxIOi_ASEqo&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl5(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1FuDcxYU4ZyzX9fqGs5k9dWU-INfx9Wuh&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl6(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1C0CdwCKKMwqTzVYfJERi2E4EFwoQhwk3&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl7(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=17lfe2PIZTNUZ7g97GPT2ZQCkADK1LR8S&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl8(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1o_IGD_On2NYoB4m7Rs9wYe1sKXjQpMoz&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl9(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1EeUAwnt600kL_Rd-CSagAH8TBcmJeT6I&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl10(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1OjWWtfieKEyn1VYc7IOOEP7eYfdiaVY5&export=download"));
        startActivity(browserIntent);
    }

}