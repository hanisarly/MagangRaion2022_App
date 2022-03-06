package com.example.theapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonintent : Button
    private lateinit var buttonmenu : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonintent = findViewById(R.id.button_intent)
        buttonintent.setOnClickListener(this)

        buttonmenu = findViewById(R.id.button_menu)
        buttonmenu.setOnClickListener(this)
    }

    //kalkulator gizi harian
    override fun onClick(v: View) {
        when(v.id){
            R.id.button_intent ->{
                val justIntent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(justIntent)
            }
        }

    }

    //rekomendasi menu
    fun onClick2(v: View) {
        when (v.id) {
            R.id.button_menu -> {
                val justIntent3 = Intent(this@MainActivity, MainActivity4::class.java)
                startActivity(justIntent3)
            }
        }
    }



}