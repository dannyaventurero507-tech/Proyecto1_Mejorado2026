/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author LATITUDE3190
 */
class Producto {
    //Atributos: Las caracteristicas que tendra todo producto normal
    String Codigo;
    String Nombre;
    double precio;
    
    //Constructor recibe los datos entre los parentisis y los guarda en los atributos de arriba
    Producto(String Codigo, String Nombre, double precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.precio = precio;
    }

    //Metodo, calcula el precio final como es un producto nomal, solo devuelve el precio original.
    public double CalcularPrecioFinal() {
        return precio;
    }
}