package com.example.trabalho_fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trabalho_fragments.model.fakeEmails
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Recycler : AppCompatActivity() {

    private val context: Context get() = this

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_layout)
        val buttonRecycler = findViewById<FloatingActionButton>(R.id.buttonRecycler)
        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = EmailAdapter(fakeEmails())
        recyclerView.layoutManager = LinearLayoutManager(this)


        buttonRecycler.setOnClickListener {
            finish()
        }


    }
}