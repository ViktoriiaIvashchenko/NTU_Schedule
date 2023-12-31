package com.example.ntu;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.SQLException;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import Utils.Util;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static String DB_PATH;
    public final Context context;

    public DatabaseHelper(Context context) {
        super(context,Util.DATABASE_NAME, null, Util.DATABASE_VERSION);
        this.context = context;
        DB_PATH =context.getFilesDir().getPath() + Util.DATABASE_NAME;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public void create_db(){

        File file = new File(DB_PATH);
        if (!file.exists()) {
            //отримуємо локальну бд
            try(InputStream myInput = context.getAssets().open(Util.DATABASE_NAME);
                // відкриваємо порожню бд
                OutputStream myOutput = new FileOutputStream(DB_PATH)) {

                // побайтово копіюємо бд
                byte[] buffer = new byte[1024];
                int length;
                while ((length = myInput.read(buffer)) > 0) {
                    myOutput.write(buffer, 0, length);
                }
                myOutput.flush();
            }
            catch(IOException ex){
                Log.d("DatabaseHelper", ex.getMessage());
            }
        }
    }
    public SQLiteDatabase open()throws SQLException {

        return SQLiteDatabase.openDatabase(DB_PATH, null, SQLiteDatabase.OPEN_READWRITE);
    }
}
