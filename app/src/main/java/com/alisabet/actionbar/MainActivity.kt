package com.alisabet.actionbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //get back button 
        if (supportActionBar != null){
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        }

    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
        //function of back button
        when(item!!.itemId){
            android.R.id.home -> {
                Toast.makeText(this, "back", Toast.LENGTH_LONG).show()
            }
        }
    }

}
