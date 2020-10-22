package com.example.taxiorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToClientSignIn(View view) {
        startActivity(new Intent(
                MainActivity.this,
                ClientSignInActivity.class
        ));
    }
    public void goToDriverSignIn(View view) {
        startActivity(new Intent(
                MainActivity.this,
                DriverSignInActivity.class
        ));
    }
}