package com.powersoft.quizshoppingapp.problem2and3.models

data class Food(
    val id: String,
    val name: String,
    val price: Double,
    val image: Int,
    val desc: String
) : java.io.Serializable
