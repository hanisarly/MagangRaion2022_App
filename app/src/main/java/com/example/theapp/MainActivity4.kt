package com.example.theapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity4 : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adaptorMenu: AdaptorMenu
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        recyclerView = findViewById(R.id.rv_menu)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        adaptorMenu = AdaptorMenu(applicationContext)//listener()
        recyclerView.adapter = adaptorMenu

        dataList.add(DataModel("nama menu", "deskripsi",R.drawable.buah))
        dataList.add(DataModel("nama menu", "deskripsi",R.drawable.buah))
        dataList.add(DataModel("nama menu", "deskripsi",R.drawable.buah))
        dataList.add(DataModel("nama menu", "deskripsi",R.drawable.buah))
        dataList.add(DataModel("nama menu", "deskripsi",R.drawable.buah))
        dataList.add(DataModel("nama menu", "deskripsi",R.drawable.buah))
        dataList.add(DataModel("nama menu", "deskripsi",R.drawable.buah))
        dataList.add(DataModel("nama menu", "deskripsi",R.drawable.buah))

//        val adapter = AdaptorMenu(dataList){
//            Intent(this, DetailMenuActivity::class.java).apply {
//                startActivity(this)
//            }
//        }

        adaptorMenu.setDataList(dataList)

    }

//    private fun listener(): () -> Unit {
//        return listener()
//    }


}

