package com.example.edwincoronado.laboratorio2.Logic

class MyMenuOrder:MenuOrder {
    override val menuOrder = ArrayList<String>() // Pedido

    override fun clear() {

    }//Limpiar Pedido
    override fun add(element: String) {
        menuOrder.add(element)
    } //Agregar elemento
    override fun del(elementIndex: Int) {
        menuOrder.removeAt(elementIndex)
    } //Elimina Elemento
    override fun done() {

    } //Realiza Pedido
}