package com.example.androidlocalstorage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preference {

    private static Preference instance;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public Preference(Context context) {
        sharedPreferences = context.getSharedPreferences(Constant.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public static Preference getInstance(Context context) {
        if (instance == null) {
            instance = new Preference(context);
        }
        return instance;
    }
    public SharedPreferences getSharedPreferences(){
        return sharedPreferences;
    }
    public SharedPreferences.Editor getEditor(){
        return editor;
    }
}
