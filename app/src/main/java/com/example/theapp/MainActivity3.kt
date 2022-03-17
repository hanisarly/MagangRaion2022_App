package com.example.theapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry

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

        //Button Menu
        buttonmenu = findViewById(R.id.button_menu)
        buttonmenu.setOnClickListener{
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        setupPieChart()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    private fun setupPieChart(){

        //setup pie entries
        val pieEntries = arrayListOf<PieEntry>()
        pieEntries.add(PieEntry(2160.0f))
        pieEntries.add(PieEntry(2500.0f))

        //pie chart entries colors
        val pieDataSet = PieDataSet(pieEntries, "kalori chart!!")
        pieDataSet.setColors(
            resources.getColor(R.color.design_default_color_secondary_variant),
            resources.getColor(R.color.design_default_color_secondary)
        )

        //setup pie data set in piedata
        val pieData = PieData(pieDataSet)
        
        //enabled the value on each pieEntry
        pieData.setDrawValues(true)


    }


}