/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Daniel
 */
class Estudiante extends Persona{ //Herencia usando extends Persona donde el estdudiante hereda nombre, cedula, y correo

    //Atribtos encapsulados exclusivos del estudiante
    private String carrera;
    private int semestre;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    //Polimorfismo dodne el estudiante cumple la regla de la clase padre y crea su propia forma de mostrar la informacion incluyendo sus datos especificos.
    public void mostrarInformacion() {
        System.out.println("Tipo: Estudiante");
        System.out.println("El nombre del estudiante es: " + getNombre()); //Usa metodos del padre
        System.out.println("La cedula del estudiante es:" + getCedula());
        System.out.println("El correo del estudiante es:" + getCorreo());
        System.out.println("Su carrera es de:" + carrera);
        System.out.println("El semestre que cursa es el: " + semestre);
    }
}