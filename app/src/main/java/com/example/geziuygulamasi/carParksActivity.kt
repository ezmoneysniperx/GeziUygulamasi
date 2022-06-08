package com.example.geziuygulamasi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class carParksActivity : AppCompatActivity() {
    var place = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carparks_category)
    }
    object SharedData {
        var placeName = ""
    }
    fun MCP(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(29)
        if (cursor == false){
            db.addPlace("Malioboro Car Park", "CarPark","Malioboro Car Park is located Jl. Ahmad Yani and Pabringan, Yogyakarta. Spacious parking area with strategic location in Malioboro area. Supported by a lot of capacity so it doesn't worry tourists visiting Malioboro.",29,5)
        }
        parkActivity.SharedData.placeName = "MCP"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun NCP(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(30)
        if (cursor == false){
            db.addPlace("Ngabean Car Park", "CarPark","Ngabean Car Park is located at Jl. KH Wahid Hasyim, Notoprajan, Ngampilan, Yogyakarta. This is car park for parking for tourist vehicles, both buses and minibuses. Wide and many stalls around it.",30,5)
        }
        parkActivity.SharedData.placeName = "NCP"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun ABACP(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(31)
        if (cursor == false){
            db.addPlace("Abu Bakar Ali Car Park", "CarPark","Abu Bakar Ali Car Park is located Jl. Abu Bakar Ali, Suryatmajan, Danurejan, Yogyakarta. A parking space for buses, minibuses and motorbikes. It is spacey and relatively safe.",31,5)
        }
        parkActivity.SharedData.placeName = "ABACP"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
}