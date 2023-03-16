package com.example.intents_implictite_explicite

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val implicit:Button = findViewById(R.id.Implicit)
        val explicit:Button = findViewById(R.id.Explicit)
        implicit.setOnClickListener {
            val Implicite_Intent: Intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/pavanb0"))
            //implicit parsing outside app vice versa
            startActivity(Implicite_Intent)
        }
        explicit.setOnClickListener {

            val exp:Intent = Intent(this,MainActivity2::class.java)
            startActivity(exp)
        }
    }
}