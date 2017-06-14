package com.example.admin.tp10android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    protected int newNumber;
    protected boolean pressButton;
    protected String operator;
    protected String[] saveNumber = {"", "", ""};
    protected int pileSituation = 1;
    protected double result;
    TextView pile1;
    TextView pile2;
    TextView pile3;
    TextView pile4;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pile1 = (TextView) findViewById(R.id.pile1);
        pile2 = (TextView) findViewById(R.id.pile2);
        pile3 = (TextView) findViewById(R.id.pile3);
        pile4 = (TextView) findViewById(R.id.pile4);
        resultView = (TextView) findViewById(R.id.result);
    }

    //on crée les méthodes onClick des différents bouttons numéro
    public void numberIn1 (View view) {
        newNumber = 1;
        pileManager();
    }

    public void numberIn2 (View view) {
        newNumber = 2;
        pileManager();
    }

    public void numberIn3 (View view) {
        newNumber = 3;
        pileManager();
    }

    public void numberIn4 (View view) {
        newNumber = 4;
        pileManager();
    }

    public void numberIn5 (View view) {
        newNumber = 5;
        pileManager();
    }

    public void numberIn6 (View view) {
        newNumber = 6;
        pileManager();
    }

    public void numberIn7 (View view) {
        newNumber = 7;
        pileManager();
    }

    public void numberIn8 (View view) {
        newNumber = 8;
        pileManager();
    }

    public void numberIn9 (View view) {
        newNumber = 9;
        pileManager();
    }

    public void inPlus (View view) {
        operator = "plus";
        resultManager();
    }

    public void inExe (View view) {
        pileManager();
    }

    //on crée une méthode qui gère les piles de numéros
    public void pileManager () {
        switch (pileSituation) {
            case 1:
                pile1.setText(String.valueOf(newNumber));
                saveNumber[0] = String.valueOf(newNumber);
                pileSituation += 1;
                break;
            case 2:
                pile1.setText(String.valueOf(newNumber));
                pile2.setText(String.valueOf(saveNumber[0]));
                saveNumber[1] = saveNumber[0];
                saveNumber[0] = String.valueOf(newNumber);
                pileSituation += 1;
                break;
            case 3:
                pile1.setText(String.valueOf(newNumber));
                pile2.setText(String.valueOf(saveNumber[0]));
                pile3.setText(String.valueOf(saveNumber[1]));
                saveNumber[2] = saveNumber[1];
                saveNumber[1] = saveNumber[0];
                saveNumber[0] = String.valueOf(newNumber);
                pileSituation += 1;
                break;
            case 4:
                pile1.setText(String.valueOf(newNumber));
                pile2.setText(String.valueOf(saveNumber[0]));
                pile3.setText(String.valueOf(saveNumber[1]));
                pile4.setText(String.valueOf(saveNumber[2]));
                saveNumber[2] = saveNumber[1];
                saveNumber[1] = saveNumber[0];
                saveNumber[0] = String.valueOf(newNumber);
                break;
        }
    }

    //on crée une méthode de gestion des opérateur et du résultat
    public void resultManager() {
        switch (operator) {
            case "plus":
                result = Integer.parseInt(saveNumber[0]) + Integer.parseInt(saveNumber[1]);
                resultView.setText(String.valueOf(result));
                break;
            case "moins":

                break;
            case "times":

                break;
        }
    }
}
