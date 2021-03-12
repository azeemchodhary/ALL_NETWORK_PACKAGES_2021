package com.crossbug.allnetworkpackages2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.MenuItem;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Below 2 line are to make the application full screen
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mInterstitialAd = new InterstitialAd(this);

        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
//      Real Ad id above is test ad  mInterstitialAd.setAdUnitId("ca-app-pub-9406044100015529/8124058871");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }






    public void btnJazz(View view) {
        Intent intent = new Intent(this, tabbed.class);
        intent.putExtra("network","jazz");
        startActivity(intent);
    }
    public void btnTelenor(View view) {
        Intent intent = new Intent(this, tabbed.class);
        intent.putExtra("network","telenor");
        startActivity(intent);


    }public void btnWarid(View view) {
        Intent intent = new Intent(this, tabbed.class);
        intent.putExtra("network","warid");

        startActivity(intent);


    }public void btnZong(View view) {
        Intent intent = new Intent(this, tabbed.class);
        intent.putExtra("network","zong");
        startActivity(intent);


    }
    public void btnUfone(View view) {
        Intent intent = new Intent(this, tabbed.class);
        intent.putExtra("network","ufone");
        startActivity(intent);
    }
    public void btnloan(View view) {
        Intent intent = new Intent(this, Loan.class);
        startActivity(intent);
    }
    public void btnbal(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        Intent intent = new Intent(this, CheckBal.class);
        startActivity(intent);
    }
    public void btnprivacy(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://azeemchoudhary.wordpress.com/privacy-policy-for-all-network-packages-2020/"));
        startActivity(intent);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }
    @Override
    public  boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item1:
                Intent intent = new Intent(this, AboutUs.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"About Us ",Toast.LENGTH_LONG).show();
                return true;

            case R.id.item3:
                Intent intent1 = new Intent(this, FAQ.class);
                startActivity(intent1);

                return true;
            case R.id.item4:
                Intent intent2 = new Intent(Intent.ACTION_SEND);
                intent2.setType("text/plain");
                String sharebody= "https://play.google.com/store/apps/details?id=crossbug.allpackagesdetail";
                String sharesub="Your subject here";
                intent2.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                intent2.putExtra(Intent.EXTRA_TEXT,sharebody);
                startActivity(intent2.createChooser(intent2,"Share Using"));

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
