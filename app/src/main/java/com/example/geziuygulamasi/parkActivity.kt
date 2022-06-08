package com.example.geziuygulamasi

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class parkActivity : AppCompatActivity() {
    var place = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.park_categories)
        val db = DBHelper(this,null)
    }
    object SharedData {
        var placeName = ""
    }
    fun NawariPark(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(11)
        if (cursor == false){
            db.addPlace("Nawari Park", "Park","Nawari Park is one of the most famous flower gardens in Jogja, this garden specializes in Sunflowers only. Before you can enjoy the beautiful stretch of hundreds of sunflowers, you need to pay an entrance ticket first. The expensive view offered is inversely proportional to the entry fee.",11,5)
        }
        SharedData.placeName = "NawariPark"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun AmarilisPark(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(12)
        if (cursor == false){
            db.addPlace("Amarilis Park", "Park","The Amarilis Park, which is located in Gunungkidul, Yogyakarta, has always been the prima donna of tourism which has attracted the attention of many people every year. This flower, also known as the local name Puspa Patuk, blooms beautifully in the rainy season.",12,5)
        }
        SharedData.placeName = "AmarilisPark"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
    fun AsriPark(view: View) {
        val db = DBHelper(this,null)
        val cursor = db.placePresent(13)
        if (cursor == false){
            db.addPlace("Asri Park", "Park","Asri Park is one of the tourist attractions in Jogja which not only presents the charm of its natural beauty, but there are also instagenic photo spots. Asri Park is located on Jalan Lintas Selatan, Srigading, Sanden, Bantul.",13,5)
        }
        SharedData.placeName = "AsriPark"
        val intent = Intent(this,placeDescriptActivity::class.java)
        startActivity(intent)
    }
}