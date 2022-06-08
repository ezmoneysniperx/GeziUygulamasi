package com.example.geziuygulamasi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class hotelsActivity : AppCompatActivity() {
    var place = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hotels_category)
        val db = DBHelper(this,null)
    }
    object SharedData {
        var placeName = ""
    }
    fun MariottHotel(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(20)
        if (cursor == false){
            db.addPlace("Mariott Hotel", "Hotel","Ideally situated in the heart of Jogja, Indonesia, Marriott Hotel sits near the Prambanan Temple, the Borobudur Temple, the world-class shopping of Jalan Malioboro and historic Kraton Yogyakarta.",20,5)
        }
        parkActivity.SharedData.placeName = "MariottHotel"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun RAHotel(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(21)
        if (cursor == false){
            db.addPlace("Royal Ambarrukmo Hotel", "Hotel","Royal Ambarrukmo Hotel located in Sleman, Yogyakarta. This luxury hotel has always been a part of the city and offers effortless access to the top business, shopping and nightlife destinations in Jogja, Indonesia.",21,5)
        }
        parkActivity.SharedData.placeName = "RAHotel"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun APHotel(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(22)
        if (cursor == false){
            db.addPlace("Amaranta Prambanan Hotel", "Hotel","Amaranta Prambanan Hotel located in Yogyakarta, 14 km from Tugu Monument. Amaranta Prambanan Hotel is a new luxury five star hotel located on a hill that offers unrestricted views of Mount Merapi and Prambanan from all areas of the hotel.",22,5)
        }
        parkActivity.SharedData.placeName = "APHotel"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
}