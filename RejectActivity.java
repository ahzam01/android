package com.example.tryon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RejectActivity extends AppCompatActivity {
    Button btnRejectTrial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reject);

        btnRejectTrial = (Button) findViewById(R.id.btn_rejectProduct);

        btnRejectTrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RejectTrial = new Intent(RejectActivity.this, ThankYouActivity.class);
                startActivity(RejectTrial);
            }
        });

    }
}