package com.example.roomdatabase.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Person.class},version = 1)
public abstract class PersonDatabase extends RoomDatabase {

    public abstract PersonDao personDao();

    private static PersonDatabase instance;

    public static PersonDatabase getInstance(Context context){
        if (instance == null){
            synchronized (PersonDatabase.class){
                instance = Room.databaseBuilder(context.getApplicationContext(),
                        PersonDatabase.class,"persondb").build();
            }
        }
        return instance;
    }
}
