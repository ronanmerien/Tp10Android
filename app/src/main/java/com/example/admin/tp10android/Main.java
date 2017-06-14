package com.example.admin.tp10android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    protected int newNumber;
    protected boolean pressButton;
    protected boolean operationbutton;
    protected String operator;
    protected String addNewNumber = "";
    protected String[] saveNumber = {"", "", ""};
    protected int pileSituation = 1;
    protected int result;
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
        screenNumber();
    }

    public void numberIn2 (View view) {
        newNumber = 2;
        screenNumber();
    }

    public void numberIn3 (View view) {
        newNumber = 3;
        screenNumber();
    }

    public void numberIn4 (View view) {
        newNumber = 4;
        screenNumber();
    }

    public void numberIn5 (View view) {
        newNumber = 5;
        screenNumber();
    }

    public void numberIn6 (View view) {
        newNumber = 6;
        screenNumber();
    }

    public void numberIn7 (View view) {
        newNumber = 7;
        screenNumber();
    }

    public void numberIn8 (View view) {
        newNumber = 8;
        screenNumber();
    }

    public void numberIn9 (View view) {
        newNumber = 9;
        screenNumber();
    }

    public void inPlus (View view) {
        operator = "plus";
        operatorManager();
    }

    public void inMoins (View view) {
        operator = "moins";
        operatorManager();
    }

    public void inTimes (View view) {
        operator = "times";
        operatorManager();
    }

    public void inExe (View view) {
        clearScreen();
    }

    //on crée une méthode d'affichage du numéro tapé
    public void screenNumber () {
        pressButton = true; //vérification que le boutton à été tapé
        addNewNumber += newNumber;
        newNumber = Integer.parseInt(addNewNumber);
        resultView.setText(addNewNumber);
    }

    //on efface l'écran de saisie et on vérifie son contenu pour insérer dans la pile
    public void clearScreen() {
        if (pressButton == true) {
            pileManager();
            pressButton = false;
            addNewNumber = "";
            resultView.setText("");
        }
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
    public void operatorManager () {
        pressButton = true;
        switch (operator) {
            case "plus":
                result = Integer.parseInt(saveNumber[0]) + Integer.parseInt(saveNumber[1]);
                addNewNumber = "";
                newNumber = result;
                resultView.setText(String.valueOf(result));
                break;
            case "moins":
                result = Integer.parseInt(saveNumber[1]) - Integer.parseInt(saveNumber[0]);
                addNewNumber = "";
                newNumber = result;
                resultView.setText(String.valueOf(result));
                break;
            case "times":
                result = Integer.parseInt(saveNumber[0]) * Integer.parseInt(saveNumber[1]);
                addNewNumber = "";
                newNumber = result;
                resultView.setText(String.valueOf(result));
                break;
        }
    }
}
