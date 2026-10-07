/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Daniel
 */
class Automovil {

    String Marca;
    String Modelo;
    int Año;

    //Aqui tenemos el constructor automovil y las variables inicializadas
    Automovil(String Marca, String Modelo, int Año) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
    }

    //Metodo para mstrar el tipo de automovil
    public void MostrarTipo() {
        System.out.println("Es un automovil y se desplaza por la carretera.");
    }
}