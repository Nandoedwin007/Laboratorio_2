package com.example.edwincoronado.laboratorio2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MostrarMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_menu)

        val menucomida = ArrayList<String>()

        menucomida.add("Hamburguesa")
        menucomida.add("Pizza")
        menucomida.add("Crepa")
        menucomida.add("Gaseosa")
        menucomida.add("Cafe")

        val adaptador = ArrayAdapter(this,R.layout.simple_list_item_1,menucomida)

        val listView: ListView = findViewById(R.id.LVComida)
        listView.setAdapter(adaptador)



//        val button = findViewById<Button>(R.id.button)
//
//
//
//        // Another way to set button click listener
//        button.setOnClickListener(object: View.OnClickListener {
//            override fun onClick(view: View): Unit {
//                // Handler code here.
//                val intent = Intent(this@PantallaInicio, MostrarMenu::class.java)
//                startActivity(intent)
//            }
//        })




    }


}
