package com.example.theapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonmenu : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //Back Button
        val actionBar = supportActionBar
        actionBar!!.title = "Kalkulator Gizi Harian"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        buttonmenu = findViewById(R.id.button_next)
        buttonmenu.setOnClickListener(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    fun onClick4(view: View?) {
        when(view?.id){
            R.id.button_menu ->{
                val justIntent4 = Intent(this@MainActivity3, MainActivity4::class.java)
                startActivity(justIntent4)
            }
        }
    }

    override fun onClick(v: View?) {

    }


}