package com.example.practical_3b_shared_pref

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var Name:String="name"
    var Phone:String="phone"
    var mypref:String="mypref"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ed1 = findViewById<EditText>(R.id.editText1)
        val ed2 = findViewById<EditText>(R.id.editText2)
        val b1 = findViewById<Button>(R.id.button)
        val sharedPreferences: SharedPreferences =getSharedPreferences(this.mypref, MODE_PRIVATE)
        b1.setOnClickListener{
            val n=ed1.text.toString()
            val ph=ed2.text.toString()
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString(this.Name,n)
            editor.putString(this.Phone,ph)
            editor.commit()
            Toast.makeText(this, "Thanks", Toast.LENGTH_SHORT).show()
        }
    }
}