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

        val menucomida = ArrayList<String>()

        menucomida.add("Hamburguesa")
        menucomida.add("Pizza")
        menucomida.add("Crepa")
        menucomida.add("Gaseosa")
        menucomida.add("Cafe")
        menucomida.add("Agua Pura")

        val adaptador = ArrayAdapter(this,R.layout.simple_list_item_1,menucomida)

        val listView: ListView = findViewById(R.id.LVComida)
        listView.setAdapter(adaptador)

        listView.setOnItemClickListener(object:AdapterView.OnItemClickListener {
            override fun onItemClick(parent:AdapterView<*>, view:View, position:Int,
                            id:Long) {
                val item = (view as TextView).getText().toString()
                Toast.makeText(getBaseContext(), "Se ha añaido" +item+ "A la Orden", Toast.LENGTH_LONG).show()

                (applicationContext as MyApplication).mymenuorder.add(item)
            }
        })


        val btninicio = findViewById<Button>(R.id.btnInicio)

                btninicio.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
//                val intent = Intent(this@PantallaInicio, MostrarMenu::class.java)
//                startActivity(intent)
                finish()
            }
        })



    }


}
