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

        val _fun = fun(float: Float): Unit {

        }

        val _fun2 = fun(float: Float): Float {
            return 1f
        }

        val _fun3 = fun(boo: Boolean): Boolean {
            return true
        }

        fun funhight(
            _fun: (float: Float) -> Unit,
            _fun2: (float: Float) -> Float,
            _fun3: (boo: Boolean) -> Boolean
        ) { //функции высшего порядка - передача функции внутрь функции
            val f = _fun(1f)
            val f2 = _fun2(11f)
            val f3 = _fun3(true)
        }

        fun main(){
            funhight(_fun, _fun2, _fun3 )
        }
    }
}