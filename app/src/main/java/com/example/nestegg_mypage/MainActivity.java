package com.example.nestegg_mypage;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    Button buttonAchieve;
    Button unlock1, unlock2, unlock3, unlock4, unlock5, unlock6, unlock7;
    TextView testeggsp;
    int totaleggsp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prefSingleton.getInstance().Initialize(getApplicationContext());

        totaleggsp = prefSingleton.getInstance().getPoints("points", 0);

        unlock1 = (Button) findViewById(R.id.unlock1);
        unlock2 = (Button) findViewById(R.id.unlock2);
        unlock3 = (Button) findViewById(R.id.unlock3);
        unlock4 = (Button) findViewById(R.id.unlock4);
        unlock5 = (Button) findViewById(R.id.unlock5);
        unlock6 = (Button) findViewById(R.id.unlock6);
        unlock7 = (Button) findViewById(R.id.unlock7);

        buttonAchieve = (Button) findViewById(R.id.achievements);
        buttonAchieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAchievement();
            }
        });

        unlock1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String state = prefSingleton.getInstance().getBtnPreference("btn1", "no");
                if (totaleggsp >= 20 && state.equals("no")) {
                    unlock1.setBackgroundColor(getResources().getColor(R.color.appBrown));
                    unlock1.setEnabled(false);
                    prefSingleton.getInstance().writePreference("btn1", "yes");
                    Toast.makeText(getApplicationContext(), "Egg unlocked", LENGTH_SHORT).show(); }
                else {
                    unlock1.setEnabled(true);

                }
            }
        });

        unlock2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String state = prefSingleton.getInstance().getBtnPreference("btn2", "no");
                if (totaleggsp >= 60 && state.equals("no")) {
                    unlock2.setBackgroundColor(getResources().getColor(R.color.appBrown));
                    unlock2.setEnabled(false);
                    prefSingleton.getInstance().writePreference("btn2", "yes");
                    Toast.makeText(getApplicationContext(), "Egg unlocked", LENGTH_SHORT).show(); }
                else {
                    unlock2.setEnabled(true);

                }
            }
        });

        unlock3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String state = prefSingleton.getInstance().getBtnPreference("btn3", "no");
                if (totaleggsp >= 110 && state.equals("no")) {
                    unlock3.setBackgroundColor(getResources().getColor(R.color.appBrown));
                    unlock3.setEnabled(false);
                    prefSingleton.getInstance().writePreference("btn3", "yes");
                    Toast.makeText(getApplicationContext(), "Egg unlocked", LENGTH_SHORT).show(); }
                else {
                    unlock3.setEnabled(true);

                }
            }
        });

        unlock4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String state = prefSingleton.getInstance().getBtnPreference("btn4", "no");
                if (totaleggsp >= 260 && state.equals("no")) {
                    unlock4.setBackgroundColor(getResources().getColor(R.color.appBrown));
                    unlock4.setEnabled(false);
                    prefSingleton.getInstance().writePreference("btn4", "yes");
                    Toast.makeText(getApplicationContext(), "Egg unlocked", LENGTH_SHORT).show(); }
                else {
                    unlock4.setEnabled(true);

                }
            }
        });


        unlock5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String state = prefSingleton.getInstance().getBtnPreference("btn5", "no");
                if (totaleggsp >= 500 && state.equals("no")) {
                    unlock5.setBackgroundColor(getResources().getColor(R.color.appBrown));
                    unlock5.setEnabled(false);
                    prefSingleton.getInstance().writePreference("btn5", "yes");
                    Toast.makeText(getApplicationContext(), "Egg unlocked", LENGTH_SHORT).show(); }
                else {
                    unlock5.setEnabled(true);

                }
            }
        });


        unlock6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String state = prefSingleton.getInstance().getBtnPreference("btn6", "no");
                if (totaleggsp >= 750 && state.equals("no")) {
                    unlock6.setBackgroundColor(getResources().getColor(R.color.appBrown));
                    unlock6.setEnabled(false);
                    prefSingleton.getInstance().writePreference("btn6", "yes");
                    Toast.makeText(getApplicationContext(), "Egg unlocked", LENGTH_SHORT).show(); }
                else {
                    unlock6.setEnabled(true);

                }
            }
        });

        unlock7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String state = prefSingleton.getInstance().getBtnPreference("btn7", "no");
                if (totaleggsp >= 1000 && state.equals("no")) {
                    unlock7.setBackgroundColor(getResources().getColor(R.color.appBrown));
                    unlock7.setEnabled(false);
                    prefSingleton.getInstance().writePreference("btn7", "yes");
                    Toast.makeText(getApplicationContext(), "Egg unlocked", LENGTH_SHORT).show(); }
                else {
                    unlock7.setEnabled(true);

                }
            }
        });
        updateText();
        //calculateExp(10);
    }

    public void openAchievement(){
        Intent intent = new Intent(this, Achievement.class);
        startActivity(intent);

    }

    public void addEggsP(View v) {
        totaleggsp += 5;
        prefSingleton.getInstance().writePoints("points", totaleggsp);
        updateText();
    }

    public void updateText(){
        testeggsp = (TextView) findViewById(R.id.points);
        //calculateExp(10);
        totaleggsp = prefSingleton.getInstance().getPoints("points", 0);
        String displayXp = totaleggsp + " Eggsperience points";
        testeggsp.setText(displayXp);
        //Toast.makeText(getApplicationContext(), String.valueOf(totaleggsp), LENGTH_SHORT).show();

        if (totaleggsp >= 20)
            unlockB1();

        if (totaleggsp >= 60)
            unlockB2();

        if (totaleggsp >= 110)
            unlockB3();

        if (totaleggsp >= 260)
            unlockB4();

        if (totaleggsp >= 500)
            unlockB5();

        if (totaleggsp >= 750)
            unlockB6();

        if (totaleggsp >= 1000)
            unlockB7();

        }

    public void unlockB1(){
        String state = prefSingleton.getInstance().getBtnPreference("btn1", "no");
        if (state.equals("no")) {
            unlock1.setBackgroundColor(getResources().getColor(R.color.darkAppGreen));
        }
        else if(state.equals("yes")){
            unlock1.setText("Redeemed");
            unlock1.setBackgroundColor(getResources().getColor(R.color.appBrown));
        }
        //lock.setVisibility(View.GONE);
    }

    public void unlockB2(){
        String state = prefSingleton.getInstance().getBtnPreference("btn2", "no");
        if (state.equals("no")) {
            unlock2.setBackgroundColor(getResources().getColor(R.color.darkAppGreen));
        }
        else if(state.equals("yes")){
            unlock2.setText("Redeemed");
            unlock2.setBackgroundColor(getResources().getColor(R.color.appBrown));
        }
        //lock.setVisibility(View.GONE);
    }

    public void unlockB3(){
        String state = prefSingleton.getInstance().getBtnPreference("btn3", "no");
        if (state.equals("no")) {
            unlock3.setBackgroundColor(getResources().getColor(R.color.darkAppGreen));
        }
        else if(state.equals("yes")){
            unlock3.setText("Redeemed");
            unlock3.setBackgroundColor(getResources().getColor(R.color.appBrown));
        }
        //lock.setVisibility(View.GONE);
    }

    public void unlockB4(){
        String state = prefSingleton.getInstance().getBtnPreference("btn4", "no");
        if (state.equals("no")) {
            unlock4.setBackgroundColor(getResources().getColor(R.color.darkAppGreen));
        }
        else if(state.equals("yes")){
            unlock4.setText("Redeemed");
            unlock4.setBackgroundColor(getResources().getColor(R.color.appBrown));
        }
        //lock.setVisibility(View.GONE);
    }

    public void unlockB5(){
        String state = prefSingleton.getInstance().getBtnPreference("btn5", "no");
        if (state.equals("no")) {
            unlock5.setBackgroundColor(getResources().getColor(R.color.darkAppGreen));
        }
        else if(state.equals("yes")){
            unlock5.setText("Redeemed");
            unlock5.setBackgroundColor(getResources().getColor(R.color.appBrown));
        }
        //lock.setVisibility(View.GONE);
    }

    public void unlockB6(){
        String state = prefSingleton.getInstance().getBtnPreference("btn6", "no");
        if (state.equals("no")) {
            unlock6.setBackgroundColor(getResources().getColor(R.color.darkAppGreen));
        }
        else if(state.equals("yes")){
            unlock6.setText("Redeemed");
            unlock6.setBackgroundColor(getResources().getColor(R.color.appBrown));
        }
        //lock.setVisibility(View.GONE);
    }
    public void unlockB7(){
        String state = prefSingleton.getInstance().getBtnPreference("btn7", "no");
        if (state.equals("no")) {
            unlock7.setBackgroundColor(getResources().getColor(R.color.darkAppGreen));
        }
        else if(state.equals("yes")){
            unlock7.setText("Redeemed");
            unlock7.setBackgroundColor(getResources().getColor(R.color.appBrown));
        }
        //lock2.setVisibility(View.GONE);
    }

//    public void calculateExp(int balanceDiff){
//        int exp;
//
//        switch(balanceDiff){
//            case 100:
//                exp = 60;
//                break;
//            case 500:
//                exp = 250;
//                break;
//            case 1000:
//                exp = 500;
//                break;
//            default:
//                exp = (balanceDiff/5)*2;
//        }
//        totaleggsp = prefSingleton.getInstance().getPoints("points", 0);
//        prefSingleton.getInstance().writePoints("points", (exp+totaleggsp));
//        updateText();
//
//        //prefSingleton.getInstance().writePoints("points", exp);
//    }

}

