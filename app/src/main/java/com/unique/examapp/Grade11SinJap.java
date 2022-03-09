package com.unique.examapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;
public class Grade11SinJap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade11_sin_jap);
    }
    public void browserurl1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1zU3kTOGzVDJEXmhkgrVi9-t1_BMyc1pG&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1KGnQXMh-Rf0_Rch7dlstIy4qoe0JqIqy&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1DAcFvzVzJLgprvtmlABC0bgLAedVGf5i&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1hy7urBh8Wofyn4266Uqa9Bok9RSf7SNH&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl5(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1UdTj_PEkxCSpHWpPjnaA6KM7TI7RWZIU&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl6(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1kx_5M6QHmp_RZaj3hb7BJFeoZ7faWuOu&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl7(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1MC1QbkTJP0_X_MaYnF9pQCitPq2RNUrq&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl8(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1MC1QbkTJP0_X_MaYnF9pQCitPq2RNUrq&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl9(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1cBAppweOBy3qSyRiZpJy4w6dPleh-glK&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl10(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=13mEIxyr8SgjeRehOACNE7V5fpfxnj8n6&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl11(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1Htn4cUgwsMphwOAxNfsRmAfDehblk2QP&export=download"));
        startActivity(browserIntent);
    }

}