package com.buddy.asus1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var helper = db(applicationContext)
        var db = helper.readableDatabase
        var rs = db.rawQuery("SELECT * FROM stats", null)

        if(rs.moveToNext())
            Toast.makeText(applicationContext, rs.getString(0), Toast.LENGTH_LONG).show()
    }
}