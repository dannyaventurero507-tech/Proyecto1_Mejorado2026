/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;

import java.util.Scanner;

/**
 *
 * @author Daniel Fuentes
 */
class CuentaBancaria extends Cuenta {
    
    //Encapsulamiento: las variables son privadas.
    private String NumeroDeCuenta;
    private String TitularDeCuenta;
    private double saldo;
  
     //Constructor de la clase Cuenta
    CuentaBancaria(String NumeroDeCuenta, String TitularDeCuenta, double saldo) {
        this.NumeroDeCuenta = NumeroDeCuenta;
        this.TitularDeCuenta = TitularDeCuenta;
        this.saldo = saldo;
    }

    //Getter para obtener el NumeroDeCuenta
    public String getNumeroDeCuenta() {
        return NumeroDeCuenta;
    }

    //Getter para obtener el TitularDeCuenta
    public String getTitularDeCuenta() {
        return TitularDeCuenta;
    }

    //Getter para obtener el saldo
    public double getSaldo() {
        return saldo;
    }

    //Metodo para depositar dinero
    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
        System.out.println("Su Deposito se ha realizado correctamente.");
    }

    //Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            System.out.println("Su retiro se ha realizado correctamente");
        } else {
            System.out.println("No puede realizar un retiro superior a la cantidad establecida.");
        }
    }

    //Metodo para consultar el saldo
    public void ConsultarSaldo() {
        System.out.println("Su saldo que tiene disponible es de: $" + saldo);
    }
}
