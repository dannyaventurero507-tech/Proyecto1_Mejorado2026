/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Daniel
 */
class Profesor extends Persona{ //Herencia

    private String departamento;
    private String especialidad;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Polimorfismo, el prfesor muestra la informacion a su manera
    public void mostrarInformacion() {

        System.out.println("Tipo: Profesor");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Departamento: " + departamento);
        System.out.println("Especialidad: " + especialidad);
    }

}