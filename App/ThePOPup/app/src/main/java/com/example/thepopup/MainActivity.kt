package com.example.thepopup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button = findViewById(R.id.button)
        btn.setOnClickListener {
            val Inflate = PopupMenu(this, btn, 2)
           Inflate.menuInflater.inflate(R.menu.menu,Inflate.menu)
            Inflate.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.popup_menu_item1 -> {
                        // Handle popup menu item 1 selection
                        Toast.makeText(this,"pressed on 1",Toast.LENGTH_SHORT).show()

                        true
                    }
                    R.id.popup_menu_item2 -> {
                        Toast.makeText(this,"pressed on 2",Toast.LENGTH_SHORT).show()

                        // Handle popup menu item 2 selection
                        true
                    }
                    R.id.popup_menu_item3 -> {
                        Toast.makeText(this,"pressed on 3",Toast.LENGTH_SHORT).show()

                        // Handle popup menu item 3 selection
                        true
                    }
                    R.id.popup_menu_item4 -> {
                        Toast.makeText(this,"pressed on 4",Toast.LENGTH_SHORT).show()

                        // Handle popup menu item 3 selection
                        true
                    }
                    else -> false
                }
            }

            // Show the popup menu
            Inflate.show()

            // Return true to indicate that we've handled the long-press event
            true

        }
    }

}


