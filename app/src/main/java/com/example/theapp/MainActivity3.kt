package com.example.theapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.anychart.AnyChart
import com.anychart.AnyChartView
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import com.anychart.charts.Pie


class MainActivity3 : AppCompatActivity(), View.OnClickListener {

    private var chart: AnyChartView? = null
    private lateinit var buttonmenu : Button
    private val kalori = listOf(500, 2500)
    private val keterangan = listOf("Kalori Anda", "Kalori")

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

        //----PIE CHART---
        chart = findViewById(R.id.pc_kalori)
        configChartView()

    }

    private fun configChartView() {
        val pie : Pie =AnyChart.pie()
        val dataPieChart: MutableList<DataEntry> = mutableListOf()
        dataPieChart.add(DataEntry())
        for (index in kalori.indices){
            dataPieChart.add(ValueDataEntry(keterangan.elementAt(index),kalori.elementAt(index)))
        }
        pie.data(dataPieChart)
        pie.title("Kalori User")
        chart!!.setChart(pie)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

//    private fun setupPieChart(){
//
//        //setup pie entries
//        val pieEntries = arrayListOf<PieEntry>()
//        pieEntries.add(PieEntry(2160.0f))
//        pieEntries.add(PieEntry(2500.0f))
//
//        //animation
//
//        //pie chart entries colors
//        val pieDataSet = PieDataSet(pieEntries, "kalori chart!!")
//        pieDataSet.setColors(
//            resources.getColor(R.color.design_default_color_secondary_variant),
//            resources.getColor(R.color.design_default_color_secondary)
//        )
//
//        //setup pie data set in piedata
//        val pieData = PieData(pieDataSet)
//
//        //enabled the value on each pieEntry
//        pieData.setDrawValues(true)
//    }


}