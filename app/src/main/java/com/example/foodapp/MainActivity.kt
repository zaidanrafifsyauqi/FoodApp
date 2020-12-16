package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.CustomZoomClass.CenterZoomLayout
import com.example.foodapp.Model.Food
import com.example.foodapp.TourAdapter.FoodAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init views
        val toursRV = findViewById<RecyclerView>(R.id.food_RV)

        //init layout manager
        val layoutManager = CenterZoomLayout(this)

        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        layoutManager.reverseLayout = true
        layoutManager.stackFromEnd = true
        toursRV.layoutManager = layoutManager

        // To Auto Center View
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(toursRV)
        toursRV.isNestedScrollingEnabled = false

        //add items to array list

        val foods = ArrayList<Food>()

        foods.add(
            Food(
                "Pasta",
                "processed food used in Italian cooking, which is usually made from unleavened dough",
                4.5f,
                "https://images.unsplash.com/photo-1546549032-9571cd6b27df?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=668&q=80"


            )
        )
        foods.add(
            Food(
                "Pizza",
                "a savory dish from Italy, a kind of round, flat dough, baked in the oven and usually covered in tomato sauce and cheese ",
                4.5f,
                "https://images.unsplash.com/photo-1571066811602-716837d681de?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=462&q=80"


            )
        )
        foods.add(
            Food(
                "Burger",
                "Hamburger (or often called a burger) is a kind of food in the form of a round bread sliced in half and filled with a patty in the middle.",
                4.5f,
                "https://images.unsplash.com/photo-1530554764233-e79e16c91d08?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=668&q=80"

            )
        )
        foods.add(
            Food(
                "Sandwich",
                "Sandwich or sandwich,is a food that usually consists of vegetables, cheese or meat that is sliced, placed on or between slices of bread",
                4.5f,
                "https://images.unsplash.com/photo-1587015566802-5dc157c901cf?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=666&q=80"


            )
        )
        foods.add(
            Food(
                "Salad",
                "a type of food consisting of a mixture of vegetables and ready-to-eat food ingredients.",
                4.5f,
                "https://images.unsplash.com/photo-1546793665-c74683f339c1?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=668&q=80"
            )
        )

        //add arraylist to recyclerview
        toursRV.adapter = FoodAdapter(this,foods)
    }
}

