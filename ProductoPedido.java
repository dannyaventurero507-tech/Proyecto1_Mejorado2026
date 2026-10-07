/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Elizabeth
 */
class ProductoPedido {

    String codigo;
    String nombre;
    double precio;
    int cantidad;

    ProductoPedido(String codigo, String nombre, double precio, int cantidad) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return precio * cantidad;
    }
}