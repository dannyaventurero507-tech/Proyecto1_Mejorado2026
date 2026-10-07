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
class Problema9 {

    public static void ejecutar(Scanner entrada) {

        // Creamos el pedido que funcionara como carrito de compras
        Pedido pedido = new Pedido();

        // Creamos los productos disponibles en la tienda
        ProductoPedido[] productosDisponibles = new ProductoPedido[5];

        productosDisponibles[0] = new ProductoPedido("P001", "Teclado", 25.00, 0);
        productosDisponibles[1] = new ProductoPedido("P002", "Mouse", 15.00, 0);
        productosDisponibles[2] = new ProductoPedido("P003", "Audifonos", 30.00, 0);
        productosDisponibles[3] = new ProductoPedido("P004", "Monitor", 120.00, 0);
        productosDisponibles[4] = new ProductoPedido("P005", "Webcam", 40.00, 0);

        int opcion;
        boolean seguirComprando = true;

        while (seguirComprando) {

            System.out.println("\n       PRODUCTOS DISPONIBLES");

            for (int i = 0; i < productosDisponibles.length; i++) {
                System.out.println((i + 1) + ". "
                        + productosDisponibles[i].codigo + " - "
                        + productosDisponibles[i].nombre
                        + " - $" + productosDisponibles[i].precio);
            }

            // Seleccionar producto
            int numeroProducto;

            while (true) {
                try {
                    System.out.print("\nSeleccione el producto: ");
                    numeroProducto = entrada.nextInt();
                    entrada.nextLine();

                    if (numeroProducto < 1 || numeroProducto > productosDisponibles.length) {
                        System.out.println("ERROR: El producto seleccionado no existe.");
                    } else {
                        break;
                    }

                } catch (Exception e) {
                    System.out.println("ERROR: Debe ingresar un numero entero.");
                    entrada.nextLine();
                }
            }

            // Seleccionamos el producto
            ProductoPedido productoSeleccionado =
                    productosDisponibles[numeroProducto - 1];

            // Pedir cantidad
            int cantidad;

            while (true) {
                try {
                    System.out.print("Ingrese la cantidad: ");
                    cantidad = entrada.nextInt();
                    entrada.nextLine();

                    if (cantidad <= 0) {
                        System.out.println("ERROR: La cantidad debe ser mayor que cero.");
                    } else {
                        break;
                    }

                } catch (Exception e) {
                    System.out.println("ERROR: Debe ingresar un numero entero.");
                    entrada.nextLine();
                }
            }

            // Creamos una copia del producto con la cantidad comprada
            ProductoPedido productoCompra = new ProductoPedido(
                    productoSeleccionado.codigo,
                    productoSeleccionado.nombre,
                    productoSeleccionado.precio,
                    cantidad
            );

            // Agregamos el producto al pedido
            pedido.agregarProducto(productoCompra);

            // Preguntar si desea seguir comprando
            int continuar;

            while (true) {
                try {
                    System.out.println("\n¿Desea seguir agregando productos?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    System.out.print("Seleccione una opcion: ");

                    continuar = entrada.nextInt();
                    entrada.nextLine();

                    if (continuar == 1 || continuar == 2) {
                        break;
                    } else {
                        System.out.println("ERROR: Seleccione 1 para Si o 2 para No.");
                    }

                } catch (Exception e) {
                    System.out.println("ERROR: Debe ingresar 1 o 2.");
                    entrada.nextLine();
                }
            }

            if (continuar == 2) {
                seguirComprando = false;
            }
        }

        // Mostrar resumen final de la compra
        System.out.println("\n===== RESUMEN DEL PEDIDO =====");

        pedido.mostrarProductos();

        System.out.println("Subtotal: $" + pedido.calcularSubtotal());
        System.out.println("Impuesto 7%: $" + pedido.calcularImpuesto());
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
    }
}