package com.example.radiobutton;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private RadioGroup radioGroup;
private RadioButton radioButton;
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView2);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup,@IdRes int checkedId) {
                radioButton = findViewById(checkedId);
                switch(radioButton.getId()){
                    case R.id.pizza:{
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("Pizza");
                        textView.setTextColor(Color.GREEN);
                        Log.d("logid","Pizza");
                    }
                    break;
                    case R.id.negressco:{
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("Negressco");
                        textView.setTextColor(Color.YELLOW);
                        Log.d("logid","Negressco");
                    }
                    break;
                    case R.id.crepe:{
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("Crepe");
                        textView.setTextColor(Color.GRAY);
                        Log.d("logid","Crepe");
                    }
                    break;

                }
            }
        });
    }
}