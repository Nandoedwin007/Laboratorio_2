package com.example.edwincoronado.laboratorio2.Logic

import android.app.Application
import android.widget.ArrayAdapter
import android.widget.ListView
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.logging.Logger.global


class MyApplication : Application() {

    //Se genera un Objeto de la clase MyMenuOrder
    val mymenuorder = MyMenuOrder()

    init {
        instance = this
    }

    companion object {
        private var instance: MyApplication? = null

    }


    override fun onCreate() {
        super.onCreate()




    }
}