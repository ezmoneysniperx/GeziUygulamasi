package com.example.geziuygulamasi

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register_activity.*
import android.widget.Toast
import android.content.Intent

class RegisterActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)

        val db = DBHelper(this, null)

        val button = findViewById<Button>(R.id.btnRegister)
        button.setOnClickListener{
            val db = DBHelper(this, null)

            val fname = firstName.text.toString()
            val lname = lastName.text.toString()
            val eposta = email.text.toString()
            val sifre = password.text.toString()

            val cursor = db.userPresent(eposta,sifre)
            if(cursor){
                Toast.makeText(this, eposta + " already has an account, please log in!", Toast.LENGTH_LONG).show()
                firstName.text.clear()
                lastName.text.clear()
                city.text.clear()
                password.text.clear()
                email.text.clear()
            }
            else{
                db.addUser(fname,lname,eposta,sifre)
                Toast.makeText(this, "Registration Success! Redirecting to Main Screen", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

            //cursor.close()

        }
    }
}