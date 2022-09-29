package com.example.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView result;
  EditText firstNumber, secondNumber;
  Button mySumButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        mySumButton = findViewById(R.id.button);

    }
    public void clickSum(View view){
        if(!firstNumber.getText().toString().equals("")&&!secondNumber.getText().toString().equals("")){
            double myFirstNumber = Double.parseDouble(firstNumber.getText().toString());
            double mySecondNumber = Double.parseDouble(secondNumber.getText().toString());
            result.setText((myFirstNumber + mySecondNumber) + "");
        } else {
            result.setText("Please put numbers");
        }

    }
}