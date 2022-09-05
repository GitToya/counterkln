package com.example.counterkln

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count : Int = 0
        var text = findViewById<TextView>(R.id.text)
        var temp = findViewById<TextView>(R.id.test)
        var plusbutton = findViewById<Button>(R.id.plus)
        var minusbutton = findViewById<Button>(R.id.minus)
        val counter :Counter = Counter
        val counter2 :Counter = Counter


        plusbutton.setOnClickListener(
            {

                text.setText(counter.add().toString())
            }
        )
        minusbutton.setOnClickListener(
            {

                text.setText(counter.minus().toString())
            }
        )
        if(counter==counter2)
        {
            temp.setText("counter1とcounter2は同じ")
        }

    }
}

object Counter {
    var count: Int = 0

    fun add ():Int{
        count++
        return count
    }
    fun minus ():Int{
        if(count>0) {
            count--
        }
        return count
    }



}



