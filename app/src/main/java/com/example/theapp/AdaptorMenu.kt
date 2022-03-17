package com.example.theapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptorMenu(
    var context: Context
    ) : RecyclerView.Adapter<AdaptorMenu.ViewHolder>() {

//    private val listener: () -> Unit

    var dataList = emptyList<DataModel>()

    internal fun setDataList(dataList : List<DataModel>){
        this.dataList = dataList
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image : ImageView
        var title : TextView
        var desc : TextView

        init{
            image = itemView.findViewById(R.id.iv_fruit)
            title = itemView.findViewById(R.id.tv_name)
            desc = itemView.findViewById(R.id.tv_Deskripsi)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = dataList[position]

        holder.title.text = data.title
        holder.desc.text = data.desc
        holder.image.setImageResource(data.Image)

//        holder.itemView.setOnClickListener {
//            listener()
//        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


}