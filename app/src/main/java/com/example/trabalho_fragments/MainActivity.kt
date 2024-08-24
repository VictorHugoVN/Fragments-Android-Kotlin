package com.example.trabalho_fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonList = findViewById<Button>(R.id.buttonMainA)

        buttonList.setOnClickListener {
            val intentRecycler = Intent(context, ListView::class.java)
            intentRecycler.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intentRecycler)
        }


    }
}