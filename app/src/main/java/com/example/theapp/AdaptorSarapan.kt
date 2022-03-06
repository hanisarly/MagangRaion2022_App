package com.example.theapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptorSarapan(private val item : ArrayList<String>) : RecyclerView.Adapter<AdaptorSarapan.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView : TextView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_sarapan,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.textView.text = item[position]
    }

    override fun getItemCount(): Int {
        return item.size
    }


}