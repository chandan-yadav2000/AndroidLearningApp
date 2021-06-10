package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Toast.makeText(DashboardActivity.this,"You have been in dashboard",Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Welcome to App", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello Chandan", Toast.LENGTH_SHORT).show();

    }
}