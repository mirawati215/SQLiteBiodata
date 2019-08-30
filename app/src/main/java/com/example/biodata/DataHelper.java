package com.example.biodata;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "biodatadiri.db";
    private static final int DATABASE_VERSON = 1;
    public DataHelper(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSON);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="create table biodata (no integer primary key, nama text null, tgl text null, jk text null, alamat text null);";
        Log.d("Data","onCreate: "+ sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata (no, nama,tgl,jk,alamat) VALUES ('1','Biya','11 Maret 2002','perempuan','Leuwibudah');";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
    }

}
