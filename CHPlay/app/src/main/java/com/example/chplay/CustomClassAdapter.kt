package com.example.chplay

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.chplay.R.*
import kotlin.random.Random

class CustomClassAdapter(private val mList: List<ItemViewModel>): RecyclerView.Adapter<CustomClassAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView: CardView = itemView.findViewById(id.cardView)
        val imageView: ImageView = itemView.findViewById(id.imageview)
        val textView: TextView = itemView.findViewById(id.itemName)
        val rate: TextView = itemView.findViewById(id.rating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemView = mList[position]
        val rnd: Random = Random
        val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

        holder.imageView.setImageResource(itemView.image)
        holder.cardView.setCardBackgroundColor(color)
        holder.textView.text = itemView.name
        holder.rate.text = itemView.rate
    }
}