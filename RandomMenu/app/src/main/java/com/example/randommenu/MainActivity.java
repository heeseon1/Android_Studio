package com.example.randommenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button randombutton = (Button) findViewById(R.id.randombutton);
        TextView textView = (TextView) findViewById(R.id.textView);

        randombutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                for(int i= 0; i <6; i++){
                    int random = (int)(Math.random()*6);
                    if (random==0) textView.setText("한식");
                    else if (random==1) textView.setText("중식");
                    else if (random==2) textView.setText("일식");
                    else if (random==3) textView.setText("양식");
                    else if (random==4) textView.setText("멕시코음식");
                    else textView.setText("아시안음식");}
        }
    });

    }
}