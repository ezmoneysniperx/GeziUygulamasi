package com.example.geziuygulamasi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class historicSitesActivity : AppCompatActivity() {
    var place = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.historicsites_category)
        val db = DBHelper(this,null)
    }
    object SharedData {
        var placeName = ""
    }
    fun BorobudurTemple(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(17)
        if (cursor == false){
            db.addPlace("Borobudur Temple", "Temple","Borobudur is a 9th-century Mahayana Buddhist temple in Magelang Regency, not far from the town of Muntilan, in Central Java, Indonesia. It is the world's largest Buddhist temple. The central dome is surrounded by 72 Buddha statues, each seated inside a perforated stupa.",17,5)
        }
        parkActivity.SharedData.placeName = "BorobudurTemple"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun PrambananTemple(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(18)
        if (cursor == false){
            db.addPlace("Prambanan Temple", "Temple","Prambanan is a Hindu temple compound in Yogyakarta, Indonesia. The temple compound is located  on the boundary between Central Java and Yogyakarta provinces. Prambanan Temple is the largest Hindu temple site in Indonesia and the second-largest in Southeast Asia after Angkor Wat.",18,5)
        }
        parkActivity.SharedData.placeName = "PrambananTemple"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun Malioboro(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(19)
        if (cursor == false){
            db.addPlace("Malioboro", "Temple","Malioboro is one of the many places, which is the center of shopping tourism in Gudeg City, Yogyakarta. Besides being known as a souvenir hunting center, this place is also inseparable from the long history of the development of the city of Jogja from time to time.",19,5)
        }
        parkActivity.SharedData.placeName = "Malioboro"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
}