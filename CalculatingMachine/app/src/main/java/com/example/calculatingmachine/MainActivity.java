package com.example.calculatingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Number1 = (EditText) findViewById(R.id.Number1);
        EditText Number2 = (EditText) findViewById(R.id.Number2);

        Button plus = (Button) findViewById(R.id.plus);
        Button minus = (Button) findViewById(R.id.minus);
        Button gob = (Button) findViewById(R.id.gob);
        Button nanum = (Button) findViewById(R.id.nanum);

        TextView hap = (TextView) findViewById(R.id.hap);


        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String num1 = Number1.getText().toString();
                String num2 = Number2.getText().toString();
                Integer num3 = Integer.parseInt(num1) + Integer.parseInt(num2);
                hap.setText(num3.toString());
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String num1 = Number1.getText().toString();
                    String num2 = Number2.getText().toString();
                    Integer num3 = Integer.parseInt(num1) - Integer.parseInt(num2);
                    hap.setText(num3.toString());
                }
        });

        gob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String num1 = Number1.getText().toString();
                String num2 = Number2.getText().toString();
                Integer num3 = Integer.parseInt(num1) * Integer.parseInt(num2);
                hap.setText(num3.toString());
            }
        });

        nanum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String num1 = Number1.getText().toString();
                String num2 = Number2.getText().toString();
                Integer num3 = Integer.parseInt(num1) / Integer.parseInt(num2);
                hap.setText(num3.toString());
            }
        });
    }
}