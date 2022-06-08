package com.example.geziuygulamasi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val db = DBHelper(this, null)

        val button = findViewById<Button>(R.id.btnLogin)
        button.setOnClickListener{
            val eposta = emailLogin.text.toString()
            val sifre = password.text.toString()


            val cursor = db.userPresent(eposta,sifre)

            if(cursor == true){
                Toast.makeText(this, "Login Success!", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Wrong password / email", Toast.LENGTH_LONG).show()
                emailLogin.text.clear()
                password.text.clear()
            }
        }

    }
    fun goToRegister(view: View) {
        val intent = Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }
}