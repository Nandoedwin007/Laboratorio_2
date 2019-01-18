package com.example.edwincoronado.laboratorio2.Logic

import android.app.Application
import android.widget.ArrayAdapter
import android.widget.ListView
import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class MyApplication : Application() {

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


        val mymenuorder = MyMenuOrder()
//        mymenuorder.menuOrder.add("Hamburguesa")
//        mymenuorder.menuOrder.add("Pizza")
//        mymenuorder.menuOrder.add("Crepa")
//        mymenuorder.menuOrder.add("Gaseosa")
//        mymenuorder.menuOrder.add("Cafe")




        // Use ApplicationContext.
        // example: SharedPreferences etc...
        //val context: Context = MyApplication.applicationContext()
    }
}