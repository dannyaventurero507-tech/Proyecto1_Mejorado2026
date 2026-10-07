/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

import java.util.Scanner;

/**
 *
 * @author LATITUDE3190
 */
class Libro {
 
    String ISBN;
    String titulo;
    String autor;
    int añoPublicacion;
    boolean disponible;

    public Libro(String ISBN, String titulo, String autor, int añoPublicacion) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true;
    }

    public void PrestarLibro() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado correctamente.");
        } else {
            System.out.println("El libro no esta disponible.");
        }
    }

    public void DevolverLibro() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro ha sido devuelto correctamente.");
        } else {
            System.out.println("El libro ya esta disponible.");
        }
    }

    public void ConsultarDisponibilidad() {
        if (disponible) {
            System.out.println("El libro esta disponible.");
        } else {
            System.out.println("El libro no esta disponible.");
        }
    }
}