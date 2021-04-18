package com.example.nestegg_mypage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Achievement extends AppCompatActivity {

    Dialog myDialog;
    int totaleggsp = 0;
    int token;
    String redeemed = "Already redeemed";

    public static final String pop1 = "pop1" ;
    public static final String pop2 = "pop2" ;
    public static final String pop3 = "pop3" ;
    public static final String pop4 = "pop4" ;
    public static final String pop5 = "pop5" ;
    public static final String pop6 = "pop6" ;
    public static final String pop7 = "pop7" ;
    public static final String pop8 = "pop8" ;
    public static final String pop9 = "pop9" ;
    public static final String pop10 = "pop10" ;
    public static final String pop11 = "pop11" ;
    public static final String points = "points" ;
    public String unlocked = "no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement);
        myDialog = new Dialog(this);
    }

    ///////////////////////////////////////////// First PopUP window code //////////////////////////////////////////////////

    public void ShowPopup1(View v){
        TextView txtclose1;
        Button btnCollect1;
        totaleggsp = prefSingleton.getInstance().getPoints(points, 0);
        String state = prefSingleton.getInstance().getBtnPreference(pop1, unlocked);
        myDialog.setContentView(R.layout.ach1popup);
        txtclose1 = (TextView) myDialog.findViewById(R.id.txtclose1);
        btnCollect1 = (Button) myDialog.findViewById(R.id.popupBtn1);
        if(state.equals("yes")){
            btnCollect1.setText(redeemed);
            btnCollect1.setBackgroundColor(Color.GRAY);
        }
        Log.i("tag", state);

        txtclose1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("tag", "here1");
                if (totaleggsp >= 10 && state.equals("no")){
                    btnCollect1.setBackgroundColor(Color.GRAY);
                    prefSingleton.getInstance().writePreference(pop1,"yes");
                    token = 1;
                    add(token);
                }
                else {
                    myDialog.dismiss();
                }
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    ///////////////////////////////////////////// Second PopUP window code //////////////////////////////////////////////////

    public void ShowPopup2(View v){
        TextView txtclose2;
        Button btnCollect2;
        totaleggsp = prefSingleton.getInstance().getPoints(points, 0);
        String state = prefSingleton.getInstance().getBtnPreference(pop2, unlocked);
        myDialog.setContentView(R.layout.ach2popup);
        txtclose2 = (TextView) myDialog.findViewById(R.id.txtclose2);
        btnCollect2 = (Button) myDialog.findViewById(R.id.popupBtn2);
        if(state.equals("yes")){
            btnCollect2.setText(redeemed);
            btnCollect2.setBackgroundColor(Color.GRAY);
        }

        txtclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (totaleggsp >= 20 && state.equals("no")){
                    btnCollect2.setBackgroundColor(Color.GRAY);
                    prefSingleton.getInstance().writePreference(pop2,"yes");
                    token = 2;
                    add(token);
                }
                else {
                    myDialog.dismiss();
                }
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    ///////////////////////////////////////////// Third PopUP window code //////////////////////////////////////////////////

    public void ShowPopup3(View v){
        TextView txtclose3;
        Button btnCollect3;
        totaleggsp = prefSingleton.getInstance().getPoints(points, 0);
        String state = prefSingleton.getInstance().getBtnPreference(pop3, unlocked);
        myDialog.setContentView(R.layout.ach3popup);
        txtclose3 = (TextView) myDialog.findViewById(R.id.txtclose3);
        btnCollect3 = (Button) myDialog.findViewById(R.id.popupBtn3);
        if(state.equals("yes")){
            btnCollect3.setText(redeemed);
            btnCollect3.setBackgroundColor(Color.GRAY);
        }
        Log.i("tag", state);

        txtclose3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("tag", "here1");
                if (totaleggsp >= 30 && state.equals("no")){
                    btnCollect3.setBackgroundColor(Color.GRAY);
                    prefSingleton.getInstance().writePreference(pop3,"yes");
                    token = 3;
                    add(token);
                }
                else {
                    myDialog.dismiss();
                }
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    ///////////////////////////////////////////// Fourth PopUP window code //////////////////////////////////////////////////

    public void ShowPopup4(View v){
        TextView txtclose4;
        Button btnCollect4;
        totaleggsp = prefSingleton.getInstance().getPoints(points, 0);
        String state = prefSingleton.getInstance().getBtnPreference(pop4, unlocked);
        myDialog.setContentView(R.layout.ach4popup);
        txtclose4 = (TextView) myDialog.findViewById(R.id.txtclose4);
        btnCollect4 = (Button) myDialog.findViewById(R.id.popupBtn4);
        if(state.equals("yes")){
            btnCollect4.setText(redeemed);
            btnCollect4.setBackgroundColor(Color.GRAY);
        }
        Log.i("tag", state);

        txtclose4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("tag", "here1");
                if (totaleggsp >= 40 && state.equals("no")){
                    btnCollect4.setBackgroundColor(Color.GRAY);
                    prefSingleton.getInstance().writePreference(pop4,"yes");
                    token = 4;
                    add(token);
                }
                else {
                    myDialog.dismiss();
                }
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    ///////////////////////////////////////////// Five PopUP window code //////////////////////////////////////////////////

    public void ShowPopup5(View v){
        TextView txtclose5;
        Button btnCollect5;
        totaleggsp = prefSingleton.getInstance().getPoints(points, 0);
        String state = prefSingleton.getInstance().getBtnPreference(pop5, unlocked);
        myDialog.setContentView(R.layout.ach5popup);
        txtclose5 = (TextView) myDialog.findViewById(R.id.txtclose5);
        btnCollect5 = (Button) myDialog.findViewById(R.id.popupBtn5);
        if(state.equals("yes")){
            btnCollect5.setText(redeemed);
            btnCollect5.setBackgroundColor(Color.GRAY);
        }
        Log.i("tag", state);

        txtclose5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("tag", "here1");
                if (totaleggsp >= 50 && state.equals("no")){
                    btnCollect5.setBackgroundColor(Color.GRAY);
                    prefSingleton.getInstance().writePreference(pop5,"yes");
                    token = 5;
                    add(token);
                }
                else {
                    myDialog.dismiss();
                }
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    ///////////////////////////////////////////// Six PopUP window code //////////////////////////////////////////////////

    public void ShowPopup6(View v){
        TextView txtclose6;
        Button btnCollect6;
        totaleggsp = prefSingleton.getInstance().getPoints(points, 0);
        String state = prefSingleton.getInstance().getBtnPreference(pop6, unlocked);
        myDialog.setContentView(R.layout.ach6popup);
        txtclose6 = (TextView) myDialog.findViewById(R.id.txtclose6);
        btnCollect6 = (Button) myDialog.findViewById(R.id.popupBtn6);
        if(state.equals("yes")){
            btnCollect6.setText(redeemed);
            btnCollect6.setBackgroundColor(Color.GRAY);
        }
        Log.i("tag", state);

        txtclose6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("tag", "here1");
                if (totaleggsp >= 60 && state.equals("no")){
                    btnCollect6.setBackgroundColor(Color.GRAY);
                    prefSingleton.getInstance().writePreference(pop6,"yes");
                    token = 6;
                    add(token);
                }
                else {
                    myDialog.dismiss();
                }
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    ///////////////////////////////////////////// Seven PopUP window code //////////////////////////////////////////////////

    public void ShowPopup7(View v){
        TextView txtclose7;
        Button btnCollect7;
        totaleggsp = prefSingleton.getInstance().getPoints(points, 0);
        String state = prefSingleton.getInstance().getBtnPreference(pop7, unlocked);
        myDialog.setContentView(R.layout.ach7popup);
        txtclose7 = (TextView) myDialog.findViewById(R.id.txtclose7);
        btnCollect7 = (Button) myDialog.findViewById(R.id.popupBtn7);
        if(state.equals("yes")){
            btnCollect7.setText(redeemed);
            btnCollect7.setBackgroundColor(Color.GRAY);
        }
        Log.i("tag", state);

        txtclose7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("tag", "here1");
                if (totaleggsp >= 70 && state.equals("no")){
                    btnCollect7.setBackgroundColor(Color.GRAY);
                    prefSingleton.getInstance().writePreference(pop7,"yes");
                    token = 7;
                    add(token);
                }
                else {
                    myDialog.dismiss();
                }
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    ///////////////////////////////////////////// Eight PopUP window code //////////////////////////////////////////////////

    public void ShowPopup8(View v){
        TextView txtclose8;
        Button btnCollect8;
        totaleggsp = prefSingleton.getInstance().getPoints(points, 0);
        String state = prefSingleton.getInstance().getBtnPreference(pop8, unlocked);
        myDialog.setContentView(R.layout.ach8popup);
        txtclose8 = (TextView) myDialog.findViewById(R.id.txtclose8);
        btnCollect8 = (Button) myDialog.findViewById(R.id.popupBtn8);
        if(state.equals("yes")){
            btnCollect8.setText(redeemed);
            btnCollect8.setBackgroundColor(Color.GRAY);
        }
        Log.i("tag", state);

        txtclose8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("tag", "here1");
                if (totaleggsp >= 80 && state.equals("no")){
                    btnCollect8.setBackgroundColor(Color.GRAY);
                    prefSingleton.getInstance().writePreference(pop8,"yes");
                    token = 8;
                    add(token);
                }
                else {
                    myDialog.dismiss();
                }
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    ///////////////////////////////////////////// Ninth PopUP window code //////////////////////////////////////////////////

    public void ShowPopup9(View v){
        TextView txtclose9;
        Button btnCollect9;
        totaleggsp = prefSingleton.getInstance().getPoints(points, 0);
        String state = prefSingleton.getInstance().getBtnPreference(pop9, unlocked);
        myDialog.setContentView(R.layout.ach9popup);
        txtclose9 = (TextView) myDialog.findViewById(R.id.txtclose9);
        btnCollect9 = (Button) myDialog.findViewById(R.id.popupBtn9);
        if(state.equals("yes")){
            btnCollect9.setText(redeemed);
            btnCollect9.setBackgroundColor(Color.GRAY);
        }
        Log.i("tag", state);

        txtclose9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("tag", "here1");
                if (totaleggsp >= 90 && state.equals("no")){
                    btnCollect9.setBackgroundColor(Color.GRAY);
                    prefSingleton.getInstance().writePreference(pop9,"yes");
                    token = 9;
                    add(token);
                }
                else {
                    myDialog.dismiss();
                }
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    ///////////////////////////////////////////// Tenth PopUP window code //////////////////////////////////////////////////

    public void ShowPopup10(View v){
        TextView txtclose10;
        Button btnCollect10;
        totaleggsp = prefSingleton.getInstance().getPoints(points, 0);
        String state = prefSingleton.getInstance().getBtnPreference(pop10, unlocked);
        myDialog.setContentView(R.layout.ach10popup);
        txtclose10 = (TextView) myDialog.findViewById(R.id.txtclose10);
        btnCollect10 = (Button) myDialog.findViewById(R.id.popupBtn10);
        if(state.equals("yes")){
            btnCollect10.setText(redeemed);
            btnCollect10.setBackgroundColor(Color.GRAY);
        }
        Log.i("tag", state);

        txtclose10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("tag", "here1");
                if (totaleggsp >= 100 && state.equals("no")){
                    btnCollect10.setBackgroundColor(Color.GRAY);
                    prefSingleton.getInstance().writePreference(pop10,"yes");
                    token = 10;
                    add(token);
                }
                else {
                    myDialog.dismiss();
                }
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    ///////////////////////////////////////////// Eleventh PopUP window code //////////////////////////////////////////////////

    public void ShowPopup11(View v){
        TextView txtclose11;
        Button btnCollect11;
        totaleggsp = prefSingleton.getInstance().getPoints(points, 0);
        String state = prefSingleton.getInstance().getBtnPreference(pop11, unlocked);
        myDialog.setContentView(R.layout.ach11popup);
        txtclose11 = (TextView) myDialog.findViewById(R.id.txtclose11);
        btnCollect11 = (Button) myDialog.findViewById(R.id.popupBtn11);
        if(state.equals("yes")){
            btnCollect11.setText(redeemed);
            btnCollect11.setBackgroundColor(Color.GRAY);
        }
        Log.i("tag", state);

        txtclose11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("tag", "here1");
                if (totaleggsp >= 110 && state.equals("no")){
                    btnCollect11.setBackgroundColor(Color.GRAY);
                    prefSingleton.getInstance().writePreference(pop11,"yes");
                    token = 11;
                    add(token);
                }
                else {
                    myDialog.dismiss();
                }
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    ////////////////////////////////////////// Code for adding XP depending on popup window /////////////////////////////////////////

    public void add(int popupNo) {
        int eggp = prefSingleton.getInstance().getPoints(points, 0);
        switch(popupNo) {
            case 1:
                eggp += 10;
                break;
            case 2:
                eggp += 20;
                break;
            case 3:
                eggp += 30;
                break;
            case 4:
                eggp += 40;
                break;
            case 5:
                eggp += 50;
                break;
            case 6:
                eggp += 60;
                break;
            case 7:
                eggp += 70;
                break;
            case 8:
                eggp += 80;
                break;
            case 9:
                eggp += 90;
                break;
            case 10:
                eggp += 100;
                break;
            case 11:
                eggp += 110;
                break;
            default:
                eggp += 0;
        }
        prefSingleton.getInstance().writePoints(points, eggp);
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }

}