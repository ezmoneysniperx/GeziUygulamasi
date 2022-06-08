package com.example.geziuygulamasi

import android.content.ContentValues
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.place_descript.*
import com.example.geziuygulamasi.R.drawable.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class placeDescriptActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.place_descript)

        val nameTextView = findViewById<TextView>(R.id.placeName)
        val descTextView = findViewById<TextView>(R.id.placeDesc)
        val db = DBHelper(this,null)

        val sendButton = findViewById<Button>(R.id.commentSend)

        /*var images:MutableList<Int> = mutableListOf(
            nawari_park, amarilis_park
        )*/

        fun showComments(pid : Int){
            val db = DBHelper(this, null)
            val cursor = db.getComment(pid)
            if(cursor!!.moveToFirst()){
                val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
                recyclerview.layoutManager = LinearLayoutManager(this)
                val data = ArrayList<ItemsViewModel>()
                val adapter = CustomAdapter(data)
                recyclerview.adapter = adapter
                do{
                    data.add(ItemsViewModel(R.drawable.profile, cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.COMMENT_COL))))
                }while(cursor.moveToNext()) ;
            }
            cursor.close()
        }


        if (parkActivity.SharedData.placeName == "NawariPark"){
            mainPic.setImageResource(R.drawable.nawari_park)
            val cursor = db.placeInfo(11)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(11)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,11)
                commentEntry.text.clear()
                showComments(11)
            }
        }

        if (parkActivity.SharedData.placeName == "AmarilisPark"){
            mainPic.setImageResource(R.drawable.amarilis_park)
            val cursor = db.placeInfo(12)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(12)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,12)
                commentEntry.text.clear()
                showComments(12)
            }
        }

        if (parkActivity.SharedData.placeName == "AsriPark"){
            mainPic.setImageResource(R.drawable.asri_park)
            val cursor = db.placeInfo(13)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(13)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,13)
                commentEntry.text.clear()
                showComments(13)
            }
        }

        if (parkActivity.SharedData.placeName == "GrhatamaLib"){
            mainPic.setImageResource(R.drawable.grhatama_library)
            val cursor = db.placeInfo(14)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(14)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,14)
                commentEntry.text.clear()
                showComments(14)
            }
        }

        if (parkActivity.SharedData.placeName == "JogjaLib"){
            mainPic.setImageResource(R.drawable.jogja_library_center)
            val cursor = db.placeInfo(15)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(15)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,15)
                commentEntry.text.clear()
                showComments(15)
            }
        }

        if (parkActivity.SharedData.placeName == "IgnatiusLib"){
            mainPic.setImageResource(R.drawable.ignatius_library)
            val cursor = db.placeInfo(16)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(16)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,16)
                commentEntry.text.clear()
                showComments(16)
            }
        }

        if (parkActivity.SharedData.placeName == "BorobudurTemple"){
            mainPic.setImageResource(R.drawable.borobudur_temple)
            val cursor = db.placeInfo(17)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(17)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,17)
                commentEntry.text.clear()
                showComments(17)
            }
        }

        if (parkActivity.SharedData.placeName == "PrambananTemple"){
            mainPic.setImageResource(R.drawable.prambanan_temple)
            val cursor = db.placeInfo(18)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(18)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,18)
                commentEntry.text.clear()
                showComments(18)
            }
        }

        if (parkActivity.SharedData.placeName == "Malioboro"){
            mainPic.setImageResource(R.drawable.malioboro)
            val cursor = db.placeInfo(19)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(19)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,19)
                commentEntry.text.clear()
                showComments(19)
            }
        }

        if (parkActivity.SharedData.placeName == "MariottHotel"){
            mainPic.setImageResource(R.drawable.mariott_hotel)
            val cursor = db.placeInfo(20)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(20)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,20)
                commentEntry.text.clear()
                showComments(20)
            }
        }
        if (parkActivity.SharedData.placeName == "RAHotel"){
            mainPic.setImageResource(R.drawable.royal_ambarrukmo_hotel)
            val cursor = db.placeInfo(21)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(21)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,21)
                commentEntry.text.clear()
                showComments(21)
            }
        }
        if (parkActivity.SharedData.placeName == "APHotel"){
            mainPic.setImageResource(R.drawable.amaranta_hotel)
            val cursor = db.placeInfo(22)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(22)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,22)
                commentEntry.text.clear()
                showComments(22)
            }
        }
        if (parkActivity.SharedData.placeName == "PastyMarket"){
            mainPic.setImageResource(R.drawable.pasty_market)
            val cursor = db.placeInfo(23)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(23)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,23)
                commentEntry.text.clear()
                showComments(23)
            }
        }
        if (parkActivity.SharedData.placeName == "SKMarket"){
            mainPic.setImageResource(R.drawable.sore_kauman_market)
            val cursor = db.placeInfo(24)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(24)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,24)
                commentEntry.text.clear()
                showComments(24)
            }
        }
        if (parkActivity.SharedData.placeName == "LKMarket"){
            mainPic.setImageResource(R.drawable.legi_kotagede_market)
            val cursor = db.placeInfo(25)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(25)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,25)
                commentEntry.text.clear()
                showComments(25)
            }
        }
        if (parkActivity.SharedData.placeName == "UGMMos"){
            mainPic.setImageResource(R.drawable.masjid_ugm)
            val cursor = db.placeInfo(26)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(26)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,26)
                commentEntry.text.clear()
                showComments(26)
            }
        }
        if (parkActivity.SharedData.placeName == "SuciatiMos"){
            mainPic.setImageResource(R.drawable.suciati_mosque)
            val cursor = db.placeInfo(27)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(27)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,27)
                commentEntry.text.clear()
                showComments(27)
            }
        }
        if (parkActivity.SharedData.placeName == "FLMTemple"){
            mainPic.setImageResource(R.drawable.fuk_ling_miau_temple)
            val cursor = db.placeInfo(28)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(28)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,28)
                commentEntry.text.clear()
                showComments(28)
            }
        }
        if (parkActivity.SharedData.placeName == "MCP"){
            mainPic.setImageResource(R.drawable.malioboro_carpark)
            val cursor = db.placeInfo(29)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(29)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,29)
                commentEntry.text.clear()
                showComments(29)
            }
        }
        if (parkActivity.SharedData.placeName == "NCP"){
            mainPic.setImageResource(R.drawable.ngabean_carpark)
            val cursor = db.placeInfo(30)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(30)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,30)
                commentEntry.text.clear()
                showComments(30)
            }
        }
        if (parkActivity.SharedData.placeName == "ABACP"){
            mainPic.setImageResource(R.drawable.abubakarali_carpark)
            val cursor = db.placeInfo(31)
            cursor!!.moveToFirst()
            nameTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACENAME_COL)))
            descTextView.setText(cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.PLACEABOUT_COL)))
            showComments(31)
            sendButton.setOnClickListener{
                val comments = commentEntry.text.toString()
                db.addComment(comments,31)
                commentEntry.text.clear()
                showComments(31)
            }
        }
    }


}