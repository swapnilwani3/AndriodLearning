package com.example.listsandviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        var countryList = resources.getStringArray(R.array.countries)

        var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,countryList)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, l ->
            val countryName : String = parent.getItemAtPosition(position).toString()
            Log.i("swap",countryName)
            Toast.makeText(applicationContext,"You clicked at : $countryName",Toast.LENGTH_LONG)
        }


    }
}