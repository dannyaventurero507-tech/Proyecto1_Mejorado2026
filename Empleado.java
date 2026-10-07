/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

import java.util.Scanner;

/**
 *
 * @author Elizabeth
 */
class Empleado {

    String nombre, cedula;
    double salarioMensual, bonoMensual, salarioAnual;

    public Empleado(Scanner entrada) {
        //Validar nombre
        while(true){
            System.out.println("Ingrese el nombre del empleado:");
            nombre = entrada.nextLine();
            if(nombre.matches("[a-zA-Z ]+")){
                break;
            }else{
                System.out.println("El nombre solo puede contener letras y espacio");
            }
        }
        
        System.out.println("Ingrese la cedula del empleado:");
        cedula = entrada.nextLine();
        //Validar salario mensual
        while(true){
            try{
                System.out.println("Ingrese el salario mensual:");
                salarioMensual = entrada.nextDouble();
                if(salarioMensual < 0){
                    System.out.println("El salario mensual no puede ser menor a 0");
                }else{
                    break;
                }
            }catch(Exception e){
                System.out.println("INGRESE DATOS VALIDOS");
                entrada.nextLine();
            }
        }

        //validar mono mensual
        while(true){
            try {
                System.out.println("Ingrese el bono mensual:");
                bonoMensual = entrada.nextDouble();
                if(bonoMensual < 0){
                    System.out.println("El bono mensual no puede ser negativo");
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("INGRESE DATOS VÁLIDOS");
            }
        }

        entrada.nextLine();

        salarioAnual = (salarioMensual * 12) + (bonoMensual * 12);

        System.out.println("\n         DATOS DEL EMPLEADO      ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Salario mensual: $" + salarioMensual);
        System.out.println("Bono mensual: $" + bonoMensual);
        System.out.println("Salario anual incluyendo bono: $" + salarioAnual);
    }
}