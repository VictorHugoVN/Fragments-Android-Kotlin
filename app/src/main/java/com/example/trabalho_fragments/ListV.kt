package com.example.trabalho_fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListV : AppCompatActivity() {

    private val context: Context get() = this
    private lateinit var listView : ListView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view_layout)
        val buttonBackMain = findViewById<Button>(R.id.buttonListBackMain)

        listView = findViewById<ListView>(R.id.list_view)
        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Virat Kohli", "Rohit Sharma", "Steve Smith",
            "Kane Williamson", "Ross Taylor", "A","B","C","D","E","F","G","H","I","J","K"
        )

        // access the listView from xml file
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        listView.adapter = arrayAdapter

        buttonBackMain.setOnClickListener {
            finish()
        }

    }






}