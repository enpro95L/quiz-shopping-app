package com.powersoft.quizshoppingapp.problem2and3.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.powersoft.quizshoppingapp.databinding.ItemFoodBinding
import com.powersoft.quizshoppingapp.problem2and3.activities.FoodDetailActivity
import com.powersoft.quizshoppingapp.problem2and3.models.Food

class FoodAdapter(private val foodList: ArrayList<Food>) :
    RecyclerView.Adapter<FoodAdapter.Holder>() {

    inner class Holder(private val binding: ItemFoodBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(food: Food) {
            binding.imgFood.setImageResource(food.image)
            binding.tvName.text = food.name
            binding.tvPrice.text = String.format("$%.2f", food.price)
            binding.tvId.text = food.id
            binding.root.setOnClickListener {
                Toast.makeText(binding.root.context, food.name, Toast.LENGTH_SHORT).show()

                var i = Intent(binding.root.context, FoodDetailActivity::class.java)
                i.putExtra("food", food)
                binding.root.context.startActivity(i)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemFoodBinding.inflate(inflater, parent, false);
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(foodList[position])
    }

    override fun getItemCount() = foodList.size
}