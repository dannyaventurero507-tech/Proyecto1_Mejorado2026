/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1_2026;

import java.util.Scanner;

/**
 *
 * @author Elizabeth, Daniel
 */
public class Proyecto1_2026 {

    public static void main(String[] args) {
        
        //Creamos el objeto Scanner para leer lo que el usuario va a escribir por teclado.
        Scanner entrada = new Scanner(System.in);
        
        //Variable que va a guardar el numero que el usuario va a ingresar.
        int opcion = 0;

        //Comentario para mostar como subtitulo o presentacion del proyecto.
        System.out.println("     DESARROLLO DE SOFTWARE II");
        System.out.println("          PROYECTO N#1");
        
        //Tenemos el bucle  donde se va a repetir el menu mientras que la opcion sea diferente de 11
        while (opcion != 11) {
            //Ipresion en pantalla del menu  con las 11 opciones
            System.out.println("\n        MENU PRINCIPAL       ");
            System.out.println("   1. Problema #1");
            System.out.println("   2. Problema #2");
            System.out.println("   3. Problema #3");
            System.out.println("   4. Problema #4");
            System.out.println("   5. Problema #5");
            System.out.println("   6. Problema #6");
            System.out.println("   7. Problema #7");
            System.out.println("   8. Problema #8");
            System.out.println("   9. Problema #9");
            System.out.println("   10. Problema #10");
            System.out.println("   11. Salir");
            System.out.print("   Seleccione una opcion: ");

            //Aqui es una pregunta previa: Lo que escribio el ususario es un numero entero?
            //Si el usuario escribio un numero entra al if y si es ingresa letras, simbolos entra al else.
            if (entrada.hasNextInt()){
                //Leemos y guardamos el numero entero en la variable opcion
                opcion = entrada.nextInt();
                //Limpiamos la memoria del scanner (El salto de linea, enter)
                entrada.nextLine();
                
                //Aqui valida numeros negativos, si el numero es menor que 1 o mayor que 11.
                if (opcion < 1 || opcion > 11 ){
                    System.out.println("ERROR: La opcion que ingreso no existe. Debe ser un numero entre el 1 al 11 positivo, intentelo de nuevo.");
                    continue; //Regresa al inicio del bucle (while) para volver a pedir el dato.
                }
           
            //Aqui compara el numero guardado si coincide y ejecuta el problema correspondiente.
            switch (opcion) {

                case 1:
                    Problema1.ejecutar(entrada);
                    break;

                case 2:
                    Problema2.ejecutar(entrada);
                    break;

                case 3:
                    Problema3.ejecutar(entrada);
                    break;

                case 4:
                    Problema4.ejecutar(entrada);
                    break;

                case 5:
                    Problema5.ejecutar(entrada);
                    break;

                case 6:
                    Problema6.ejecutar();
                    break;

                case 7:
                    Problema7.ejecutar();
                    break;

                case 8:
                    Problema8.ejecutar();
                    break;

                case 9:
                    Problema9.ejecutar(entrada);
                    break;

                case 10:
                    Problema10.ejecutar(entrada);
                    break;

                case 11:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    
            }//fin del switch
            
            } else { //Si el usuario ingresa letras o simbolos, es porque no era un numero entero.
                System.out.println("ERROR: la opcion es no valida, no se permiten letras, ni caracteres ni simbolos, solo numeros. Vuelva a intentarlo.");
                entrada.nextLine(); //Borramos el texto incorrecto que quedo en la memoria para evitar bucle infinito.
            }//fin del if else.
                    
        }//fin del while
        
        //Cerramos el sacnner al salir del ciclo para liberar recursos.
        entrada.close();
    }
}