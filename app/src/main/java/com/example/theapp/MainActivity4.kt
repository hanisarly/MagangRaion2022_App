package com.example.theapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anychart.scales.Linear

class MainActivity4 : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adaptorMenu: AdaptorMenu
    private var dataList = mutableListOf<DataModel>()
    private lateinit var imageId : Array<Int>
    private lateinit var detail : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val actionBar = supportActionBar
        actionBar!!.title = "Rekomendasi Menu"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.rv_menu)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        adaptorMenu = AdaptorMenu(applicationContext)//listener()
        recyclerView.adapter = adaptorMenu



        dataList.add(DataModel("Nasi Goreng",R.drawable.nasi_goreng))
        dataList.add(DataModel("Bakso",R.drawable.bakso))
        dataList.add(DataModel("Sate",R.drawable.sate))
        dataList.add(DataModel("Soto Ayam",R.drawable.soto_ayam))
        dataList.add(DataModel("Gado-Gado",R.drawable.gado_gado))
        dataList.add(DataModel("Mie Instant",R.drawable.mie_goreng))
        dataList.add(DataModel("Gudeg",R.drawable.gudeg))

        imageId = arrayOf(
            R.drawable.nasi_goreng,
            R.drawable.bakso,
            R.drawable.sate,
            R.drawable.soto_ayam,
            R.drawable.gado_gado,
            R.drawable.mie_goreng,
            R.drawable.gudeg
        )

        detail = arrayOf(
            getString(R.string.detail_nasi_goreng),
            getString(R.string.detail_bakso),
            getString(R.string.detail_Sate),
            getString(R.string.detail_soto),
            getString(R.string.detail_gado_gado),
            getString(R.string.detail_mie_goreng),
            getString(R.string.detail_gudeg)
        )

        adaptorMenu.setDataList(dataList)
        getData()

    }

    private fun getData(){
        var adapter = adaptorMenu
        adapter.setOnItemclickListener(object : AdaptorMenu.onItemCliskListener{
            override fun onItemClick(position: Int) {
//                Toast.makeText(this@MainActivity4,"Menu $position", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity4,DetailMenuActivity::class.java)
                intent.putExtra("image", dataList[position].Image)
                intent.putExtra("title", dataList[position].title)
                intent.putExtra("detail",detail[position])
                startActivity(intent)

            }

        })
    }


}

