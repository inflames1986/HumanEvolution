package com.inflames1986.humanevolution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inflames1986.humanevolution.entities.Human

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human: Human = Human("Petya", 20, "male")
        human.walk(200)
    }
}