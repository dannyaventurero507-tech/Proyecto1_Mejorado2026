/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Elizabeth
 */
public class Rectangulo extends FiguraGeometrica {

    double base, altura; //Necesita dos medias

    //Constructor Guarda los valores del rectangulo
    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Calcula 
    public double calcularArea() {
        return base * altura;
    }
}