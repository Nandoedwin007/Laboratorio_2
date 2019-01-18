package com.example.edwincoronado.laboratorio2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.app.Activity
import android.content.Intent
import android.util.Log

import android.widget.EditText
import android.widget.TextView
import android.graphics.Color
import android.view.View
import android.widget.ArrayAdapter


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



        // Another way to set button click listener
        button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                val intent = Intent(this@PantallaInicio, MostrarMenu::class.java)
                startActivity(intent)
            }
        })

    }



    /*fun launchMostrarMenu(view: View) {
        Log.d(LOG_TAG, "Button Mostrar Menu clicked!")

        val intent = Intent(this, MostrarMenu::class.java)
        //val message = editText_main!!.text

        //intent.putExtra(EXTRA_MESSAGE, message)
        startActivityForResult(intent, TEXT_REQUEST)
    }*/


}
