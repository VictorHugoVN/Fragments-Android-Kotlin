package com.example.trabalho_fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MyFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_fragment)
        if(savedInstanceState == null){ //Que quer dizer isso? Alguém sabe? Dica Lembre do ciclo de vida da Acitivy.
            val ft = supportFragmentManager.beginTransaction()
            val frag1 = FragmentUnity()
            ft.add(R.id.fragment1,frag1,"AloFragmento")
            val frag2 = FragmentUnity()
            ft.add(R.id.fragment2, frag2, "Fragmento 2")
            ft.commit()
        }
    }
}
