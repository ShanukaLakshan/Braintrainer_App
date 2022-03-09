package com.unique.examapp;

        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;

        import androidx.appcompat.app.AppCompatActivity;
        import com.unique.examapp.R;
public class Grade6EnglishMediumGeography extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade6_english_medium_geography);


    }
    public void browserurl1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1ztQ3-3AuDMEcGK6e8vBieeepwicJCdqf&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1ki90FHOhVbzOjMkWodKC8JB2C5KsTSpU&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1kk-pASxwhpSvR6NNrAWYemii79PbL85E&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1LV902t6loanZ31S5iadQkchahtnlKtb3&export=download"));
        startActivity(browserIntent);
    }


}