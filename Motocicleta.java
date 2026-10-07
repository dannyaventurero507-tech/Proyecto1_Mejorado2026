/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Daniel
 */
class Motocicleta {

    String Marca;
    String Modelo;
    int Año;
    
     //Aqui tenemos el constructor motocicleta y las variables inicializadas
    Motocicleta(String Marca, String Modelo, int año) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = año;
    }
    
    //Metodo para mostrar el tipo de motocicleta
    public void MostrarTipo() {
        System.out.println("Es una motocicleta y se desplaza por la carretera.");
    }
}