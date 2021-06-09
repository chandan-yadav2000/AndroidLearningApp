package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(){
            public void  run(){
          try{
              sleep(5*1000);
              Intent intent = new Intent(MainActivity.this,DashboardActivity.class);
              startActivity(intent);
              finish();
          }catch (Exception e){
              Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
          }
            }
        };
        thread.start();
    }
}