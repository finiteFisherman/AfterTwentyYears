package com.rdr.aftertwentyyears;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds; //adds import

public class MainActivity extends AppCompatActivity {

    private AdView mobAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.textBody);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~2118701573");
        mobAdView = findViewById(R.id.adView);
        AdRequest adReq = new AdRequest.Builder().build();
        mobAdView.loadAd(adReq);
    }
}

