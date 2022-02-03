package com.example.tryon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SurveyActivity extends AppCompatActivity {

    Button mSurveySubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);


        mSurveySubmit = (Button) findViewById(R.id.btn_submitSurvey);
        mSurveySubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent homeIntent = new Intent(SurveyActivity.this, HomeSurveyActivity.class);
                Toast.makeText(SurveyActivity.this, "Thanks for Health Declaration", Toast.LENGTH_SHORT).show();
                startActivity(homeIntent);
            }
        });
    }
}