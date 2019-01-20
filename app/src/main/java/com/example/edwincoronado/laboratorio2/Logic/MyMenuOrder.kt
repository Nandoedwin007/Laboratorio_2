package com.example.edwincoronado.laboratorio2.Logic

class MyMenuOrder:MenuOrder {
    override val menuOrder = ArrayList<String>() // Pedido

    override fun clear() {

    }//Limpiar Pedido
    override fun add(element: String) {
        menuOrder.add(element)
    } //Agregar elemento

    //Cambiamos la función de eliminar elemento de modo a que lo elimine cuando sean iguales y no utilizando su posición
    override fun del(elemento: String) {
        menuOrder.remove(elemento)
    } //Elimina Elemento
    override fun done() {

    } //Realiza Pedido
}