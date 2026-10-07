/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author LATITUDE3190
 */
class Problema6 {

    public static void ejecutar() {

        //Creamos un producto normal enviandole su codigo, nombre, precio
        Producto producto = new Producto("P001", "Teclado", 50.00);

        //Creamos un producto esencial con descuento enviandole codigo, nombre, precio original y el % de descuento (que es el 10.00)
        ProductoDescuento productoDescuento = new ProductoDescuento("P001", "Mouse", 40.00, 10.00);

        //Mostramos el producto normal
        System.out.println("     PRODUCTO");
        System.out.println("El Codigo es: " + producto.Codigo);
        System.out.println("El nombre es: " + producto.Nombre);
        System.out.println("El precio final es: " + producto.CalcularPrecioFinal());

        System.out.println(); //salto de linea para separar

        //Mostramos el producto con descuento
        System.out.println("     PRODUCTO CON DESCUENTO");
        System.out.println("El Codigo es: " + productoDescuento.Codigo);
        System.out.println("El nombre es: " + productoDescuento.Nombre);
        System.out.println("El precio original es: " + productoDescuento.Precio);
        System.out.println("Descuento: " + productoDescuento.descuento + "%");
        System.out.println("El precio final: $" + productoDescuento.calcularPrecioFinal());
    }
}