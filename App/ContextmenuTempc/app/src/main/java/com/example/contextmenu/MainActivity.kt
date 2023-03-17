package com.example.contextmenu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    var state:Float =0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val but:Button = findViewById(R.id.button)
        registerForContextMenu(but)
        val tv:TextView =findViewById(R.id.textView)
        val edt:EditText = findViewById(R.id.editTextNumber)
        but.setOnClickListener {
            try{
                val value:Float = edt.text.toString().toFloat()
                val c = Overloaded(1f,2f)
                var ans= c.calc(state,value)



                tv.text = ans
            }catch (e:java.lang.Exception){
                Toast.makeText(this,"Crashed ",Toast.LENGTH_SHORT).show()
            }

        }
        Thread{
            Thread.sleep(15000)
            runOnUiThread{
                state=0f
            }
        }.start()


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.main1){
          Toast.makeText(this,"menue 1 ",Toast.LENGTH_SHORT).show()
            state = 1f
        }
        else if (id == R.id.main2){
            Toast.makeText(this,"menue 2 ",Toast.LENGTH_SHORT).show()
            state = 2f
        }
        else if (id == R.id.main3){
            Toast.makeText(this,"menue 3 ",Toast.LENGTH_SHORT).show()
            state = 3f
        }
        else if (id == R.id.main4){
            Toast.makeText(this,"menue 4 ",Toast.LENGTH_SHORT).show()
            state = 4f
        }
        else if (id == R.id.main5){
            Toast.makeText(this,"menue 5 ",Toast.LENGTH_SHORT).show()
            state = 5f
        }
        return true
    }

    private fun state(ins:Int){
        when(ins){

        }
    }
}