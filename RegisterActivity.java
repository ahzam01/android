package com.example.tryon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText mTextRegUserName;
    EditText mTextRegPassword;
    EditText mTextRegCnfPassword;
    EditText mTextRegEmail;
    Button mRegButton;
    TextView mTextLogin;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DatabaseHelper(this);
        mTextRegUserName = (EditText) findViewById(R.id.et_userName);
        mTextRegPassword = (EditText) findViewById(R.id.et_password);
        mTextRegCnfPassword = (EditText) findViewById(R.id.et_cnf_password);
        mTextRegEmail = (EditText) findViewById(R.id.et_email);
        mRegButton = (Button) findViewById(R.id.btn_register);
        mTextLogin = (TextView) findViewById(R.id.tv_login);
        mTextLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent LoginIntent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(LoginIntent);

            }
        });

        mRegButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mTextRegUserName.getText().toString().trim();
                String password = mTextRegPassword.getText().toString().trim();
                String cnfPassword = mTextRegCnfPassword.getText().toString().trim();
                String email = mTextRegEmail.getText().toString().trim();
                if (password.equals(cnfPassword)){
                    long val = db.addUser(username, password, email);
                    if (val > 0){
                        Toast.makeText(RegisterActivity.this, "Successfully  Registered", Toast.LENGTH_SHORT).show();
                        Intent LoginIntent = new Intent(RegisterActivity.this, MainActivity.class);
                        startActivity(LoginIntent);
                    }else{
                        Toast.makeText(RegisterActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(RegisterActivity.this, "Password Not matching Confirm Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}