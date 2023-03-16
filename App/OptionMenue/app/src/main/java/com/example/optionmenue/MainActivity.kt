package com.example.optionmenue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menue,menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.option_menu_item1){
            Toast.makeText(this,"Context Menu Item 1 pressed ", Toast.LENGTH_SHORT).show()
        }
        else if(item.itemId == R.id.option_menu_item2){
            Toast.makeText(this,"Context Menu Item 2 pressed ", Toast.LENGTH_SHORT).show()

        }
        else if(item.itemId == R.id.option_menu_item3){
            Toast.makeText(this,"Context Menu Item 3 pressed ", Toast.LENGTH_SHORT).show()

        }
        else if(item.itemId == R.id.option_menu_item4){
            Toast.makeText(this,"Context Menu Item 4 pressed ", Toast.LENGTH_SHORT).show()

        }
        else if(item.itemId == R.id.option_menu_item5){
            Toast.makeText(this,"Context Menu Item 5 pressed ", Toast.LENGTH_SHORT).show()

        }
        return super.onOptionsItemSelected(item)


    }
}