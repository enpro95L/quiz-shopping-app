package com.powersoft.quizshoppingapp.problem2and3.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.powersoft.quizshoppingapp.databinding.ActivityFoodDetailBinding
import com.powersoft.quizshoppingapp.problem2and3.models.Food

class FoodDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFoodDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "Food Details"

        val food = intent.getSerializableExtra("food") as Food
        binding.ivFood.setImageResource(food.image)
        binding.tvPrice.text = String.format("$%s", food.price)
        binding.tvName.text = food.name
        binding.tvDesc.text = food.desc
    }
}