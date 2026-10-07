/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.proyecto1_2026;


import com.sun.nio.file.SensitivityWatchEventModifier;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
class Problema2 {

    public static void ejecutar(Scanner entrada) {
        
        //Creamos la clase CuentaBancaria y almacena los datos.
        System.out.println();
        System.out.println("           PROBLEMA N#2");
        System.out.println("         CUENTA BANCARIA");
        
        System.out.println("Ingrese el numero de cuenta: ");
        String NumeroDeCuenta = entrada.nextLine();
        System.out.println("Ingrese el titular de la cuenta: ");
        String TitularDeCuenta = entrada.nextLine();
        System.out.println("Ingrese el saldo incial que ya tiene en su cuenta: ");
        double saldo = entrada.nextDouble();
        
        //Creamos la clase CuentaBancaria y con los datos
        CuentaBancaria cuenta = new CuentaBancaria(NumeroDeCuenta, TitularDeCuenta, saldo);
        
        System.out.println();
        System.out.println("  ESTA ES LA INFORMACION DE SU CUENTA REGISTRADA");
        System.out.println("El numero de cuenta ingresado es: " + cuenta.getNumeroDeCuenta());
        System.out.println("El titular de esta cuenta es: " + cuenta.getTitularDeCuenta());
        
        //Metodo para consultar el saldo
        cuenta.ConsultarSaldo();

        System.out.println();
        System.out.println("     REGISTRE SUS DEPOSITOS Y RETIROS.");
        System.out.println("Ingrese la cantidad de dinero a depositar: ");
        double deposito = entrada.nextDouble();
        
        //Metodo para depositar
        cuenta.depositar(deposito);
        //Y consultamos saldos nuevamente el nuevo saldo depsoitado
        cuenta.ConsultarSaldo();

        System.out.println("Ingrese la cantidad a retirar: ");
        double retiro = entrada.nextDouble();

        //Metodo para retirar
        cuenta.retirar(retiro);

        //Y nuevamente consultamos el saldo restante
        cuenta.ConsultarSaldo();

        entrada.nextLine();
    }  
}