package com.example.th225ajisaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Oniku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oniku);
        setTitle( "お肉" );
    }

    public void onClickButaniku(View v) {
        Intent intent = new Intent(this, Butaniku.class);

        startActivity(intent);
}}