package com.crossbug.allnetworkpackages2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Loan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);
    }

    public void loanJazz(View view) {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);


        Intent intent = new Intent(Intent.ACTION_CALL);

        intent.setData(Uri.parse("tel:*112%23"));
        if (ContextCompat.checkSelfPermission(Loan.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Loan.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else
        {
            startActivity(intent);
        }
    }


    public void loantel(View view) {


        Intent intentCall = new Intent(Intent.ACTION_CALL);

        intentCall.setData(Uri.parse("tel:*0%23"));
        if (ContextCompat.checkSelfPermission(Loan.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Loan.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else
        {
            startActivity(intentCall);
        }
    }
    public void balwarid(View view) {


        Intent intentCall = new Intent(Intent.ACTION_CALL);

        intentCall.setData(Uri.parse("tel:*100%23"));
        if (ContextCompat.checkSelfPermission(Loan.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Loan.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else
        {
            startActivity(intentCall);
        }
    }
    public void loanzong(View view) {


        Intent intentCall = new Intent(Intent.ACTION_CALL);

        intentCall.setData(Uri.parse("tel:*911%23"));
        if (ContextCompat.checkSelfPermission(Loan.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Loan.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else
        {
            startActivity(intentCall);
        }
    }
    public void loanufone(View view) {


        Intent intentCall = new Intent(Intent.ACTION_CALL);

        intentCall.setData(Uri.parse("tel:*456*%23"));
        if (ContextCompat.checkSelfPermission(Loan.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Loan.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else
        {
            startActivity(intentCall);
        }
    }




}



