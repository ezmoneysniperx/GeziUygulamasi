package com.example.geziuygulamasi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class worshipPlacesActivity : AppCompatActivity() {
    var place = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.worshipplaces_category)
        val db = DBHelper(this,null)
    }
    object SharedData {
        var placeName = ""
    }
    fun UGMMos(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(26)
        if (cursor == false){
            db.addPlace("UGM Mosque", "WorshipPlace","UGM Mosque is a campus mosque belonging to Gadjah Mada University which is located on Jl. Sports, Bulaksumur, Caturtunggal, Depok, Sleman, Yogyakarta. This mosque is the largest campus mosque in Southeast Asia.",26,5)
        }
        parkActivity.SharedData.placeName = "UGMMos"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun SuciatiMos(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(27)
        if (cursor == false){
            db.addPlace("Suciati Mosque", "WorshipPlace","Suciati Mosque is located in Pandowoharjo Sleman, Yogyakarta. Haji Suciati is the founder of this magnificent mosque. Stylized as the Prophet's Mosque in Medina, the Suciati Mosque looks luxurious on an area of 1,600 square meters.",27,5)
        }
        parkActivity.SharedData.placeName = "SuciatiMos"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun FLMTemple(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(28)
        if (cursor == false){
            db.addPlace("Fuk Ling Miau Temple", "WorshipPlace","Fuk Ling Miau Temple is a place of worship for Confucians and Buddhists, located in Yogyakarta. This temple is under the auspices of the Indonesian Buddhist Council under the name Vihara Buddha Prabha Gondomanan.",28,5)
        }
        parkActivity.SharedData.placeName = "FLMTemple"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
}