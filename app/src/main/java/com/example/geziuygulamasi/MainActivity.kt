package com.example.geziuygulamasi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screen)
    }

    fun carParks(view: View) {
        val intent = Intent(this,carParksActivity::class.java)
        startActivity(intent)
    }
    fun historicSites(view: View) {
        val intent = Intent(this,historicSitesActivity::class.java)
        startActivity(intent)
    }
    fun libraries(view: View) {
        val intent = Intent(this,librariesActivity::class.java)
        startActivity(intent)
    }
    fun market(view: View) {
        val intent = Intent(this,marketActivity::class.java)
        startActivity(intent)
    }
    fun park(view: View) {
        val intent = Intent(this,parkActivity::class.java)
        startActivity(intent)
    }
    fun hotels(view: View) {
        val intent = Intent(this,hotelsActivity::class.java)
        startActivity(intent)
    }
    fun worshipPlaces(view: View) {
        val intent = Intent(this,worshipPlacesActivity::class.java)
        startActivity(intent)
    }
    fun logout(view: View) {
        val intent = Intent(this,LoginActivity::class.java)
        startActivity(intent)
    }

}