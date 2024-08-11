package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         number1Text = findViewById(R.id.Number1Text);
         number2Text = findViewById(R.id.Number2Text);
         resultText = findViewById(R.id.resultText);



    }
    public  void Toplama(View view){


        if (number1Text.getText().toString() .matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number");
        }else {
            int mynumber1 = Integer.parseInt(number1Text.getText().toString());
            int mynumber2 = Integer.parseInt(number2Text.getText().toString());
            int result = mynumber1 - mynumber2 ;
            resultText.setText("result" + result);

        }


    }
    public  void cikarma(View view){
        if (number1Text.getText().toString() .matches("") || number2Text.getText().toString().matches("")) {
           resultText.setText("Enter number");
        }else {
            int mynumber1 = Integer.parseInt(number1Text.getText().toString());
            int mynumber2 = Integer.parseInt(number2Text.getText().toString());
            int result = mynumber1 - mynumber2 ;
            resultText.setText("result" + result);

        }



    }
    public  void Carpma(View view){
        if (number1Text.getText().toString() .matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number");
        }else {
            int mynumber1 = Integer.parseInt(number1Text.getText().toString());
            int mynumber2 = Integer.parseInt(number2Text.getText().toString());
            int result = mynumber1 - mynumber2 ;
            resultText.setText("result" + result);

        }

    }
    public  void bölme(View view){
        if (number1Text.getText().toString() .matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number");
        }else {
            int mynumber1 = Integer.parseInt(number1Text.getText().toString());
            int mynumber2 = Integer.parseInt(number2Text.getText().toString());
            int result = mynumber1 - mynumber2 ;
            resultText.setText("result" + result);

        }

    }
    public  void Delete(View view){

    }
}