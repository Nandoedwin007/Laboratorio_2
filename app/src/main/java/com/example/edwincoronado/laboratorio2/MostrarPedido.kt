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

        //adaptador.notifyDataSetChanged()


        //listView.setOnItemClickListener()

        listView.setOnItemClickListener(object:AdapterView.OnItemClickListener {
            override fun onItemClick(parent:AdapterView<*>, view:View, position:Int,
                                     id:Long) {
                val item = (view as TextView).getText().toString()


                (applicationContext as MyApplication).mymenuorder.del(item)

                Toast.makeText(getBaseContext(), "Se ha REMOVIDO " +item+ " de la orden", Toast.LENGTH_LONG).show()
            }
        })


        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)

        btnLimpiar.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
//                val intent = Intent(this@PantallaInicio, MostrarMenu::class.java)
//                startActivity(intent)
                (applicationContext as MyApplication).mymenuorder.menuOrder.clear()
                adaptador.notifyDataSetChanged()
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


        val btnhacer = findViewById<Button>(R.id.btnHacer)

        btnhacer.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
//                val intent = Intent(this@PantallaInicio, MostrarMenu::class.java)
//                startActivity(intent)
                Toast.makeText(getBaseContext(), "Se ha realizado el pedido", Toast.LENGTH_LONG).show()
            }
        })






    }//Finaliza onCreate
}
