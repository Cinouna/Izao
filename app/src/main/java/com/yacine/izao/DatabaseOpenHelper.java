package com.yacine.izao;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseOpenHelper extends SQLiteAssetHelper {

    private static final String DATABSE_NAME = "db_menuGenerator.db";

    public DatabaseOpenHelper(Context context){
        super(context, DATABSE_NAME, null, 1);
    }
}
