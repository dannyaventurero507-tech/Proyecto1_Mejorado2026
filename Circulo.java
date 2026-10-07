/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Elizabeth
 */
public class Circulo extends FiguraGeometrica {

    double radio;

    //Constructor: Guarda el radio que le enviamos
    Circulo(double radio) {
        this.radio = radio;
    }

    //Calcula el area con la formula PI x radio al cuadrado.
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}