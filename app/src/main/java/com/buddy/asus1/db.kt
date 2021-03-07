package com.buddy.asus1

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class db(context: Context) : SQLiteOpenHelper(context, "USERDB", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE stats(ID INTEGER PRIMARY KEY AUTOINCREMENT, VISITORS INTEGER)")
        db?.execSQL("INSERT INTO stats(VISITORS) VALUES(4000)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
}