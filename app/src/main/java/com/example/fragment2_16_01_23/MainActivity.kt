package com.example.fragment2_16_01_23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment2_16_01_23.fragments.InterfazMenuClick

class MainActivity : AppCompatActivity(), InterfazMenuClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onMenuClick(nBtn: Int) {
        val i = Intent(this, DosActivity::class.java).apply {
            putExtra("Boton", nBtn)
        }
        startActivity(i)
    }
}