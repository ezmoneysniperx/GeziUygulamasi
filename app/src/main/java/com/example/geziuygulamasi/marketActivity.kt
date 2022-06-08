package com.example.geziuygulamasi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class marketActivity : AppCompatActivity() {
    var place = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.markets_category)
        val db = DBHelper(this,null)
    }
    object SharedData {
        var placeName = ""
    }
    fun PastyMarket(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(23)
        if (cursor == false){
            db.addPlace("Pasty Market", "Market","Pasty Market located in Dongkelan, Yogyakarta. This market is the biggest plants and fauna market in Yogyakarta. Numerous sort of bird, snake, chameleon, fish so intriguing in Pasty Market.",23,5)
        }
        parkActivity.SharedData.placeName = "PastyMarket"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun SKMarket(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(24)
        if (cursor == false){
            db.addPlace("Sore Kauman Market", "Market","Sore Kauman Market is a market that is held every Ramadan every year. This market is located in an alley on Jl KH Ahmad Dahlan in Kauman Village, Gondomanan District, Yogyakarta City.",24,5)
        }
        parkActivity.SharedData.placeName = "SKMarket"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun LKMarket(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(25)
        if (cursor == false){
            db.addPlace("Legi Kotagede Market", "Market","Pasar Legi Kotagede is the oldest traditional market in Yogyakarta which was built in the 16th century and is still running its traditional market activities until now. This market is located on Jl. Mentaok Raya, Purbayan, Kotagede.",25,5)
        }
        parkActivity.SharedData.placeName = "LKMarket"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
}