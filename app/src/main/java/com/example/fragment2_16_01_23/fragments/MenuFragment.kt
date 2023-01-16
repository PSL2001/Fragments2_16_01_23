package com.example.fragment2_16_01_23.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.fragment2_16_01_23.R


class MenuFragment : Fragment() {

    var listener: InterfazMenuClick? = null
    private var botonesMenu = arrayOf<Int>(R.id.ivGears, R.id.ivLinterna, R.id.ivMusica)
    private var imagenesBotonesIluminados = arrayOf<Int>(R.drawable.gears2, R.drawable.linterna2, R.drawable.musica2)

    private var botonIluminado = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            botonIluminado = it.getInt("Boton")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var btnImagen: ImageView
        for (i in botonesMenu.indices) {
            btnImagen = view.findViewById(botonesMenu[i])
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is InterfazMenuClick) listener = context
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

}