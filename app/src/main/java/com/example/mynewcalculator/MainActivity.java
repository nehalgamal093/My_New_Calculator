package com.example.mynewcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText firstNumber,secondNumber;
    private Button buttonSum,buttonMulti;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.editTextNumber);
        secondNumber = findViewById(R.id.editTextNumber2);
        buttonSum = findViewById(R.id.button);
        buttonMulti = findViewById(R.id.button2);
        textViewResult = findViewById(R.id.textView);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myNumber1 = firstNumber.getText().toString();
                String myNumber2 = secondNumber.getText().toString();

                if(myNumber1.isEmpty() || myNumber2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Pleast insert value",Toast.LENGTH_LONG).show();
                } else {
                    Double input1 = Double.parseDouble(myNumber1);
                    Double input2 = Double.parseDouble(myNumber2);
                    String finalResult = String.valueOf(sumValues(input1,input2));
                    textViewResult.setText(finalResult);
                    //sumValues(input1,input2);
                    //textViewResult.setText(sumValues(input1,input2).toString());
                }
            }
        });
        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myNumber1 = firstNumber.getText().toString();
                String myNumber2 = secondNumber.getText().toString();

                if(myNumber1.isEmpty() || myNumber2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Pleast insert value",Toast.LENGTH_LONG).show();
                } else {
                    Double input1 = Double.parseDouble(myNumber1);
                    Double input2 = Double.parseDouble(myNumber2);
                    multiValues(input1,input2);
                    String finalResult = String.valueOf(multiValues(input1,input2));
                    textViewResult.setText(finalResult);
                }
            }
        });


    }
    public Double sumValues(Double first,Double second){
            Double result = first + second;
        return result;
    }

    public Double multiValues(Double first,Double second){
        Double result = first * second;
        return result;
    }
}