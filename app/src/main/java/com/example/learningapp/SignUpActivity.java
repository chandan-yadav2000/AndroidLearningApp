package com.example.learningapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class SignUpActivity extends AppCompatActivity
{
    TextInputEditText dateTXT;
    Integer mDate, mMonth, mYear;
    TextView new_user;
    Button next_button;
    ImageView back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

       back_button = findViewById(R.id.signup_back_button);
       next_button = findViewById(R.id.signup_next_button);

//        //dateSelect
//        dateTXT=findViewById(R.id.birth_date);
//        dateTXT.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                final Calendar cal = Calendar.getInstance();
//                mDate = cal.get(Calendar.DATE);
//                mMonth = cal.get(Calendar.MONTH);
//                mYear = cal.get(Calendar.YEAR);
//
//                DatePickerDialog datePickerDialog=new DatePickerDialog(SignUpActivity.this, new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {
//
//                        dateTXT.setText(date+"-"+month+"-"+year);
//                    }
//                }, mYear, mMonth, mDate);
//                datePickerDialog.show();
//            }
//        });

        //to login activity
        new_user=findViewById(R.id.new_user);
        new_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(i);

            }
        });



    }

    public void callNextSignupScreen(View view)
    {
        Intent intent = new Intent(SignUpActivity.this, SignUpActivity2nd.class);
        startActivity(intent);
        //AddTransition

//        Pair[] pairs = new Pair[4];
//
//        pairs[0] = new Pair<View,String>(back_button,"transition_back_arrow_button");
//        pairs[1] = new Pair<View,String>(next_button,"transition_next_button");
//        pairs[2] = new Pair<View,String>(new_user,"transition_login_login");
//
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
//            ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(SignUpActivity.this, pairs);
//            startActivity(intent, activityOptions.toBundle());
//        }
//        else {
//            startActivity(intent);
//        }
    }
}