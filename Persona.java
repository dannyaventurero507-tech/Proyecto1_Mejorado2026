/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

/**
 *
 * @author Daniel
 */
abstract class Persona { //Clase abstracta al usar abstract evitamos que se pueda hacer new persona(), es solo un molde para que otras clases hereden de ella.

    //Encapsulamiento se usa private para proteger los datos, solo se pueden modificar o leer a traves de los emtodos get y set.
    private String nombre;
    private String cedula;
    private String correo;

    //Metodos publicos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Metodo abstarcto es donde obliga a cualquier clase que herede de  persona al crear su propia version de este metodo. No tiene cuerpo (n hay llaves {})
    public abstract void mostrarInformacion();
}