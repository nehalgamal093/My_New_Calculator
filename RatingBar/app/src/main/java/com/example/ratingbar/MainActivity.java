package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonShow;
    TextView textViewResult;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textView);
        ratingBar = findViewById(R.id.ratingBar);
        buttonShow = findViewById(R.id.button);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String totalValue = ratingBar.getNumStars()+"";
                String rating = ratingBar.getRating() + "";
                textViewResult.setText("Total value is "+totalValue +" Rating is "+rating);
                Toast.makeText(MainActivity.this,"Your result is"+" "+ rating,Toast.LENGTH_LONG).show();
            }
        });
    }
}