package com.example.nestegg_mypage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class Achievement extends AppCompatActivity {

    Dialog myDialog;
    int totaleggsp = 0;
    int check = 0;
    TextView txtclose, testeggsp;
    Button btnCollect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement);
        Intent mIntent = getIntent();

        totaleggsp = mIntent.getIntExtra("EggspPoints", 0);

        myDialog = new Dialog(this);
    }

    public void ShowPopup(View v){
        myDialog.setContentView(R.layout.ach1popup);
        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        btnCollect = (Button) myDialog.findViewById(R.id.collegeBtn);

        if (totaleggsp == 10)
            unlockB1();

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        btnCollect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (totaleggsp >= 10){
                    btnCollect.setBackgroundColor(Color.GRAY);
                    btnCollect.setEnabled(false);
                    Toast.makeText(getApplicationContext(), String.valueOf(totaleggsp), Toast.LENGTH_LONG).show();
                    add();
                    }

                    else {
                        btnCollect.setClickable(false);
                    }
                }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }


    public void ShowPopup2(View v){
        TextView txtclose2;
        Button btnCollect2;
        myDialog.setContentView(R.layout.ach2popup);
        txtclose2 = (TextView) myDialog.findViewById(R.id.txtclose);
        btnCollect2 = (Button) myDialog.findViewById(R.id.collegeBtn);
        txtclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void ShowPopup3(View v){
        TextView txtclose3;
        Button btnCollect3;
        myDialog.setContentView(R.layout.ach3popup);
        txtclose3 = (TextView) myDialog.findViewById(R.id.txtclose);
        btnCollect3 = (Button) myDialog.findViewById(R.id.collegeBtn);
        txtclose3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }


    public void ShowPopup4(View v){
        TextView txtclose4;
        Button btnCollect4;
        myDialog.setContentView(R.layout.ach4popup);
        txtclose4 = (TextView) myDialog.findViewById(R.id.txtclose);
        btnCollect4 = (Button) myDialog.findViewById(R.id.collegeBtn);
        txtclose4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void ShowPopup5(View v){
        TextView txtclose5;
        Button btnCollect5;
        myDialog.setContentView(R.layout.ach5popup);
        txtclose5 = (TextView) myDialog.findViewById(R.id.txtclose);
        btnCollect5 = (Button) myDialog.findViewById(R.id.collegeBtn);
        txtclose5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void ShowPopup6(View v){
        TextView txtclose6;
        Button btnCollect6;
        myDialog.setContentView(R.layout.ach6popup);
        txtclose6 = (TextView) myDialog.findViewById(R.id.txtclose);
        btnCollect6 = (Button) myDialog.findViewById(R.id.collegeBtn);
        txtclose6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void ShowPopup7(View v){
        TextView txtclose7;
        Button btnCollect7;
        myDialog.setContentView(R.layout.ach7popup);
        txtclose7 = (TextView) myDialog.findViewById(R.id.txtclose);
        btnCollect7 = (Button) myDialog.findViewById(R.id.collegeBtn);
        txtclose7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void ShowPopup8(View v){
        TextView txtclose8;
        Button btnCollect8;
        myDialog.setContentView(R.layout.ach8popup);
        txtclose8 = (TextView) myDialog.findViewById(R.id.txtclose);
        btnCollect8 = (Button) myDialog.findViewById(R.id.collegeBtn);
        txtclose8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void ShowPopup9(View v){
        TextView txtclose9;
        Button btnCollect9;
        myDialog.setContentView(R.layout.ach9popup);
        txtclose9 = (TextView) myDialog.findViewById(R.id.txtclose);
        btnCollect9 = (Button) myDialog.findViewById(R.id.collegeBtn);
        txtclose9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowPopup10(View v){
        TextView txtclose10;
        Button btnCollect10;
        myDialog.setContentView(R.layout.ach10popup);
        txtclose10 = (TextView) myDialog.findViewById(R.id.txtclose);
        btnCollect10 = (Button) myDialog.findViewById(R.id.collegeBtn);
        txtclose10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void ShowPopup11(View v){
        TextView txtclose11;
        Button btnCollect11;
        myDialog.setContentView(R.layout.ach11popup);
        txtclose11 = (TextView) myDialog.findViewById(R.id.txtclose);
        btnCollect11 = (Button) myDialog.findViewById(R.id.collegeBtn);
        txtclose11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void add() {
        //Toast.makeText(getApplicationContext(), "HERE!", LENGTH_SHORT).show();
        totaleggsp += 10;
        Intent intent2 = new Intent(this, MainActivity.class);
        intent2.putExtra("EggspPoints", totaleggsp);
        startActivity(intent2);
        //stesteggsp.setText(totaleggsp + " Eggsperience points");

    }

    public void unlockB1(){
        btnCollect.setBackgroundColor(getResources().getColor(R.color.babyblue));
    }

//    public void unlockB2(){
//        unlock2.setBackgroundColor(getResources().getColor(R.color.babyblue));
//    }



}