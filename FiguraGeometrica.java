/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Elzabeth
 */

public abstract class FiguraGeometrica {

    //Aqui la palabra abstract signifca que esta clase es solo una idea general, no puedes dibujar una figura geometrica generica 
    //tiene que se una figura especifica
    
    //Al poner abstrac le estamos diciendo a todas las figuras, no me iporta como lo hagas, pero si quieres ser una figuraGeometrica, 
    //tienes que saber calcular tu area
    
    public abstract double calcularArea();
    
}