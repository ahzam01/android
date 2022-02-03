package com.example.tryon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CheckOutActivity extends AppCompatActivity {
    Button mbtnBuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);

        mbtnBuy = (Button) findViewById(R.id.btn_buy);

        mbtnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent thankIntent = new Intent(CheckOutActivity.this, ThankYouActivity.class);
                startActivity(thankIntent);
            }
        });
    }
}