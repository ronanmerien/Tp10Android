package com.example.admin.tp10android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    protected int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //on crée les méthodes onClick des différents bouttons
    public void numberIn1 (View view) {
        number = 1;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.valueOf(number));
    }

    public void numberIn2 (View view) {
        number = 2;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.valueOf(number));
    }

    public void numberIn3 (View view) {
        number = 3;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.valueOf(number));
    }

    public void numberIn4 (View view) {
        number = 4;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.valueOf(number));
    }

    public void numberIn5 (View view) {
        number = 5;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.valueOf(number));
    }

    public void numberIn6 (View view) {
        number = 6;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.valueOf(number));
    }

    public void numberIn7 (View view) {
        number = 7;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.valueOf(number));
    }

    public void numberIn8 (View view) {
        number = 8;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.valueOf(number));
    }

    public void numberIn9 (View view) {
        number = 9;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.valueOf(number));
    }
}
