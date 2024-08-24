package com.example.trabalho_fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Recycler : AppCompatActivity() {

    private val context: Context get() = this

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_view_layout)


        val buttonRecycler = findViewById<Button>(R.id.buttonRecycler)


        buttonRecycler.setOnClickListener {
            finish()
        }


    }
}