package com.unique.examapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade10EngBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade10_eng_bus);
    }
    public void browserurl1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1VGnBfZMQExPmzK_po1YmisvUJ4Q12Hlh&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1jNm6qU2oH_YfUtUYB1CE3HXkhXwFrIAo&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1teYyJvEsvJ51b1HxWOEGT-ZEa31WFKwe&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1RotttNTTcPdLjFwY4jxDaJTzJV1qBFY6&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl5(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1J3fZhNuwYaTszVZ6I657mubfj3rruCaI&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl6(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1jA_HVXF8aIJUkG_YTQq1Ynh6ti0u_xZd&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl7(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1BLZXAqh-qs8L98CurUVCCpaJhqYbDK6A&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl8(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1teYyJvEsvJ51b1HxWOEGT-ZEa31WFKwe&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl9(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1NqtjzX3z3SqSzaVQ4an7jBOSsc586fGk&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl10(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1_6MWhqrinBx2AcDvxGls3YcQ610odR2I&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl11(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1UkzO4PGadl52oBR_l-gs2R8OyzN9tViO&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1YAUs-2wdYHUP0nYFqTUUASghrj-MeCU5&export=download"));
        startActivity(browserIntent);
    }

}