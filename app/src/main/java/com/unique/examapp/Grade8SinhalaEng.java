package com.unique.examapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade8SinhalaEng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade8_sinhala_eng);
    }
    public void browserurl1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1wrAW71d528okbxJpv2QeE3YS4bpzdMFA&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1lgnC46xnPMiipvEH635EFoIwDr3KJTei&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1kgg5Se-7ur5JqHNsRr7o1JJZNAbVZcnk&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1iY7K6F9tnq7AwZrBS1_JkTK55LY5FXaR&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl5(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1PFzGfn-3Ih2ixg8F-SV5NW6sdYMJtWCL&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl6(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1f2du3vbuFBodjiMncpS-Dfv3-GXyVRR5&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl7(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1VM8CuJfsaQC8-ulBzYkiT89tyGYANT1_&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl8(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1N1tq4Iyws-R6e7wldU43a6f-BfindE5U&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl9(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=16YPSuKMQKk4V2b8gSDhmh41jbNFFDnSC&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl10(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1yoaSu5Hi8Ll80urCCwsvYFl-VYsU48el&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl11(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1u4vyGSwZRuABvYg1fQmsGsYxsrXIjdr2&export=download"));
        startActivity(browserIntent);
    }

}