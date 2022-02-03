package com.example.tryon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeSurveyActivity extends AppCompatActivity {
    ImageView mScanBarcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_survey);
        mScanBarcode = (ImageView)findViewById(R.id.iv_barcodeScanner);
        mScanBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ProductActivity.class));
            }
        });
    }
}