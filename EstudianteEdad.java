/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Elizabeth
 */
class EstudianteEdad {

    String nombre, apellido, cedula, carrera; //Declaramos variables de tipo cadena
    LocalDate fechaNacimiento, fechaActual; //Utilizamos variable de clase de java para hacer uso de formato de fecha
    int edad; //Declaramos edad como entero

    public EstudianteEdad(Scanner Norag) {

        try { //bloque de manejo de excepciones con try-catch
            //solicitamos los datos de entrada
            
            System.out.println(); //Salto de linea
            System.out.println("       PROBLEMA N#1");
            System.out.println("Ingrese el nombre del estudiante: "); 
            nombre = Norag.nextLine();
            System.out.println("Ingrese el apellido del estudiante: ");
            apellido = Norag.nextLine();
            System.out.println("Ingrese la cedula del estudiante: ");
            cedula = Norag.nextLine();
            System.out.println("Ingresa la Carrera: ");
            carrera = Norag.nextLine();
            System.out.println("Ingrese la fecha de nacimiento AAAA-MM-DD: ");
            fechaNacimiento = LocalDate.parse(Norag.nextLine()); //utilizamos el formato para almacenar fecha

            fechaActual = LocalDate.now(); //permite acceder a la fecha actual

            edad = Period.between(fechaNacimiento, fechaActual).getYears(); //operacion que determina la edad

            //Impresion
            System.out.println();//Salto de linea
            System.out.println("    DATOS DEL ESTUDIANTE");
            System.out.println("El nombre del estudiante: " + nombre);
            System.out.println("El apellido del estudnate es: " + apellido);
            System.out.println("La cedula del estudjante es: " + cedula);
            System.out.println("Su carrera es: " + carrera);

            if (edad >= 18) {
                System.out.println("El estudiante: " + nombre + " es mayor de edad");
            } else {
                System.out.println("El estudiante: " + nombre + " no es mayor de edad");
            }

        } catch (Exception e) {
            System.out.println("ERROR: Ingresa datos validos.");
        }
    }
}