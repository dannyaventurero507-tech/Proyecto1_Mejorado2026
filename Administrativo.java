/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Daniel
 */
class Administrativo extends Persona{ //Herencia

    private String cargo;
    private String departamento;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Polimorfismo dodne el administrativo muestra la informacion a su manera
    public void mostrarInformacion() {
        System.out.println("Tipo: Administrativo");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Cargo: " + cargo);
        System.out.println("Departamento: " + departamento);
    }
}