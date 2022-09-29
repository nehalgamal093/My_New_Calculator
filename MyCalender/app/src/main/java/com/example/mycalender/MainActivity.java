package com.example.mycalender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
private CalendarView calendarView;
Button button;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendarView);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                String myDate = "Year: " + year + "-"+ "Month: "+ month + "-" + "Day: " +dayOfMonth;
                Toast.makeText(getApplicationContext(),myDate ,Toast.LENGTH_LONG).show();
                textView.setText(myDate);
            }
        });
    }
}