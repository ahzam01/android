package com.example.tryon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mTextUserName;
    EditText mTextPassword;
    TextView mForgotPassword;
    CheckBox mRememberMe;
    Button mLogin;
    TextView mSignUp;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this);
        mTextUserName = (EditText) findViewById(R.id.et_userName);
        mTextPassword = (EditText) findViewById(R.id.et_password);
        mLogin = (Button) findViewById(R.id.btn_login);
        mSignUp = (TextView) findViewById(R.id.tv_signUp);
        mSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
            }
        });

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mTextUserName.getText().toString().trim();
                String password = mTextPassword.getText().toString().trim();
                Boolean res = db.checkUser(username, password);
                if (res == true){
                    Toast.makeText(MainActivity.this, "Successfully Logged In", Toast.LENGTH_SHORT).show();
                    Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(homeIntent);
                }else{
                    Toast.makeText(MainActivity.this, "Username or Password Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}