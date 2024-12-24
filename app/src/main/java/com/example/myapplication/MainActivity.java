package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numberA;
    private TextView textZnak;
    private EditText numberB;
    private TextView textRes;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonD;
    private Button buttonY;
    private Button buttonDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberA=findViewById(R.id.numberA);
        textZnak=findViewById(R.id.textZnak);
        numberB=findViewById(R.id.numberB);
        textRes=findViewById(R.id.textRes);
        buttonPlus=findViewById(R.id.buttonPlus);
        buttonMinus=findViewById(R.id.buttonMinus);
        buttonD=findViewById(R.id.buttonD);
        buttonY=findViewById(R.id.buttonY);
        buttonDelete=findViewById(R.id.buttonDelete);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textZnak.setText("+");
                String A = numberA.getText().toString();
                String B = numberB.getText().toString();
                if (A.equals("")){
                    A = "0";
                }
                if (B.equals("")){
                    B = "0";
                }
                Float a = Float.valueOf(A);
                Float b = Float.valueOf(B);
                Float num = a + b;
                textRes.setText("= " + num.toString());
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textZnak.setText("-");
                String A = numberA.getText().toString();
                String B = numberB.getText().toString();
                if (A.equals("")){
                    A = "0";
                }
                if (B.equals("")){
                    B = "0";
                }
                Float a = Float.valueOf(A);
                Float b = Float.valueOf(B);
                Float num = a - b;
                textRes.setText("= " + num.toString());
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textZnak.setText("/");
                String A = numberA.getText().toString();
                String B = numberB.getText().toString();
                if (A.equals("")){
                    A = "0";
                }
                if (B.equals("")){
                    B = "0";
                }
                Float a = Float.valueOf(A);
                Float b = Float.valueOf(B);
                if (b==0){
                    textRes.setText("Ошибка");
                }
                else {
                    Float num = a / b;
                    textRes.setText("= " + num.toString());
                }
            }
        });
        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textZnak.setText("*");
                String A = numberA.getText().toString();
                String B = numberB.getText().toString();
                if (A.equals("")){
                    A = "0";
                }
                if (B.equals("")){
                    B = "0";
                }
                Float a = Float.valueOf(A);
                Float b = Float.valueOf(B);
                Float num = a * b;
                textRes.setText("= " + num.toString());

            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textZnak.setText("");
                numberA.setText("");
                numberB.setText("");
                textRes.setText("");
            }
        });

    }
}