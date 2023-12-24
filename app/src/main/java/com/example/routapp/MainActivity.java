package com.example.routapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick(View view) {
        Intent intent;

        if (view.getId() == R.id.androidBtton){
            intent = new Intent(this,AndroidActivity.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.iosButton) {
            intent = new Intent(this, IosActivity.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.fullstackButton){
            intent = new Intent(this,FullstackActivity.class);
            startActivity(intent);
        }
        }
    }