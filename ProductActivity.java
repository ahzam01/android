package com.example.tryon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductActivity extends AppCompatActivity {
    Button mProceedToTrial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        mProceedToTrial = (Button) findViewById(R.id.btn_proceedToTrial);

        mProceedToTrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trialIntent = new Intent(ProductActivity.this, TrialActivity.class);
                startActivity(trialIntent);
            }
        });
    }
}