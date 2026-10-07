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
class Problema10 {

    public static void ejecutar(Scanner entrada) {

        //Se declaran los objetos nlos al inicio. Serviran para guardar una persona de cada tipo.
        Estudiante estudiante = null;
        Profesor profesor = null;
        Administrativo administrativo = null;

        int opcion = 0;

        //Bucle para mantener el menu activo hasta que se elija la opcion 5
        while (opcion != 5) {
            System.out.println("\n        UNIVERSIDAD XYZ ");
            System.out.println("1. Adicionar persona");
            System.out.println("2. Consultar persona");
            System.out.println("3. Modificar persona");
            System.out.println("4. Eliminar persona");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opcion: ");

            opcion = entrada.nextInt();
            entrada.nextLine(); //Limpia el buffer del teclado

            //Opcion 1 es Crear (Adicionar)
            if (opcion == 1) {
                System.out.println("\n1. Estudiante");
                System.out.println("2. Profesor");
                System.out.println("3. Administrativo");
                System.out.print("Seleccione el tipo: ");

                int tipo = entrada.nextInt();
                entrada.nextLine();

                if (tipo == 1) {
                    //Instanciamos el objeto y usamos los setters para gardar datos encapsulados
                    estudiante = new Estudiante();

                    System.out.print("Nombre: ");
                    estudiante.setNombre(entrada.nextLine());
                    System.out.print("Cedula: ");
                    estudiante.setCedula(entrada.nextLine());
                    System.out.print("Correo: ");
                    estudiante.setCorreo(entrada.nextLine());
                    System.out.print("Carrera: ");
                    estudiante.setCarrera(entrada.nextLine());
                    System.out.print("Semestre: ");
                    estudiante.setSemestre(entrada.nextInt());
                    entrada.nextLine();

                    System.out.println("Estudiante agregado correctamente.");

                //El miso proceso de captura con setters se repite para tipo == 2 y tipo == 3
                } else if (tipo == 2) {
                    profesor = new Profesor();
                    
                    //Llenado de datos con setters
                    System.out.print("Nombre: ");
                    profesor.setNombre(entrada.nextLine());
                    System.out.print("Cedula: ");
                    profesor.setCedula(entrada.nextLine());
                    System.out.print("Correo: ");
                    profesor.setCorreo(entrada.nextLine());
                    System.out.print("Departamento: ");
                    profesor.setDepartamento(entrada.nextLine());
                    System.out.print("Especialidad: ");
                    profesor.setEspecialidad(entrada.nextLine());
                    System.out.println("Profesor agregado correctamente.");

                } else if (tipo == 3) {
                    administrativo = new Administrativo();
                    
                    //Llenadode datos con setters
                    System.out.print("Nombre: ");
                    administrativo.setNombre(entrada.nextLine());
                    System.out.print("Cedula: ");
                    administrativo.setCedula(entrada.nextLine());
                    System.out.print("Correo: ");
                    administrativo.setCorreo(entrada.nextLine());
                    System.out.print("Cargo: ");
                    administrativo.setCargo(entrada.nextLine());
                    System.out.print("Departamento: ");
                    administrativo.setDepartamento(entrada.nextLine());
                    System.out.println("Administrativo agregado correctamente.");
                } else {
                    System.out.println("Tipo no valido.");
                }

            } else if (opcion == 2) {
                System.out.println("\n      ESTUDIANTE");

                if (estudiante != null) {
                    //Aplicacion del polimorfismo
                    //Se usa la variable generica ( persona) para apuntar al estudiante y java sabra automaticamente ejecutar el mostrarInformacion() propio del estudiante
                    Persona persona = estudiante;
                    persona.mostrarInformacion();
                } else {
                    System.out.println("No hay estudiante registrado.");
                }

                
                System.out.println("\n       PROFESOR");
                if (profesor != null) {
                    Persona persona = profesor;
                    persona.mostrarInformacion(); //Ejecuta la version del profesor
                } else {
                    System.out.println("No hay profesor registrado.");
                }

                
                System.out.println("\n       ADMINISTRATIVO");
                if (administrativo != null) {
                    Persona persona = administrativo;
                    persona.mostrarInformacion(); //Ejecuta la version del administrativo
                } else {
                    System.out.println("No hay administrativo registrado.");
                }

                //Aqui se actualiza o modifica
            } else if (opcion == 3) {
                System.out.println("\n1. Estudiante");
                System.out.println("2. Profesor");
                System.out.println("3. Administrativo");
                System.out.print("Seleccione el tipo: ");

                int tipo = entrada.nextInt();
                entrada.nextLine();

                //Verificamos que el objeto ya exista antes de intentar modificarlo
                if (tipo == 1 && estudiante != null) {
                    System.out.print("Nuevo nombre: ");
                    estudiante.setNombre(entrada.nextLine()); //Sobreescribimos el dato usando setter
                    System.out.print("Nuevo correo: ");
                    estudiante.setCorreo(entrada.nextLine());
                    System.out.print("Nueva carrera: ");
                    estudiante.setCarrera(entrada.nextLine());
                    System.out.print("Nuevo semestre: ");
                    estudiante.setSemestre(entrada.nextInt());
                    entrada.nextLine();
                    System.out.println("Estudiante modificado.");

                } else if (tipo == 2 && profesor != null) {
                    System.out.print("Nuevo nombre: ");
                    profesor.setNombre(entrada.nextLine());
                    System.out.print("Nuevo correo: ");
                    profesor.setCorreo(entrada.nextLine());
                    System.out.print("Nuevo departamento: ");
                    profesor.setDepartamento(entrada.nextLine());
                    System.out.print("Nueva especialidad: ");
                    profesor.setEspecialidad(entrada.nextLine());
                    System.out.println("Profesor modificado.");

                } else if (tipo == 3 && administrativo != null) {
                    System.out.print("Nuevo nombre: ");
                    administrativo.setNombre(entrada.nextLine());
                    System.out.print("Nuevo correo: ");
                    administrativo.setCorreo(entrada.nextLine());
                    System.out.print("Nuevo cargo: ");
                    administrativo.setCargo(entrada.nextLine());
                    System.out.print("Nuevo departamento: ");
                    administrativo.setDepartamento(entrada.nextLine());
                    System.out.println("Administrativo modificado.");
                } else {
                    System.out.println("No existe esa persona.");
                }

                //Aquie es la opcion para borrar o eliminar
            } else if (opcion == 4) {
                System.out.println("\n1. Estudiante");
                System.out.println("2. Profesor");
                System.out.println("3. Administrativo");
                System.out.print("Seleccione el tipo: ");
                int tipo = entrada.nextInt();
                entrada.nextLine();

                if (tipo == 1) {
                    //Al asignar null borramos la referencia, el objeto es borrado de la memoria
                    estudiante = null;
                    System.out.println("Estudiante eliminado.");
                } else if (tipo == 2) {
                    profesor = null;
                    System.out.println("Profesor eliminado.");
                } else if (tipo == 3) {
                    administrativo = null;
                    System.out.println("Administrativo eliminado.");
                } else {
                    System.out.println("Tipo no valido.");
                }
            
                //Opcion de salir
            } else if (opcion == 5) {
                System.out.println("Problema #10 finalizado.");
            } else {
                System.out.println("Opcion no valida.");
            }
        }
    }
}