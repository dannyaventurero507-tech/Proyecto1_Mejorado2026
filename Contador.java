/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Daniel
 */
class Contador {

    //Atributos variables para guardarr los datos del contador
    String Nombre;
    double salario;

    //Constructor ecibe e inicializa los datos
    Contador(String Nombre, double salario) {
        this.Nombre = Nombre;
        this.salario = salario;
    }

    //Metodo que imprime en pantalla el nombre y el salario del contador.
    public void MostrarDatos() {
        System.out.println("Nombre es: " + Nombre);
        System.out.println("Salario es: " + salario);
    }
}