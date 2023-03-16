package com.example.constrainlayoutrb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rabtgrp:RadioGroup = findViewById(R.id.radioButtonGroup)

        rabtgrp.setOnCheckedChangeListener{ rab , id->
            val ids:RadioButton = findViewById(id)
            val tx = ids.text.toString()
            Toast.makeText(this, tx + " is pressed" , Toast.LENGTH_SHORT).show()
        }
    }
}