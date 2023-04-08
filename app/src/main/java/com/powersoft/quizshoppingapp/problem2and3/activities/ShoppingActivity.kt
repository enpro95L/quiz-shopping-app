package com.powersoft.quizshoppingapp.problem2and3.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.powersoft.quizshoppingapp.R
import com.powersoft.quizshoppingapp.databinding.ActivityShoppingBinding

class ShoppingActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityShoppingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShoppingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cvBooks.setOnClickListener(this)
        binding.cvClothing.setOnClickListener(this)
        binding.cvOrganicFood.setOnClickListener(this)
        binding.cvMedicine.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.cvBooks -> openListViewActivity("book")
            R.id.cvClothing -> openListViewActivity("clothing")
            R.id.cvOrganicFood -> openRecyclerViewActivity()
            R.id.cvMedicine -> openListViewActivity("medicine")
        }
    }

    /*This is for problem 2
    * Create new Activity with listview and show the data*/
    private fun openListViewActivity(id: String) {
        startActivity(Intent(this, BookListActivity::class.java))
    }

    /*This is for problem 3
    * Create new Activity with recyclerview and work on that */
    private fun openRecyclerViewActivity() {
        startActivity(Intent(this, FoodListActivity::class.java))
    }
}