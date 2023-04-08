package com.powersoft.quizshoppingapp.problem2and3.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.powersoft.quizshoppingapp.R
import com.powersoft.quizshoppingapp.databinding.ActivityFoodlistBinding
import com.powersoft.quizshoppingapp.problem2and3.adapters.FoodAdapter
import com.powersoft.quizshoppingapp.problem2and3.models.Food

class FoodListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFoodlistBinding
    private var foodList = arrayListOf<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodlistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTitle("Organic Food")

        createDummyFoodList()

        binding.recyclerView.apply {
            adapter = FoodAdapter(foodList)
            layoutManager = LinearLayoutManager(this@FoodListActivity)
        }
    }

    private fun createDummyFoodList() {
        foodList.add(Food("#887657", "Smucker's Uncrustables Peanut Butter & Grape Jelly Sandwich", 15.66, R.drawable.food1, ""))
        foodList.add(Food("#298374", "Lunchables Ham &amp; American Cheese Cracker", 9.82, R.drawable.food2, ""))
        foodList.add(Food("#565784", "Fresh Bananas, Pound", 0.66, R.drawable.food3, ""))
        foodList.add(Food("#887657", "Smucker's Uncrustables Peanut Butter & Grape Jelly Sandwich", 15.66, R.drawable.food1, ""))
        foodList.add(Food("#298374", "Lunchables Ham &amp; American Cheese Cracker", 9.82, R.drawable.food2, ""))
        foodList.add(Food("#565784", "Fresh Bananas, Pound", 0.66, R.drawable.food3, ""))
    }
}