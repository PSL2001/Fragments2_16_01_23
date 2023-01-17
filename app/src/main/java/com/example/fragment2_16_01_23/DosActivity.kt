package com.example.fragment2_16_01_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.fragment2_16_01_23.fragments.*

class DosActivity : AppCompatActivity(), InterfazMenuClick {
    private val fragments = arrayOf(ConfigFragment(), LinternaFragment(), MusicaFragment())
    private var numBoton = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dos)
        val datos = intent.extras
        datos?.let {
            numBoton = it.getInt("Boton")
        }
        cargarFragment(fragments[numBoton])
    }

    private fun cargarFragment(fragment: Fragment) {
        val bundle = Bundle().apply {
            putInt("Boton", numBoton)
        }
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<MenuFragment>(R.id.fg_menu, args=bundle)
            replace(R.id.fg_generico, fragment)
            addToBackStack(null)
        }
    }

    override fun onMenuClick(numeroBtn: Int) {
        Log.d("BOTO----------------------------->", numeroBtn.toString())
        numBoton = numeroBtn
        cargarFragment(fragments[numBoton])
    }
}