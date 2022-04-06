package com.inflames1986.humanevolution

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.inflames1986.humanevolution.entities.Human
import com.inflames1986.humanevolution.entities.Walkable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human: Human = Human("Petya", 20, "male")
        human.walk(200)

        val walker = Walkable { distance -> Log.d("@@@", "Walkers distance $distance") }

        walker.walk(1000)
    }
}