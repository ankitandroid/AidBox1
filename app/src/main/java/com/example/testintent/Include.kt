package com.example.testintent

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_drawer.*

class Include : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawer)
        toggle= ActionBarDrawerToggle(this,drawerlayout,R.string.Open,R.string.Close)
        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item1-> Toast.makeText(applicationContext,"Clicked Item1",
                    Toast.LENGTH_SHORT).show()
                R.id.item2-> Toast.makeText(applicationContext,"Clicked Item2",
                    Toast.LENGTH_SHORT).show()
                R.id.item3-> Toast.makeText(applicationContext,"Clicked Item3",
                    Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item))
        {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}