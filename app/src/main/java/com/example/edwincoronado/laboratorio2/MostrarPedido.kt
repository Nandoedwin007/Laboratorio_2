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

        listView.setOnItemClickListener(object: AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, view: View, position:Int,
                                     id:Long) {
                val item = (view as TextView).getText().toString()
                Toast.makeText(getBaseContext(), "Se ha añaido" +item+ "A la Orden", Toast.LENGTH_LONG).show()

                (applicationContext as MyApplication).mymenuorder.add(item)
            }
        })


        val btninicio = findViewById<Button>(R.id.btnInicio2)

        btninicio.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
//                val intent = Intent(this@PantallaInicio, MostrarMenu::class.java)
//                startActivity(intent)
                finish()
            }
        })


//        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)
//
//        btninicio.setOnClickListener(object: View.OnClickListener {
//            override fun onClick(view: View): Unit {
//                // Handler code here.
////                val intent = Intent(this@PantallaInicio, MostrarMenu::class.java)
////                startActivity(intent)
//                (applicationContext as MyApplication).mymenuorder.clear()
//            }
//        })



    }
}
