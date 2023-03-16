package com.example.tablelayoutcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add:Button = findViewById(R.id.button)
        val minus:Button = findViewById(R.id.button2)
        val Multiple:Button = findViewById(R.id.button3)
        val divide:Button = findViewById(R.id.button4)

        val num1:EditText = findViewById(R.id.editTextNumberDecimal)
        val num2:EditText = findViewById(R.id.editTextNumberDecimal2)

        val ansgrd:TextView = findViewById(R.id.answergrid)

        try {


            add.setOnClickListener {
                val n = gettex(num1, num2)
                val res = n[0] + n[1]
                ansgrd.text = res.toString()

            }
            minus.setOnClickListener {
                val n = gettex(num1, num2)
                val res = n[0] - n[1]
                ansgrd.text = res.toString()
            }
            Multiple.setOnClickListener {
                val n = gettex(num1, num2)
                val res = n[0] * n[1]
                ansgrd.text = res.toString()
            }
            divide.setOnClickListener {
                val n = gettex(num1, num2)
                val res = n[0] / n[1]
                ansgrd.text = res.toString()
            }

        }catch (e:Exception){
            Toast.makeText(this, "Arithmetic Errors $e",Toast.LENGTH_SHORT).show()
        }





    }

    private fun gettex(num1: EditText, num2: EditText): MutableList<Float> {
        if (num1.text.toString() == "" && num2.text.toString() == ""){
            val li = mutableListOf<Float>()
            li.add(0f)
            li.add(0f)
            return li
        }
        val list = mutableListOf<Float>()
        list.add(num1.text.toString().toFloat())
        list.add(num2.text.toString().toFloat())
        return list
    }
}