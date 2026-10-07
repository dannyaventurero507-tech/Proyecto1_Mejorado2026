/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Daniel
 */
class Desarrollador {

    //Atributos las variables que guardan la informacion del desarrollador
    String nombre;
    double salario;

    //Constructor: Recibe el nombre y salario iniciales y los guardas en las varibles usando this.
    Desarrollador(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    //Metodo imprime en pantalla la informacion del desarrollador
    public void MostrarDatos() {
        System.out.println("Nombre es: " + nombre);
        System.out.println("Salario es: " + salario);
    }

    //Metodo es una accion especifica que solo puede realizar el desarrollador
    public void TrabajarRemotamente() {
        System.out.println("El desarrollador puede trabajar remotamente.");
    }
}