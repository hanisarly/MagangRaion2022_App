package com.example.theapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_menu)

        //Back Button
        val actionBar = supportActionBar
        actionBar!!.title = "Rekomendasi Menu"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val imageMenu : ImageView = findViewById(R.id.iv_imageMenu)
        val titleMenu : TextView = findViewById(R.id.tv_titleMenu)
        val descMenu : TextView = findViewById(R.id.tv_descMenu)

        val bundle : Bundle?= intent.extras
        val image = bundle!!.getInt("image")
        val title = bundle!!.getString("title")
        val detail = bundle!!.getString("detail")

        imageMenu.setImageResource(image)
        titleMenu.text = title
        descMenu.text = detail

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}