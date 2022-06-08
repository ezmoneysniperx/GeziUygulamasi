package com.example.geziuygulamasi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class librariesActivity : AppCompatActivity() {
    var place = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.libraries_category)
        val db = DBHelper(this,null)
    }
    object SharedData {
        var placeName = ""
    }
    fun GrhatamaLib(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(14)
        if (cursor == false){
            db.addPlace("Grhatama Library", "Library","One of the most complete and grandest libraries in the city of Yogyakarta is Grhatama Library. This library is located on Jalan Janti Banguntapan, Bantul, Special Region of Yogyakarta. Grhatama Library is an alternative public area that puts forward scientific, educational, and recreational functions.",14,5)
        }
        parkActivity.SharedData.placeName = "GrhatamaLib"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun JogjaLib(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(15)
        if (cursor == false){
            db.addPlace("Jogja Library Center", "Library","Jogja Library Center is located on Jl. Malioboro no.170 among a row of shops selling souvenirs typical of Jogja. The library belonging to the DIY local government which is managed by BPAD DIY has various collections of print media from the 1945s.",15,5)
        }
        parkActivity.SharedData.placeName = "JogjaLib"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun IgnatiusLib(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(16)
        if (cursor == false){
            db.addPlace("Ignatius Library", "Library","The Ignatius Library is located east of the central store. The Ignatius Library is a library with a fairly complete collection of academic literature, ranging from Philosophy, Religion, Politics, Education, History, Language, etc.",16,5)
        }
        parkActivity.SharedData.placeName = "IgnatiusLib"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
}