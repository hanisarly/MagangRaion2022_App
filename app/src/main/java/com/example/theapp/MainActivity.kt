package com.example.theapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(){

    private lateinit var buttonIntent : Button
    private lateinit var buttonMenu : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //kalkulator gizi harian
        buttonIntent = findViewById(R.id.button_intent)
        buttonIntent.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        //rekomendasi menu
        buttonMenu = findViewById(R.id.button_menu)
        buttonMenu.setOnClickListener{
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}