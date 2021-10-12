package com.example.roomdatabase.data;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PersonDao {

    @Query("SELECT * FROM person")
    List<Person> getAllPerson();

    @Insert(onConflict = REPLACE)
    Long insert(Person person);

    @Update
    int update(Person person);

    @Delete
    int delete(Person person);



}

