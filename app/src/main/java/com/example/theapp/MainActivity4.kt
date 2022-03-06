package com.example.theapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val recyclerView : RecyclerView = findViewById(R.id.rv_sarapan)
        val adaptorSarapan = AdaptorSarapan(fetchData())
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.adapter = adaptorSarapan
    }

    private fun fetchData() : ArrayList<String> {
        val item = ArrayList<String>()
        for(i in 0 until 8){
            item.add("$i")
        }
        return item
    }
}