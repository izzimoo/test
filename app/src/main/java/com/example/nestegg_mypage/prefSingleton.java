package com.example.nestegg_mypage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class prefSingleton {
    private static prefSingleton mInstance;
    private Context mContext;
    //
    private SharedPreferences mMyPreferences;

    private prefSingleton(){ }

    public static prefSingleton getInstance(){
        if (mInstance == null) mInstance = new prefSingleton();
        return mInstance;
    }

    public void Initialize(Context ctxt){
        mContext = ctxt;
        //
        mMyPreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
    }

    public void writePreference(String key, String value){
        SharedPreferences.Editor e = mMyPreferences.edit();
        e.putString(key, value);
        e.commit();
    }

    public void writePoints(String key, int value){
        SharedPreferences.Editor e = mMyPreferences.edit();
        e.putInt(key, value);
        e.commit();
    }

    public void writeUpdate(String value){
        SharedPreferences.Editor e = mMyPreferences.edit();
        e.putString("update", value);
        e.commit();
    }

    public String getBtnPreference(String key, String defaultVal){
        String state = mMyPreferences.getString(key, defaultVal);
        return state;
    }

    public int getPoints(String key, int defaultVal){
        int points = mMyPreferences.getInt(key, defaultVal);
        return points;
    }
    public String getUpdate(){
        String update = mMyPreferences.getString("update", "xxx");
        return update;
    }
}
