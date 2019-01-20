package com.example.edwincoronado.laboratorio2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.edwincoronado.laboratorio2.Logic.MyApplication

class MostrarPedido : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_pedido)


        val ordenCliente = (applicationContext as MyApplication).mymenuorder.menuOrder


        val adaptador = ArrayAdapter(this,R.layout.simple_list_item_1,ordenCliente)

        val listView:ListView = findViewById(R.id.ltPedido)
        listView.setAdapter(adaptador)

        //Funcion que hace uso del OnItemLongClickListener para poder remover elementos de ArrayList
        listView.setOnItemLongClickListener(object:AdapterView.OnItemLongClickListener {
            override fun onItemLongClick(arg0:AdapterView<*>, view: View,
                                pos:Int, arg3:Long):Boolean {

                val item = (view as TextView).getText().toString()
                (applicationContext as MyApplication).mymenuorder.del(item)

                Toast.makeText(getBaseContext(), "Se ha REMOVIDO " +item+ " de la orden", Toast.LENGTH_LONG).show()
                adaptador.notifyDataSetChanged()
                return true
            }
        })


        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)
        //Función que limpia el ArrayList
        btnLimpiar.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                (applicationContext as MyApplication).mymenuorder.menuOrder.clear()
                adaptador.notifyDataSetChanged()
            }
        })

        val btninicio = findViewById<Button>(R.id.btnInicio2)
        //Función que termina la activity y regresa a la MainActivity (PantallaInicio)
        btninicio.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                finish()
            }
        })


        val btnhacer = findViewById<Button>(R.id.btnHacer)
        //Boton que realiza el pedido y lo notifica con un Toast
        btnhacer.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                Toast.makeText(getBaseContext(), "Se ha realizado el pedido", Toast.LENGTH_LONG).show()
            }
        })






    }//Finaliza onCreate
}
