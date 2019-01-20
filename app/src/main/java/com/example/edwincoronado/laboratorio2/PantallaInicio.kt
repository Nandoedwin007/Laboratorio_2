package com.example.edwincoronado.laboratorio2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


import android.content.Intent



import android.view.View


class PantallaInicio : AppCompatActivity() {



    companion object {
        // Class name for Log tag
        private val LOG_TAG = PantallaInicio::class.java.simpleName
        // Unique tag required for the intent extra
        val EXTRA_MESSAGE = "EXTRA_MESSAGE"
        // Unique tag for the intent reply
        val TEXT_REQUEST = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_inicio)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)




        //Funcion que abre la activity de MostrarMenu
        button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                val intent = Intent(this@PantallaInicio, MostrarMenu::class.java)
                startActivity(intent)
            }
        })

        //Funcion que abre la activity de MostrarPedido
        button2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                val intent = Intent(this@PantallaInicio, MostrarPedido::class.java)
                startActivity(intent)
            }
        })

    }

}
