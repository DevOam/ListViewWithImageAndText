package com.listviewwithimageandtext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView = findViewById(R.id.listView) as ListView
        var arrayPays:ArrayList<Pays> = ArrayList()
        arrayPays.add(Pays("argentina", "+23", R.drawable.argentina))
        arrayPays.add(Pays("australia", "+213", R.drawable.australia))
        arrayPays.add(Pays("algeria", "+2213", R.drawable.algeria))
    listView.adapter = PaysAdapter(applicationContext, arrayPays)
    }
}