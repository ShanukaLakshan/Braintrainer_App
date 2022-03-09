
package com.unique.examapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unique.examapp.R;

public class Grade6SinhalaMediumSciencen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade6_sinhala_medium_sciencen);


    }
    public void browserurl1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ws-60Vf3mQPaUx0VoepqyqZw3cnC-Ku4/view"));
        startActivity(browserIntent);
    }
    public void browserurl2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vAOsqHAJiSx2aw9ql_x3tOQDwEME8gx6/view"));
        startActivity(browserIntent);
    }
    public void browserurl3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1rq5r6JDrOiB12ZQScU0WxUzkZ_bVR3_t/view"));
        startActivity(browserIntent);
    }
    public void browserurl4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VPsuKOFgqRUNFtVEkMuknTpy4OKKu47n/view"));
        startActivity(browserIntent);
    }
    public void browserurl5(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1dU4mQDgPVTbV5FEypHGBAXNvKUvnVPcm/view"));
        startActivity(browserIntent);
    }
    public void browserurl6(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1I2PH_p7bAyg4dTKxcKyN1o9jwcylb9Rv/view"));
        startActivity(browserIntent);
    }
    public void browserurl7(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-w0EUk9jzYNyA0ZeBHb-6s4Its7KcQGn/view"));
        startActivity(browserIntent);
    }
    public void browserurl8(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1l3W1oe82ppAuwbeKF_n4lWQJ4fmXTovw/view"));
        startActivity(browserIntent);
    }
    public void browserurl9(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_hlind5hyOklsQ8oYbEq4k-xB6b7Wx57/view"));
        startActivity(browserIntent);
    }
    public void browserurl10(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1fSYvJ8BYJSOBxxFx6RhujJtG-lnlYmwA/view"));
        startActivity(browserIntent);
    }
    public void browserurl11(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?id=1HgLr0EiUsxtpq28Uih9Ar0HPkeVec3ZZ&export=download"));
        startActivity(browserIntent);
    }

}