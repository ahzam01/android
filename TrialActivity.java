package com.example.tryon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TrialActivity extends AppCompatActivity {
    Button mRejectTrial;
    Button mAddToCart;
    TextView mCartCount;
    ImageView mCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trial);
        mRejectTrial = (Button) findViewById(R.id.btn_rejectTrial);
        mAddToCart =(Button) findViewById(R.id.btn_addToCart);
        mCartCount = (TextView)findViewById(R.id.tv_cartCount);
        mCart = (ImageView)findViewById(R.id.iv_cart);

        mRejectTrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rejectIntent = new Intent(TrialActivity.this, RejectActivity.class);
                startActivity(rejectIntent);
            }
        });

        mAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCartCount.setVisibility(v.VISIBLE);
                mCartCount.setText("1");
            }
        });

        mCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent checkOut = new Intent(TrialActivity.this, CheckOutActivity.class);
                startActivity(checkOut);
            }
        });
    }
}