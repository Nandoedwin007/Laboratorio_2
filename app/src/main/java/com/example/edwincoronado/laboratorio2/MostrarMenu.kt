package com.example.edwincoronado.laboratorio2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.edwincoronado.laboratorio2.Logic.MyApplication

class MostrarMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_menu)

        //Creamos un ArrayList para mostrar el Menu Principal
        val menucomida = ArrayList<String>()

        //Agregamos los elemntos al menu principal
        menucomida.add("Hamburguesa")
        menucomida.add("Pizza")
        menucomida.add("Crepa")
        menucomida.add("Gaseosa")
        menucomida.add("Cafe")
        menucomida.add("Agua Pura")


        //Se crea el adaptador para poder hacer un Merge con los datos del ArrayList del menu con el ListView
        val adaptador = ArrayAdapter(this,R.layout.simple_list_item_1,menucomida)

        val listView: ListView = findViewById(R.id.LVComida)
        //Se aplica el adaptador al ListView
        listView.setAdapter(adaptador)

        //Función que agrega los elemntos al ArrayList global (el que se generó el la clase MyApplication)
        // Ya que este posee la orden actual
        listView.setOnItemClickListener(object:AdapterView.OnItemClickListener {
            override fun onItemClick(parent:AdapterView<*>, view:View, position:Int,
                            id:Long) {
                val item = (view as TextView).getText().toString()
                Toast.makeText(getBaseContext(), "Se ha añaido " +item+ " a su orden", Toast.LENGTH_LONG).show()
                (applicationContext as MyApplication).mymenuorder.add(item)
            }
        })

    //Función que termina la activity (MostrarMenu) y regresa a la MainActivity (PantallaInicio)
        val btninicio = findViewById<Button>(R.id.btnInicio)

                btninicio.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                finish()
            }
        })



    }


}
