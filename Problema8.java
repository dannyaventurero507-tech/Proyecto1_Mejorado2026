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
class Problema8 {

    public static void ejecutar() {
        
        //Creamos el objeto Scanner para leer los datos ingresados por el usuario. 
        Scanner entrada = new Scanner(System.in); //Pedimos los datos del desarrollador 
        
        System.out.println("     DATOS DEL DESARROLLADOR"); 
        System.out.print("Ingrese el nombre: "); 
        String nombreDesarrollador = entrada.nextLine(); 
        System.out.print("Ingrese el salario: "); 
        
        double salarioDesarrollador = entrada.nextDouble(); 
        entrada.nextLine(); //Limpiamos el Enter //Pedimos los datos del contador 
        
        System.out.println("\n DATOS DEL CONTADOR"); 
        System.out.print("Ingrese el nombre: "); 
        String nombreContador = entrada.nextLine(); 
        System.out.print("Ingrese el salario: "); 
        double salarioContador = entrada.nextDouble(); 

        //Creamos un objeto de tipo desarrollador con los datos ingresados 
        Desarrollador desarrollador = new Desarrollador( nombreDesarrollador, salarioDesarrollador ); 
        //Creamos un objeto de tipo contador con los datos ingresados 
        Contador contador = new Contador( nombreContador, salarioContador ); 
        
        System.out.println("\n DESARROLLADOR");
        desarrollador.MostrarDatos(); //Llamamos al metodo exclusivo del desarrollador 
        desarrollador.TrabajarRemotamente(); //Llamamos al metodo trabajar remotamente
        
        System.out.println(); 
        
        System.out.println(" CONTADOR"); //Llamamos al metodo para imprimir los datos del contador 
        contador.MostrarDatos(); //Llamamos al metodo mostrardatos del contador.
  
    }

}