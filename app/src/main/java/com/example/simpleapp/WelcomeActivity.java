package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void signinbtn0(View view){
        startActivity(new Intent(WelcomeActivity.this, Login_act.class));
    }
    public void signupbtn0(View view){
        startActivity(new Intent(WelcomeActivity.this, Register_act.class));
    }
}