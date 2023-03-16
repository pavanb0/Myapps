package com.example.tempcnvt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edittext:EditText = findViewById(R.id.editTextNumber)
        val btn:Button = findViewById(R.id.button2)
        val texttview:TextView = findViewById(R.id.textView)
        btn.setOnClickListener {
            try {
                val txt: Float = edittext.text.toString().toFloat()
                val c: String = ((txt - 32) * 5 / 9).toString()    //(C = (F-32) ×5/9)
                texttview.text = c
                trig(texttview) // Don't Add optional

            }catch (e:Exception){//  needed
                Toast.makeText(this,"No value in box 🙃",Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun trig(ed:TextView) { //optional
        Thread{
            Thread.sleep(5000*5)
            runOnUiThread {
                ed.text = "enter temp in f "
            }
        }.start()
    }
}