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
class Problema7 {

    public static void ejecutar() {
       
        Scanner entrada = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 6) {

            System.out.println("\n          CALCULO DE AREAS");
            System.out.println("1. Circulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Cuadrado");
            System.out.println("5. Paralelogramo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            // Validamos la opcion del menu
            try {
                opcion = entrada.nextInt();
                entrada.nextLine();

                if (opcion < 1 || opcion > 6) {
                    System.out.println("ERROR: La opcion debe estar entre 1 y 6.");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("ERROR: Debe ingresar un numero entero.");
                entrada.nextLine();
                continue;
            }

            switch (opcion) {

                case 1:
                    // CIRCULO
                    double radio;

                    while (true) {
                        try {
                            System.out.print("Ingrese el radio del circulo: ");
                            radio = entrada.nextDouble();
                            entrada.nextLine();

                            if (radio <= 0) {
                                System.out.println("ERROR: El radio debe ser mayor que cero.");
                            } else {
                                break;
                            }

                        } catch (Exception e) {
                            System.out.println("ERROR: Debe ingresar un numero.");
                            entrada.nextLine();
                        }
                    }

                    Circulo circulo = new Circulo(radio);

                    System.out.println("Area del circulo: " + circulo.calcularArea());
                    break;

                case 2:
                    // RECTANGULO
                    double baseRectangulo;
                    double alturaRectangulo;

                    while (true) {
                        try {
                            System.out.print("Ingrese la base del rectangulo: ");
                            baseRectangulo = entrada.nextDouble();

                            System.out.print("Ingrese la altura del rectangulo: ");
                            alturaRectangulo = entrada.nextDouble();
                            entrada.nextLine();

                            if (baseRectangulo <= 0 || alturaRectangulo <= 0) {
                                System.out.println("ERROR: Las medidas deben ser mayores que cero.");
                            } else {
                                break;
                            }

                        } catch (Exception e) {
                            System.out.println("ERROR: Debe ingresar numeros.");
                            entrada.nextLine();
                        }
                    }

                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);

                    System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
                    break;

                case 3:
                    // TRIANGULO
                    double baseTriangulo;
                    double alturaTriangulo;

                    while (true) {
                        try {
                            System.out.print("Ingrese la base del triangulo: ");
                            baseTriangulo = entrada.nextDouble();

                            System.out.print("Ingrese la altura del triangulo: ");
                            alturaTriangulo = entrada.nextDouble();
                            entrada.nextLine();

                            if (baseTriangulo <= 0 || alturaTriangulo <= 0) {
                                System.out.println("ERROR: Las medidas deben ser mayores que cero.");
                            } else {
                                break;
                            }

                        } catch (Exception e) {
                            System.out.println("ERROR: Debe ingresar numeros.");
                            entrada.nextLine();
                        }
                    }

                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);

                    System.out.println("Area del triangulo: " + triangulo.calcularArea());
                    break;

                case 4:
                    // CUADRADO
                    double ladoCuadrado;

                    while (true) {
                        try {
                            System.out.print("Ingrese el lado del cuadrado: ");
                            ladoCuadrado = entrada.nextDouble();
                            entrada.nextLine();

                            if (ladoCuadrado <= 0) {
                                System.out.println("ERROR: El lado debe ser mayor que cero.");
                            } else {
                                break;
                            }

                        } catch (Exception e) {
                            System.out.println("ERROR: Debe ingresar un numero.");
                            entrada.nextLine();
                        }
                    }

                    Cuadrado cuadrado = new Cuadrado(ladoCuadrado);

                    System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
                    break;

                case 5:
                    // PARALELOGRAMO
                    double baseParalelogramo;
                    double alturaParalelogramo;

                    while (true) {
                        try {
                            System.out.print("Ingrese la base del paralelogramo: ");
                            baseParalelogramo = entrada.nextDouble();

                            System.out.print("Ingrese la altura del paralelogramo: ");
                            alturaParalelogramo = entrada.nextDouble();
                            entrada.nextLine();

                            if (baseParalelogramo <= 0 || alturaParalelogramo <= 0) {
                                System.out.println("ERROR: Las medidas deben ser mayores que cero.");
                            } else {
                                break;
                            }

                        } catch (Exception e) {
                            System.out.println("ERROR: Debe ingresar numeros.");
                            entrada.nextLine();
                        }
                    }

                    Paralelogramo paralelogramo =
                            new Paralelogramo(baseParalelogramo, alturaParalelogramo);

                    System.out.println("Area del paralelogramo: "
                            + paralelogramo.calcularArea());
                    break;

                case 6:
                    System.out.println("Regresando al menu principal...");
                    break;
            }
        }
    }
}