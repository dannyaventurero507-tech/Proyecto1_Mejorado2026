/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Elizabeth
 */
class Pedido {
    
    ProductoPedido[] productos; //arreglo de productos
    int cantidadProductos;

    //constructor de la clase
    Pedido() {
        productos = new ProductoPedido[10];
        cantidadProductos = 0; //contador
    }

    public void agregarProducto(ProductoPedido producto) {

        if (cantidadProductos < productos.length) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;

            System.out.println("Producto agregado correctamente.");
        } else {
            System.out.println("No se pueden agregar mas productos.");
        }
    }

    public void mostrarProductos() {

        System.out.println("\n            PRODUCTOS DEL PEDIDO");

        for (int i = 0; i < cantidadProductos; i++) {

            System.out.println("Codigo: " + productos[i].codigo);
            System.out.println("Nombre: " + productos[i].nombre);
            System.out.println("Precio: $" + productos[i].precio);
            System.out.println("Cantidad: " + productos[i].cantidad);
            System.out.println("Subtotal: $" + productos[i].calcularSubtotal());
            System.out.println();
        }
    }

    public double calcularSubtotal() {

        double subtotal = 0;

        for (int i = 0; i < cantidadProductos; i++) {
            subtotal = subtotal + productos[i].calcularSubtotal();
        }

        return subtotal;
    }

    public double calcularImpuesto() {
        return calcularSubtotal() * 0.07;
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularImpuesto();
    }
}