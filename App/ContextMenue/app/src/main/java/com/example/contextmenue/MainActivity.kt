package com.example.contextmenue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button = findViewById(R.id.button)
        registerForContextMenu(btn);

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.menues,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.context_menu_item1){
            Toast.makeText(this,"Context Menu Item 1 pressed ",Toast.LENGTH_SHORT).show()
        }
       else if (item.itemId==R.id.context_menu_item2){
            Toast.makeText(this,"Context Menu Item 2 pressed ",Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)


    }

}