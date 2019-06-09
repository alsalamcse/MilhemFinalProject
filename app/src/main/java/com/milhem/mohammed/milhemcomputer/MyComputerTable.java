package com.milhem.mohammed.milhemcomputer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.milhem.mohammed.milhemcomputer.MyComputer;

import java.util.ArrayList;

public class MyComputerTable extends SQLiteOpenHelper {





    private static final int DATBASE_VERSION = 1;
    private static final String DATABASE_NAME = "COMPUTERS_DB";
    private static final String TABLE_COMPUTERS = "COMPUTERS_TBL";

    private static final String KEY_ID = "_id";
    private static final String KEY_KIND = "kind";
    private static final String KEY_PRICE = "price";
    private static final String KEY_SPACE = "space";
    private static final String KEY_RAM = "ram";

    public MyComputerTable(Context context) {
        super(context, DATABASE_NAME, null, DATBASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_COMPUTERTS_TABLE = "CREATE TABLE " + TABLE_COMPUTERS + "(" + KEY_ID + "INTEGER PRIMARY KEY," + KEY_KIND + "TEXT," + KEY_PRICE + "TEXT," + KEY_RAM + "TEXT," + KEY_SPACE + "TEXT" + ")";
        db.execSQL(CREATE_COMPUTERTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sqlDrop = "DROP TABLE IF EXISTS " + TABLE_COMPUTERS;
        db.execSQL(sqlDrop);
        onCreate(db);

    }

    public long AddComputer(MyComputer computer) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_KIND, computer.getKind());
        values.put(KEY_PRICE, computer.getPrice());
        values.put(KEY_RAM, computer.getRam());
        values.put(KEY_SPACE, computer.getSpace());
        long row = db.insert(TABLE_COMPUTERS, null, values);
        db.close();
        return row;
    }

    public int updateComputer(MyComputer computer) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_SPACE, computer.getSpace());
        values.put(KEY_RAM, computer.getRam());
        values.put(KEY_PRICE, computer.getPrice());
        values.put(KEY_KIND, computer.getKind());
        int num = db.update(TABLE_COMPUTERS, values, KEY_ID + "=" + computer.get_id(), null);
        db.close();
        return num;
    }

    public int deleteComputerById(MyComputer computer) {
        SQLiteDatabase db = this.getWritableDatabase();
        int num = db.delete(TABLE_COMPUTERS, KEY_ID + "=" + computer.get_id(), null);
        db.close();
        return num;

    }

    public ArrayList<MyComputer> getAllComputers() {
        ArrayList<MyComputer> computerList = new ArrayList<MyComputer>();
        String selectQuery = "SELECT * FROM " + TABLE_COMPUTERS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
       boolean flag=cursor.moveToFirst();
       while (flag=true)
            {
                MyComputer computer = new MyComputer();
                computer.set_id(cursor.getLong(0));
                computer.setKind(cursor.getString(1));
                computer.setPrice(cursor.getInt(2));
                computer.setSpace(cursor.getInt(3));
                computer.setRam(cursor.getInt(4));
                computerList.add(computer);
                computerList.add(computer);
                flag=cursor.moveToNext();

        }

        return computerList;
    }
}
