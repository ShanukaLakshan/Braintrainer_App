package com.unique.examapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class HomePage extends AppCompatActivity {


    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        final LinearLayout button4;
        button4 = findViewById(R.id.login);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd != null) {
                    save_id(button4.getId());
                    mInterstitialAd.show(HomePage.this);
                } else {
                    Intent intent = new Intent(HomePage.this,Grade4.class);
                    startActivity(intent);
                }
            }
        });
        final LinearLayout button5;
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd != null) {
                    save_id(button5.getId());
                    mInterstitialAd.show(HomePage.this);
                } else {
                    Intent intent = new Intent(HomePage.this,Grade5.class);
                    startActivity(intent);
                }
            }
        });
        final LinearLayout button6;
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd != null) {
                    save_id(button6.getId());
                    mInterstitialAd.show(HomePage.this);
                } else {
                    Intent intent = new Intent(HomePage.this,Grade6.class);
                    startActivity(intent);
                }

            }
        });
        final LinearLayout button7;
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd != null) {
                    save_id(button7.getId());
                    mInterstitialAd.show(HomePage.this);
                } else {
                    Intent intent = new Intent(HomePage.this,Grade6.class);
                    startActivity(intent);
                }
                Intent intent = new Intent(HomePage.this,Grade7.class);
                startActivity(intent);
            }
        });
        final LinearLayout button8;
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd != null) {
                    save_id(button8.getId());
                    mInterstitialAd.show(HomePage.this);
                } else {
                    Intent intent = new Intent(HomePage.this,Grade8.class);
                    startActivity(intent);
                }
            }
        });
        final LinearLayout button9;
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd != null) {
                    save_id(button9.getId());
                    mInterstitialAd.show(HomePage.this);
                } else {
                    Intent intent = new Intent(HomePage.this,Grade9.class);
                    startActivity(intent);
                }
            }
        });
        final LinearLayout button10;
        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd != null) {
                    save_id(button10.getId());
                    mInterstitialAd.show(HomePage.this);
                } else {
                    Intent intent = new Intent(HomePage.this,Grade10.class);
                    startActivity(intent);
                }
            }
        });
        final LinearLayout button11;
        button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd != null) {
                    save_id(button11.getId());
                    mInterstitialAd.show(HomePage.this);
                } else {
                    Intent intent = new Intent(HomePage.this,Grade11.class);
                    startActivity(intent);
                }
            }
        });


    }

    private void save_id(int id) {
        SharedPreferences preferences = getSharedPreferences("SAVED",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("mID",id);
        editor.apply();
    }
    private int load_id(){
        SharedPreferences preferences = getSharedPreferences("SAVED",MODE_PRIVATE);
        return preferences.getInt("mID",0);
    }

    @Override
    protected void onStart() {
        super.onStart();

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

                AdRequest adRequest = new AdRequest.Builder().build();

                InterstitialAd.load(HomePage.this,"ca-app-pub-3884148200831658/2544992774", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {

                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i("--AdMob", "onAdLoaded");

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when fullscreen content is dismissed.
                                Log.d("TAG", "The ad was dismissed.");
                                Intent intent;
                                switch (load_id()){
                                    case R.id.login:
                                        intent = new Intent(HomePage.this,Grade4.class);
                                        break;
                                    case R.id.button5:
                                        intent = new Intent(HomePage.this,Grade5.class);
                                        break;
                                    case R.id.button6:
                                        intent = new Intent(HomePage.this,Grade6.class);
                                        break;
                                    case R.id.button7:
                                        intent = new Intent(HomePage.this,Grade7.class);
                                        break;
                                    case R.id.button8:
                                        intent = new Intent(HomePage.this,Grade8.class);
                                        break;
                                    case R.id.button9:
                                        intent = new Intent(HomePage.this,Grade9.class);
                                        break;
                                    case R.id.button10:
                                        intent = new Intent(HomePage.this,Grade10.class);
                                        break;
                                    case R.id.button11:
                                        intent = new Intent(HomePage.this,Grade11.class);
                                        break;


                                    default:
                                        return;
                                }
                                startActivity(intent);
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i("--AdMob", loadAdError.getMessage());
                        mInterstitialAd = null;
                    }
                });
            }
        });
    }




}

