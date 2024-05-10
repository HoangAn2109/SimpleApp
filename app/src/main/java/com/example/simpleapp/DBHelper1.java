package com.example.simpleapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper1 extends SQLiteOpenHelper {

    public static final String DBNAME = "Payment.db";
    public DBHelper1(Context context) {
        super(context, "Payment.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase mydb) {
        mydb.execSQL("create Table payment(name TEXT , email TEXT primary key, date1 TEXT, date2 TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase mydb, int i, int i1) {
        mydb.execSQL("drop Table if exists payment");
    }

    public Boolean insertData1(String name, String email, String date1, String date2){
        SQLiteDatabase mydb = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("name", name);
        contentValues.put("email", email);
        contentValues.put("date1", date1);
        contentValues.put("date2", date2);
        long result = mydb.insert("payment", null, contentValues);
        if(result==-1) return false;
        else
            return true;
    }
}
