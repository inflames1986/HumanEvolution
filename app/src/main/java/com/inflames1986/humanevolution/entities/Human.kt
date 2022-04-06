package com.inflames1986.humanevolution.entities

import android.util.Log

data class Human(
    val name: String = "Vasiliy",
    val age: Int = 0,
    val gender: String = "male",
) : Walkable {


    override fun walk(distance: Int) {
        Log.d("@@@", "$distance")
    }
}

data class HumanParameters(
    val height: Int = 0,
    val weight: Int = 0,
)

fun getDefaultHuman() = Human("Human1", 1, "male")
fun getDefaultHumanParameters() = HumanParameters(30, 10)


