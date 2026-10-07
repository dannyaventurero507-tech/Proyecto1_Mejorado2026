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
class Problema5 {

    static void ejecutar(Scanner entrada) {

        Libro[] libros = new Libro[10];
        int cantidadLibros = 0;
        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n===== MENU BIBLIOTECA =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Prestar un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Consultar disponibilidad");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            // Validar opción del menú
            try {
                opcion = entrada.nextInt();
                entrada.nextLine();

                if (opcion < 1 || opcion > 5) {
                    System.out.println("ERROR: La opcion debe estar entre 1 y 5.");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("ERROR: Debe ingresar un numero entero.");
                entrada.nextLine();
                continue;
            }

            switch (opcion) {

                case 1:

                    if (cantidadLibros < libros.length) {

                        System.out.println("\n===== REGISTRAR LIBRO =====");

                        // Validar ISBN
                        String ISBN;

                        while (true) {
                            System.out.print("Ingrese el ISBN: ");
                            ISBN = entrada.nextLine().trim();

                            if (ISBN.isEmpty()) {
                                System.out.println("ERROR: El ISBN no puede estar vacio.");
                            } else {
                                break;
                            }
                        }

                        // Validar titulo
                        String titulo;

                        while (true) {
                            System.out.print("Ingrese el titulo: ");
                            titulo = entrada.nextLine().trim();

                            if (titulo.isEmpty()) {
                                System.out.println("ERROR: El titulo no puede estar vacio.");
                            } else if (!titulo.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9 .,:'!?-]+")) {
                                System.out.println("ERROR: El titulo contiene caracteres no permitidos.");
                            } else {
                                break;
                            }
                        }

                        // Validar autor
                        String autor;

                        while (true) {
                            System.out.print("Ingrese el autor: ");
                            autor = entrada.nextLine().trim();

                            if (autor.isEmpty()) {
                                System.out.println("ERROR: El autor no puede estar vacio.");
                            } else if (!autor.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                System.out.println("ERROR: El autor solo puede contener letras y espacios.");
                            } else {
                                break;
                            }
                        }

                        // Validar año de publicación
                        int añoPublicacion;

                        while (true) {
                            try {
                                System.out.print("Ingrese el año de publicacion: ");
                                añoPublicacion = entrada.nextInt();
                                entrada.nextLine();

                                if (añoPublicacion < 0) {
                                    System.out.println("ERROR: El año no puede ser negativo.");
                                } else {
                                    break;
                                }

                            } catch (Exception e) {
                                System.out.println("ERROR: Debe ingresar un año valido.");
                                entrada.nextLine();
                            }
                        }

                        // Crear el libro
                        libros[cantidadLibros] = new Libro(
                                ISBN,
                                titulo,
                                autor,
                                añoPublicacion
                        );

                        cantidadLibros++;

                        System.out.println("\nLibro registrado correctamente.");

                    } else {
                        System.out.println("No se pueden registrar mas libros.");
                    }

                    break;

                case 2:

                    if (cantidadLibros == 0) {
                        System.out.println("No hay libros registrados.");
                    } else {

                        System.out.println("\n===== LIBROS REGISTRADOS =====");

                        for (int i = 0; i < cantidadLibros; i++) {
                            System.out.println((i + 1) + ". " + libros[i].titulo);
                        }

                        int numeroLibro;

                        while (true) {
                            try {
                                System.out.print("Seleccione el libro que desea prestar: ");
                                numeroLibro = entrada.nextInt();
                                entrada.nextLine();

                                if (numeroLibro < 1 || numeroLibro > cantidadLibros) {
                                    System.out.println("ERROR: El numero de libro no existe.");
                                } else {
                                    break;
                                }

                            } catch (Exception e) {
                                System.out.println("ERROR: Debe ingresar un numero entero.");
                                entrada.nextLine();
                            }
                        }

                        libros[numeroLibro - 1].PrestarLibro();
                    }

                    break;

                case 3:

                    if (cantidadLibros == 0) {
                        System.out.println("No hay libros registrados.");
                    } else {

                        System.out.println("\n===== LIBROS REGISTRADOS =====");

                        for (int i = 0; i < cantidadLibros; i++) {
                            System.out.println((i + 1) + ". " + libros[i].titulo);
                        }

                        int numeroLibro;

                        while (true) {
                            try {
                                System.out.print("Seleccione el libro que desea devolver: ");
                                numeroLibro = entrada.nextInt();
                                entrada.nextLine();

                                if (numeroLibro < 1 || numeroLibro > cantidadLibros) {
                                    System.out.println("ERROR: El numero de libro no existe.");
                                } else {
                                    break;
                                }

                            } catch (Exception e) {
                                System.out.println("ERROR: Debe ingresar un numero entero.");
                                entrada.nextLine();
                            }
                        }

                        libros[numeroLibro - 1].DevolverLibro();
                    }

                    break;

                case 4:

                    if (cantidadLibros == 0) {
                        System.out.println("No hay libros registrados.");
                    } else {

                        System.out.println("\n===== LIBROS REGISTRADOS =====");

                        for (int i = 0; i < cantidadLibros; i++) {
                            System.out.println((i + 1) + ". " + libros[i].titulo);
                        }

                        int numeroLibro;

                        while (true) {
                            try {
                                System.out.print("Seleccione el libro que desea consultar: ");
                                numeroLibro = entrada.nextInt();
                                entrada.nextLine();

                                if (numeroLibro < 1 || numeroLibro > cantidadLibros) {
                                    System.out.println("ERROR: El numero de libro no existe.");
                                } else {
                                    break;
                                }

                            } catch (Exception e) {
                                System.out.println("ERROR: Debe ingresar un numero entero.");
                                entrada.nextLine();
                            }
                        }

                        libros[numeroLibro - 1].ConsultarDisponibilidad();
                    }

                    break;

                case 5:
                    System.out.println("Regresando al menu principal...");
                    break;
            }
        }
    }
}