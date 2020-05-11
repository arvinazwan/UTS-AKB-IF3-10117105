package com.example.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
    Tanggal Pengerjaan : 10 Mei 2019
    NIM : 10117105
    Nama : Arvi Nazwan A
    Kelas : IF-3
    */

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(getApplicationContext(),
                IntroActivity.class);
        startActivity(intent);
        finish();
    }
}