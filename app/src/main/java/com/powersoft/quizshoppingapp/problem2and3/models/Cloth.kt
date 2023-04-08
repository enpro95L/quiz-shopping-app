package com.powersoft.quizshoppingapp.problem2and3.models

//type = "Man", "Woman", "Children"
data class Cloth(val name: String, val price: Double, val type: String, val size: Int, val image: Int) :
    java.io.Serializable
