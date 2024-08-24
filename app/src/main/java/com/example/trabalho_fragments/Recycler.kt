package com.example.trabalho_fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Recycler : AppCompatActivity() {

    private val context: Context get() = this
    //private lateinit var binding: RecyclerViewLayoutBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_view_layout)
        //binding = RecyclerViewLayoutBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        val buttonRecycler = findViewById<Button>(R.id.buttonRecycler)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 4", "Item 4",
            "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "Item 4", "item x")
        val adapter = MyAdapter(items)
        recyclerView.adapter = adapter


        // Configurando o RecyclerView

        //binding.recyclerView.layoutManager = LinearLayoutManager(this)
        //binding.recyclerView.adapter = MyAdapter(items)


        buttonRecycler.setOnClickListener {
            finish()
        }


    }
}