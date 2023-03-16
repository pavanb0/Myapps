package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val tv:TextView = findViewById(R.id.tv) //for sake of simplicity not creating separate file containing anim
        val anim = AlphaAnimation(0f,1f)
        anim.duration = 1000
        anim.repeatCount = 100
        tv.startAnimation(anim)
    }
}