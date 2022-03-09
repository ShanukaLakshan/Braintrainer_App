package com.unique.examapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;
public class Grade10SinBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade10_sin_bus);
    }
    public void browserurl1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=11zG4LGUbMtiSYVfJ9Vl9hmVsCHYxPpJS&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=10GRPGBWcIRRaArdj6PzfCNxNf8FeeSbV&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1JXwmQtCuIOFPzKBcaTc3EbztW93H5zeI&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1zqXZ4MQ_ZE-IX3YGthw9P51pGSZL__ig&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl5(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1gIlkKRxrSWphm7xrAC7ab3ekihps-ecj&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl6(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1Vh8JdqPS6r6IfVJrEMfSnRQ1q51_9Ji2&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl7(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1_HupFLaHyUikr_u9BlHIFYsasZMQN1Bx&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl8(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=17I_tdyrj2P9VjDtBvKmu7JJ6yeIPZ3K2&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl9(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1APi71hBZRYQPFcua-4wPYKN78iA52xT_&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl10(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1D7KR1yYA1pkRXC8MkCy2fpcOWsKI4-Zb&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl11(View view){
        Intent browserIntent=new Intent(
                Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1Sn4nDdUBjB4Mz5V9-goq1EpAeBlm9gv3&export=download"));
        startActivity(browserIntent);
    }
    public void browserurl12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1TAH5VmcZNSW4r2PsIwdWzwyPxuZ52LYL&export=download"));
        startActivity(browserIntent);
    }

}