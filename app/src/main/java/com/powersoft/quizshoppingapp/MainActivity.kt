package com.powersoft.quizshoppingapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.powersoft.quizshoppingapp.databinding.ActivityMainBinding
import com.powersoft.quizshoppingapp.problem2and3.activities.ShoppingActivity
import com.powersoft.quizshoppingapp.quizapp.QuizActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShopping.setOnClickListener {
            startActivity(Intent(this@MainActivity, ShoppingActivity::class.java))
        }

        binding.btnQuiz.setOnClickListener {
            startActivity(Intent(this@MainActivity, QuizActivity::class.java))
        }
    }
}