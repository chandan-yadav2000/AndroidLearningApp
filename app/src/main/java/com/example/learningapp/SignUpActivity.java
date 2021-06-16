package com.example.learningapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class SignUpActivity extends AppCompatActivity
{

    DatePickerDialog datePickerDialog;
    Button datebutton;
    TextView signin;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initDatePicker();
        datebutton=findViewById(R.id.datepickerbutton);
        datebutton.setText(getTextDate());
        signin = findViewById(R.id.signin_button);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private String getTextDate() {
        Calendar cal= Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month= month+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, month, year);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void initDatePicker()
    {
        datePickerDialog.setOnDateSetListener(new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day)
            {
                month = month + 1;
                String date = makeDateString(day, month, year);
                datebutton.setText(date);
            }
        });

        Calendar cal= Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_DARK;

//        datePickerDialog= new DatePickerDialog(year, month, day);


    }
    private String makeDateString(int day, int month, int year)
    {
        return getMonthFormat(month) + " " + day + " "+ year + " ";
    }

    private String getMonthFormat(int month)
    {
        if (month==1)
            return "Jan";
        if (month==2)
            return "Feb";
        if (month==3)
            return "March";
        if (month==4)
            return "April";
        if (month==5)
            return "May";
        if (month==6)
            return "June";
        if (month==7)
            return "July";
        if (month==8)
            return "Aug";
        if (month==9)
            return "Sep";
        if (month==10)
            return "Oct";
        if (month==11)
            return "Nov";
        if (month==12)
            return "Dec";

        return "Invalid ";
            }

    public void openDatePicker(View view)
    {
        datePickerDialog.show();
    }
}