package com.example.geziuygulamasi

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context, factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {

    // below is the method for creating a database by a sqlite query
    override fun onCreate(db: SQLiteDatabase) {
        val query = ("CREATE TABLE " + USER_TABLE + " (" + FIRSTNAME_COL + " TEXT, " + LASTNAME_COL + " TEXT," + EMAIL_COL + " TEXT," + PASSWORD_COL + " TEXT" + ")")

        val query1 = ("CREATE TABLE " + PLACE_TABLE + " ("
                + PLACEID_COL + " INTEGER PRIMARY KEY, " +
                PLACENAME_COL + " TEXT," +
                PLACEABOUT_COL + " TEXT," +
                PLACECATEGORY_COL + " TEXT," +
                PLACERATING_COL + " INTEGER" + ")")

        val query2 = ("CREATE TABLE " + COMMENT_TABLE + " ("
                + COMMENT_COL + " TEXT," + COMMENTID_COL + " INTEGER" + ")")

        // we are calling sqlite
        // method for executing our query
        db.execSQL(query)
        db.execSQL(query1)
        db.execSQL(query2)
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + PLACE_TABLE)
        onCreate(db)
    }

    // This method is for adding data in our database
    fun addUser(fname : String, lname : String, email : String, password : String ){
        val values = ContentValues()
        values.put(FIRSTNAME_COL, fname)
        values.put(LASTNAME_COL, lname)
        values.put(EMAIL_COL, email)
        values.put(PASSWORD_COL, password)
        val db = this.writableDatabase
        db.insert(USER_TABLE, null, values)
        db.close()
    }

    fun addPlace(pname : String, pcategory : String, pabout: String ,pid : Int, prating : Int){
        val values = ContentValues()
        values.put(PLACENAME_COL, pname)
        values.put(PLACECATEGORY_COL, pcategory)
        values.put(PLACEABOUT_COL, pabout)
        values.put(PLACEID_COL, pid)
        values.put(PLACERATING_COL, prating)
        val db = this.writableDatabase
        db.insert(PLACE_TABLE, null, values)
        db.close()
    }
    fun addComment(cm : String, cid : Int){
        val values = ContentValues()
        values.put(COMMENT_COL, cm)
        values.put(COMMENTID_COL, cid)
        val db = this.writableDatabase
        db.insert(COMMENT_TABLE, null, values)
        db.close()
    }

    fun getComment(pid : Int): Cursor? {
        val db = this.readableDatabase
        return db.rawQuery("SELECT * FROM " + COMMENT_TABLE + " WHERE $COMMENTID_COL = " + pid, null)
    }

    fun placeInfo(pid : Int): Cursor? {
        val db = this.readableDatabase
        return db.rawQuery("SELECT * FROM " + PLACE_TABLE + " WHERE $PLACEID_COL = " + pid , null)

    }
    fun placePresent(pid: Int): Boolean {
        val db = writableDatabase
        val query = "select * from $PLACE_TABLE where $PLACEID_COL = $pid"
        val cursor = db.rawQuery(query, null)
        val result = cursor.count > 0
        cursor.close()
        db.close()
        return result
    }
    fun userPresent (user: String, pass: String): Boolean {
        val db = writableDatabase
        val query="select * from $USER_TABLE where $EMAIL_COL = \'$user\' and $PASSWORD_COL = \'$pass\'"
        val cursor = db.rawQuery(query, null)
        val result = cursor.count > 0
        cursor.close()
        db.close()
        return result
    }

    companion object{
        private val DATABASE_NAME = "GeziUygulamasi"
        private val DATABASE_VERSION = 1
        val USER_TABLE = "user_table"
        val PLACE_TABLE = "place_table"
        val COMMENT_TABLE = "comment_table"

        val FIRSTNAME_COL = "fname"
        val LASTNAME_COL = "lname"
        val EMAIL_COL = "email"
        val PASSWORD_COL = "password"

        val PLACENAME_COL = "pname"
        val PLACECATEGORY_COL = "pcategory"
        val PLACEABOUT_COL = "pabout"
        val PLACEID_COL = "pid"
        val PLACERATING_COL = "prating"

        val COMMENT_COL = "cm"
        val COMMENTID_COL  = "pid"
    }
}