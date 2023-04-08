package com.powersoft.quizshoppingapp.problem2and3.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.powersoft.quizshoppingapp.databinding.ActivityFoodDetailBinding
import com.powersoft.quizshoppingapp.problem2and3.models.Food

class FoodDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFoodDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var food = intent.getSerializableExtra("food") as Food
        binding.ivFood.setImageResource(food.image)
        binding.tvPrice.text = "$ ${food.price.toString()}"
        binding.tvName.text = food.name
        binding.tvDesc.text = food.desc
    }
}