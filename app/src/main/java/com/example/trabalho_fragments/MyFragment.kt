package com.example.trabalho_fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MyFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_fragment)
        val buttonFragment = findViewById<FloatingActionButton>(R.id.buttonFragmentBackMain)


        if (savedInstanceState == null) { //Que quer dizer isso? Alguém sabe? Dica Lembre do ciclo de vida da Acitivy.
            val ft = supportFragmentManager.beginTransaction()
            val frag1 = FragmentUnity()
            val frag2 = FragmentUnity2()
            ft.add(R.id.fragment_main, frag1, "Primeiro fragmento")
            //ft.add(R.id.fragmentContato2, frag2, "Segundo fragmento")
            ft.commit()
        }
        buttonFragment.setOnClickListener {
            finish()
        }
    }
}
