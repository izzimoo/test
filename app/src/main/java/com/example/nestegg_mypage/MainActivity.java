package com.example.nestegg_mypage;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    Button buttonAchieve;
    Button unlock1, unlock2, collect1;
    ImageView lock, lock2;
    TextView testeggsp;
    int totaleggsp = 0;

    private ImageView profileImage;
    private static final int PICK_IMAGE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent mIntent2 = getIntent();
        totaleggsp = mIntent2.getIntExtra("EggspPoints", 0);
        updateText();

        collect1 = (Button) findViewById(R.id.collegeBtn);
        lock = (ImageView) findViewById(R.id.lock1);
        lock2 = (ImageView) findViewById(R.id.lock2);

        buttonAchieve = (Button) findViewById(R.id.achievements);
        buttonAchieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAchievement();
            }
        });

        unlock1 = (Button) findViewById(R.id.unlock1);
        unlock1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (totaleggsp >= 20) {
                    unlock1.setBackgroundColor(Color.GRAY);
                    unlock1.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Egg unlocked", LENGTH_SHORT).show(); }
                else {
                    unlock1.setEnabled(true);

                }
            }
        });

        unlock2 = (Button) findViewById(R.id.unlock2);
        unlock2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (totaleggsp >= 50) {
                    unlock2.setBackgroundColor(Color.GRAY);
                    unlock2.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Egg unlocked", LENGTH_SHORT).show(); }
                else {
                    unlock2.setEnabled(true);

                }
            }
        });

    }

    public void openAchievement(){
        Intent intent = new Intent(this, Achievement.class);
        intent.putExtra("EggspPoints", totaleggsp);
        startActivity(intent);

    }

    public void addEggsP(View v) {
        totaleggsp += 5;
        //Toast.makeText(this, "5 coins successfully earned!", Toast.LENGTH_SHORT).show();
        updateText();
    }

    public void updateText(){
        testeggsp = (TextView) findViewById(R.id.points);
        testeggsp.setText(totaleggsp + " Eggsperience points");

        if (totaleggsp == 20)
            unlockB1();
        if (totaleggsp == 50)
            unlockB2();
       // if (totaleggsp == 10)
          //  unlockC1();

        }


    public void unlockB1(){
        unlock1.setBackgroundColor(getResources().getColor(R.color.babyblue));
        lock.setVisibility(View.GONE);
    }
    public void unlockB2(){
        unlock2.setBackgroundColor(getResources().getColor(R.color.babyblue));
        lock2.setVisibility(View.GONE);
    }

//    public void unlockC1(){
//        collect1.setBackgroundColor(getResources().getColor(R.color.babyblue));
//    }






}

