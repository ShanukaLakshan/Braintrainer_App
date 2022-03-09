package com.unique.examapp;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade11EngHeal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade11_eng_heal);
    }
    public void browserurl1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1XbSCw5KhOExeOKheIctZTTph4zIMdPh6&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=15nvwcHFrgnLMlBeTBgt5YQOrgaTgznYF&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1JjikLQIKN9BWc-dfuC8eZdejawROGLfZ&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1_GPUzE8SAwWyAnttEjK-8XMJT5CFaNHe&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl5(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=16cKFMD7BXAUoBaXI1eGgUZJAkXtXI3dc&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl6(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1AS79oE9Z0EXqLqrSJMpJmSotctyUt67U&export=download"));
        startActivity(browserIntent);
    }

}