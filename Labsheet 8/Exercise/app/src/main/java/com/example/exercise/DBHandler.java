package com.example.exercise;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    private static final String databaseName = "student_details";
    private static final int ver=1;

    public DBHandler(Context context) {
        super(context, databaseName, null, ver );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql="CREATE TABLE student(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, age TEXT, address TEXT, dep TEXT);";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS student_details;";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }
}
