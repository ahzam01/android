package com.example.tryon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView mTextSurvey;
    ImageView mScanBarcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mTextSurvey = (TextView) findViewById(R.id.tv_survey);
        mScanBarcode = (ImageView) findViewById(R.id.iv_barcodeScanner);

        mTextSurvey.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent surveyActivity = new Intent(HomeActivity.this, SurveyActivity.class);
                startActivity(surveyActivity);
            }
        });

        mScanBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ProductActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigation, menu);
        return super.onCreateOptionsMenu(menu);
    }

}