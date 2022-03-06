package com.example.theapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

abstract class MainActivity2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonnext : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

         //Back Button
        val actionBar = supportActionBar
        actionBar!!.title = "Kalkulator Gizi Harian"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        //Button Next Activity
        buttonnext = findViewById(R.id.button_next)
        buttonnext.setOnClickListener(this)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    fun onClick3(view: View?) {
        when(view?.id){
            R.id.button_next ->{
                val justIntent2 = Intent(this@MainActivity2, MainActivity3::class.java)
                startActivity(justIntent2)
            }
        }
    }

//    fun hitungGizi(view: View){
//        val beratBadan  = findViewById<EditText>(R.id.input_BB)
//        val tinggiBadan = findViewById<EditText>(R.id.input_TB)
//        val usiaUser    = findViewById<EditText>(R.id.input_usia)
//        val totalHitung   = findViewById<TextView>(R.id.total_hitung)
//
//        //pria
//        val nilaiUmum = 66
//        val nilaiBB = 13.7
//        val nilaiTB = 5
//        val nilaiUsia = 6.8
//
//        val jumlahGizi = nilaiUmum + (beratBadan.text.toString().toDouble() * nilaiBB) + (nilaiTB*tinggiBadan.text.toString().toDouble()*nilaiTB) -
//        (nilaiUsia*usiaUser.text.toString().toDouble())
//
//        totalHitung.text = jumlahGizi.toString()
//    }

}