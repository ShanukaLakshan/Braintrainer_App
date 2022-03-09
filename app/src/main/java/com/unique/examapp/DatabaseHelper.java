package com.unique.examapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import static android.content.ContentValues.TAG;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseHelper";

    public DatabaseHelper(@Nullable Context context) {

        super(context, "name.db", null, 21 );

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists User (id integer primary key autoincrement, email text, password text,school text,grade text)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists Useer");
        onCreate(db);
    }

    public void registerUser(Data data){

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put( "email" ,data.getEmail());
        contentValues.put("password", data.getPassword());
        contentValues.put("confirmpassword", data.getConfirmPassword());
        contentValues.put("name", data.getName());
        contentValues.put("school", data.getSchool());
        contentValues.put("grade", data.getGrade());

        long user = sqLiteDatabase.insert("User", null, contentValues);
        if (user != -1){
            Log.e(TAG,"registerUser:  User Register Successfully");
        }else{
            Log.e(TAG,"registerUser:  Error in Register");
        }
    }

    public void loginUser(Data data){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase() ;
        Cursor cursor = sqLiteDatabase.rawQuery("select * from User", null,null);

        while (cursor.moveToNext()){
            String email = cursor.getString(1);
            String password = cursor.getString(2);

            if(email.equals(data.getEmail()) && password.equals(data.getPassword()) ){
                Log.e(TAG, "loginUser: User Login Successfully");
            }else{
                Log.e(TAG, "loginUser: Error in Login ");
            }
        }



    }



}
