/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
class Problema4 {

    public static void ejecutar(Scanner entrada) {
        
        //Creamos las clases automovil, motocicleta, camion
        //Automovil auto = new Automovil("Toyota", "Corolla", 2026);
        //Motocicleta moto = new Motocicleta("BMW", "X7", 2025);
        //Camion camion = new Camion("Volvo", "HP", 2023);

        //Aqui vamos a mostrar los datos decada tipo
        //System.out.println("     AUTOMOVIL");
        //System.out.println("Ingresa la Marca: " + auto.Marca);
        //System.out.println("Ingrese el Modelo: " + auto.Modelo);
        //System.out.println("Ingrese el Año: " + auto.Año);
        //auto.MostrarTipo();

        //System.out.println(); //Salto de linea
        
        //Aqui vamos a mostrar los datos decada tipo
        //System.out.println("    MOTOCICLETA");
        //System.out.println("Ingresa la Marca: " + moto.Marca);
        //System.out.println("Ingrese el Modelo: " + moto.Modelo);
        //System.out.println("Ingrese el Año: " + moto.Año);
        //moto.MostrarTipo();

        //System.out.println(); //Salto de linea
        
        //Aqui vamos a mostrar los datos decada tipo
        //System.out.println("       CAMION");
        //System.out.println("Ingresa la Marca: " + camion.Marca);
        //System.out.println("Ingrese el Modelo: " + camion.Modelo);
        //System.out.println("Ingrese el Año: " + camion.Año);
        //camion.MostrarTipo();
        //System.out.println(); //Salto de linea
   
        
        //Datos del automovil
        System.out.println("     AUTOMOVIL");
        //Pedimos al usuario que ingrese la marca, modelo y el anio y guardamos el dato en una variable.
        System.out.print("Ingrese la Marca: ");
        String marcaAuto = entrada.nextLine();
        System.out.print("Ingrese el Modelo: ");
        String modeloAuto = entrada.nextLine();
        System.out.print("Ingrese el Año: ");
        int añoAuto = entrada.nextInt();
        entrada.nextLine(); //limpiamos el salto de lienea que queda pendiente en el scanner 
        
         //Creamos el objeto Automovil utilizando los datos ingresados por el usuario.
        Automovil auto = new Automovil(marcaAuto, modeloAuto, añoAuto);

        System.out.println();
        System.out.println("La Marca es: " + auto.Marca);
        System.out.println("El Modelo: " + auto.Modelo);
        System.out.println("El Año es: " + auto.Año);
        
        //Llamamos al metodo que muestra el tipo de vehiculo.
        auto.MostrarTipo();

        System.out.println();

        // Datos de la motocicleta
        System.out.println("    MOTOCICLETA");
        System.out.print("Ingrese la Marca: ");
        String marcaMoto = entrada.nextLine();
        System.out.print("Ingrese el Modelo: ");
        String modeloMoto = entrada.nextLine();
        System.out.print("Ingrese el Año: ");
        int añoMoto = entrada.nextInt();
        entrada.nextLine();

        //Creamos el objeto Motocicleta utilizando los datos ingresados.
        Motocicleta moto = new Motocicleta(marcaMoto, modeloMoto, añoMoto);

        System.out.println();
        System.out.println("La Marca es: " + moto.Marca);
        System.out.println("El Modelo es: " + moto.Modelo);
        System.out.println("El Año es: " + moto.Año);
        
        //Llamamos al metodo que muestra el tipo de vehiculo y donde se desplaza.
        moto.MostrarTipo();

        System.out.println();

        // Datos del camion
        System.out.println("       CAMION");
        System.out.print("Ingrese la Marca: ");
        String marcaCamion = entrada.nextLine();
        System.out.print("Ingrese el Modelo: ");
        String modeloCamion = entrada.nextLine();
        System.out.print("Ingrese el Año: ");
        int añoCamion = entrada.nextInt();
        entrada.nextLine();

        //Creamos el objeto Camion utilizando los datos ingresados.
        Camion camion = new Camion(marcaCamion, modeloCamion, añoCamion);

        System.out.println();
        System.out.println("La Marca es: " + camion.Marca);
        System.out.println("El Modelo: " + camion.Modelo);
        System.out.println("El Año es: " + camion.Año);
        
        //Llamamos al metodo camion que muestra el tipo de vehiculo y su funcion.
        camion.MostrarTipo();

        System.out.println();
        
        
        
        
        
    }

}