package com.unique.examapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade10SinCiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade10_sin_civ);
    }
    public void browserurl1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1Oa3BFQJ1Ksu3Qagqx2fc8XL5IWANj38F&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1QSSV-F5R0y_KpEd4kFIqvuWhlNRXpvJv&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1e_3gTBClKS7L1YperQp6_gbc294FxdpZ&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1nGKO4nfYlKIeNQqk-fDnDRZhvKhIeO9P&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl5(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=17vxS9r0jFhlHIAJncxPa7jff0kYrZPW6&export=download"));
        startActivity(browserIntent);
    }

}