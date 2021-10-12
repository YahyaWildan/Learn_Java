package com.example.androidlocalstorage.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class}, version = 1)

public abstract class StudentDatabase extends RoomDatabase {
    public abstract StudentDao studentDao();

    private static StudentDatabase instance;

    public static StudentDatabase getInstance(Context context) {
        if (instance == null) {
            synchronized (StudentDatabase.class) {
                instance = Room.databaseBuilder(context.getApplicationContext(),
                        StudentDatabase.class, "studentdb").build();
            }
        }
        return instance;
    }

}
