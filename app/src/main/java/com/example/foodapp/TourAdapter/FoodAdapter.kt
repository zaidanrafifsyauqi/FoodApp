package com.example.foodapp.TourAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.Model.Food
import com.example.foodapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.food_rv_layout.view.*

class FoodAdapter (val context: Context?, private  val places: ArrayList<Food>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v  = LayoutInflater.from(parent.context).inflate(R.layout.food_rv_layout,parent,false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {

        return places.size

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        Picasso.get().load(places[position].url).into(holder.itemView.foodImage)

        //Start Kenburns animation
        holder.itemView.foodImage.resume()

        holder.itemView.foodTitle.text = places[position].title
        holder.itemView.foodDescription.text = places[position].description
        holder.itemView.foodRating.rating = places[position].rating!!

    }

    class ViewHolder(v: View?): RecyclerView.ViewHolder(v!!), View.OnClickListener {
        override fun onClick(p0: View?) {

            //OnClick fucition goes here...
        }

        init {
            itemView.setOnClickListener(this)
        }

    }

}