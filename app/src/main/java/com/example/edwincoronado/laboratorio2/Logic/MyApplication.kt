package com.example.edwincoronado.laboratorio2.Logic

import android.app.Application
import android.widget.ArrayAdapter
import android.widget.ListView
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.logging.Logger.global


class MyApplication : Application() {

    val mymenuorder = MyMenuOrder()

    init {
        instance = this
    }

    companion object {
        private var instance: MyApplication? = null

//        fun applicationContext() : Context {
//            return instance!!.applicationContext
//        }
    }


    override fun onCreate() {
        super.onCreate()
        // initialize for any







    }
}