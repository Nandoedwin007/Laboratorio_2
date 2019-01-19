package com.example.edwincoronado.laboratorio2.Logic

interface MenuOrder {
    val menuOrder: ArrayList<String> // Pedido

    fun clear() //Limpiar Pedido
    fun add(element: String) //Agregar elemento
    fun del(elemento: String) //Elimina Elemento
    fun done() //Realiza Pedido
}