package com.example.utsfajararifandi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MotorterbaruAdapter (private val context: Context, private val motorterbaru: List<Motorterbaru>, val listener: (Motorterbaru) ->Unit)
    : RecyclerView.Adapter<MotorterbaruAdapter.MotorterbaruViewHolder>(){

    class MotorterbaruViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val imgMotorterbaru = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameMotorterbaru = view.findViewById<TextView>(R.id.tv_item_name)
        val descMotorterbaru = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(motorterbaru: Motorterbaru, listener: (Motorterbaru) -> Unit) {
            imgMotorterbaru.setImageResource(motorterbaru.imgMotorterbaru)
            nameMotorterbaru.text = motorterbaru.nameMotorterbaru
            descMotorterbaru.text = motorterbaru.descMotorterbaru
            itemView.setOnClickListener{listener(motorterbaru)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotorterbaruViewHolder {
        return MotorterbaruViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_motor_terbaru2022,parent, false)
        )
    }

    override fun onBindViewHolder(holder: MotorterbaruViewHolder, position: Int) {
        holder.bindView(motorterbaru[position], listener)
    }

    override fun getItemCount(): Int = motorterbaru.size
}
