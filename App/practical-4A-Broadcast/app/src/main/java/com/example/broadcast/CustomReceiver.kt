package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
class CustomReceiver:BroadcastReceiver(){
    override fun onReceive(p0: Context, p1: Intent) {
        if(p1.action == Intent.ACTION_POWER_CONNECTED)
        {
            Toast.makeText(p0,"power is live",Toast.LENGTH_SHORT).show()
        }
        else if (p1.action == Intent.ACTION_POWER_DISCONNECTED ){
            Toast.makeText(p0,"power is out",Toast.LENGTH_SHORT).show()
        }
    }

}