package com.example.broadcast

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val c = CustomReceiver()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        filter.addAction(Intent.ACTION_POWER_CONNECTED)
        this.registerReceiver(c, filter) //method of main Context take two args BroadcastReceiver receiver, IntentFilter filter
    }
}