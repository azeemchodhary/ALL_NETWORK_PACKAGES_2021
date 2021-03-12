package com.crossbug.allnetworkpackages2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class CheckBal extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_bal);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9406044100015529~3476568555");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

    public void balJazz(View view) {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);


        Intent intent = new Intent(Intent.ACTION_CALL);

        intent.setData(Uri.parse("tel:*111%23"));
        if (ContextCompat.checkSelfPermission(CheckBal.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(CheckBal.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else
        {
            startActivity(intent);
        }
    }


    public void baltel(View view) {


        Intent intentCall = new Intent(Intent.ACTION_CALL);

        intentCall.setData(Uri.parse("tel:*444%23"));
        if (ContextCompat.checkSelfPermission(CheckBal.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(CheckBal.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else
        {
            startActivity(intentCall);
        }
    }
    public void balwarid(View view) {


        Intent intentCall = new Intent(Intent.ACTION_CALL);

        intentCall.setData(Uri.parse("tel:*100%23"));
        if (ContextCompat.checkSelfPermission(CheckBal.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(CheckBal.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else
        {
            startActivity(intentCall);
        }
    }
    public void balzong(View view) {


        Intent intentCall = new Intent(Intent.ACTION_CALL);

        intentCall.setData(Uri.parse("tel:*222%23"));
        if (ContextCompat.checkSelfPermission(CheckBal.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(CheckBal.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else
        {
            startActivity(intentCall);
        }
    }
    public void balufone(View view) {


        Intent intentCall = new Intent(Intent.ACTION_CALL);

        intentCall.setData(Uri.parse("tel:*124%23"));
        if (ContextCompat.checkSelfPermission(CheckBal.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(CheckBal.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else
        {
            startActivity(intentCall);
        }
    }




    }




