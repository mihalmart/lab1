package com.example.reg;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Activity2 extends AppCompatActivity{
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    String krest,nol;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedinstanceState) {
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity2);

        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();

        String name = intent.getStringExtra("name");

        textView.setText(name);



        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);

        krest = "X";
        nol = "0";
        textView.setText("");
    }


    public void clcBtn1(View view){
        if (button1.getText()=="" && textView.getText() == "") {
            button1.setText(krest);
             isPlayerWinner();
             if (textView.getText() == "") {
             }
            hodPC();
        }
    }
    public void clcBtn2(View view){
        if (button2.getText()=="" && textView.getText() == "") {
            button2.setText(krest);
             isPlayerWinner();
               if (textView.getText() == "") {
              }
        hodPC();
        }
    }
    public void clcBtn3(View view){
        if (button3.getText()=="" && textView.getText() == "") {
            button3.setText(krest);
             isPlayerWinner();
            if (textView.getText() == "") {
            }
             hodPC();
        }
    }
    public void clcBtn4(View view){
        if (button4.getText()=="" && textView.getText() == "") {
            button4.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
            }
        hodPC();
        }
    }
    public void clcBtn5(View view){
        if (button5.getText()=="" && textView.getText() == "") {
            button5.setText(krest);
            isPlayerWinner();
              if (textView.getText() == "") {
            }
        hodPC();
        }
    }
    public void clcBtn6(View view){
        if (button6.getText()=="" && textView.getText() == "") {
            button6.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
            }
        hodPC();
        }
    }
    public void clcBtn7(View view){
        if (button7.getText()=="" && textView.getText() == "") {
            button7.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
            }
        hodPC();
        }
    }
    public void clcBtn8(View view){
        if (button8.getText()=="" && textView.getText() == "") {
            button8.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
               }
        hodPC();
        }
    }
    public void clcBtn9(View view){
        if (button9.getText()=="" && textView.getText() == "") {
            button9.setText(krest);
            isPlayerWinner();
            if (textView.getText() == "") {
            }
        hodPC();
        }
    }

    public void isPlayerWinner(){
        if (button1.getText() == krest && button2.getText() == krest && button3.getText() == krest) {
            textView.setText(R.string.str5);
        }
        if (button4.getText() == krest && button5.getText() == krest && button6.getText() == krest) {
            textView.setText(R.string.str5);
        }
        if (button7.getText() == krest && button8.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.str5);
        }
        if (button1.getText() == krest && button4.getText() == krest && button7.getText() == krest) {
            textView.setText(R.string.str5);
        }
        if (button3.getText() == krest && button6.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.str5);
        }
        if (button2.getText() == krest && button5.getText() == krest && button8.getText() == krest) {
            textView.setText(R.string.str5);
        }
        if (button1.getText() == krest && button5.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.str5);
        }
        if (button3.getText() == krest && button5.getText() == krest && button7.getText() == krest) {
            textView.setText(R.string.str5);
        }else
              if (button1.getText() != "" && button2.getText() != "" && button3.getText() != "" &&
                  button4.getText() != "" && button5.getText() != "" && button6.getText() != "" &&
                  button7.getText() != "" && button8.getText() != "" && button9.getText() != "") {
          textView.setText(R.string.str7);
        }

    }
    public void isPCWinner(){
        if (button1.getText() == nol && button2.getText() == nol && button3.getText() == nol) {
            textView.setText(R.string.str6);
        }
        if (button4.getText() == nol && button5.getText() == nol && button6.getText() == nol) {
            textView.setText(R.string.str6);
        }
        if (button7.getText() == nol && button8.getText() == nol && button9.getText() == nol) {
            textView.setText(R.string.str6);
        }
        if (button1.getText() == nol && button4.getText() == nol && button7.getText() == nol) {
            textView.setText(R.string.str6);
        }
        if (button2.getText() == nol && button5.getText() == nol && button8.getText() == nol) {
            textView.setText(R.string.str6);
        }
        if (button3.getText() == nol && button6.getText() == nol && button9.getText() == nol) {
            textView.setText(R.string.str6);
        }
        if (button1.getText() == nol && button5.getText() == nol && button9.getText() == nol) {
            textView.setText(R.string.str6);
        }
        if (button3.getText() == nol && button5.getText() == nol && button7.getText() == nol) {
            textView.setText(R.string.str6);
        }

    }

    private void hodPC() {
        Random random = new Random();
        int buttonPcClick = 1 + random.nextInt(9);
        Log.i("hodPC", "buttonPcClick - " + buttonPcClick);
        switch(buttonPcClick) {
            case(1): if (button1.getText() == ""){
                button1.setText(nol);
            } else{hodPC();}
                break;
            case(2): if (button2.getText() == ""){
                button2.setText(nol);
            } else{hodPC();}
                break;
            case(3): if (button3.getText() == ""){
                button3.setText(nol);
            } else{hodPC();}
                break;
            case(4): if (button4.getText() == ""){
                button4.setText(nol);
            } else{hodPC();}
                break;
            case(5): if (button5.getText() == ""){
                button5.setText(nol);
            } else{hodPC();}
                break;
            case(6): if (button6.getText() == ""){
                button6.setText(nol);
            } else{hodPC();}
                break;
            case(7): if (button7.getText() == ""){
                button7.setText(nol);
            } else{hodPC();}
                break;
            case(8): if (button8.getText() == ""){
                button8.setText(nol);
            } else{hodPC();}
                break;
            case(9): if (button9.getText() == ""){
                button9.setText(nol);
            } else{hodPC();}
                break;
        }
        isPCWinner();
    }

    public void clickRestar (View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        textView.setText("");
    }
    public void quit(View view){
        finishAndRemoveTask();

    }
}

