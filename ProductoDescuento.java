/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author LATITUDE3190
 */

//Atributos con las mismas caracteristicas mas el descuento
class ProductoDescuento {
    String Codigo;
    String Nombre;
    double Precio;
    double descuento;

    //Constructor recibe 4 datos en lugar de tres
    ProductoDescuento(String Codigo, String Nombre, double Precio, double descuento) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.descuento = descuento;
    }

    //Metodo calcula el precio original y le resta la cantidad del descuento
    public double calcularPrecioFinal() {
        return Precio - (Precio * descuento / 100);
    }
}