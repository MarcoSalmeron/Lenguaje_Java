package org.example;

import org.example.Servicio.Logica;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * variables para entrada
         */
        Scanner leer = new Scanner(System.in);
        int opcion;


        /**
         * Repetir Menu hasta que
         * el Usuario quiera salir
         *
         */
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Mostrar Registros");
            System.out.println("2. Ordenar por Precio");
            System.out.println("3. Ordenar por Marca y Precio");
            System.out.println("4. Mostrar Autos por debajo de $23k");
            System.out.println("5. Mostrar solo Chevrolet y Volkswagen");
            System.out.println("6. Mostrar Modelos que contengan una letra A");
            System.out.println("7. Buscar por ID");
            System.out.println("8. Guardar Nuevo Auto");
            System.out.println("0 -> SALIR");
            System.out.print("Elige opcion = ");
            opcion = leer.nextInt();

            switch (opcion) {

                /**
                 * Servicios a Usar
                 */
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    Logica.all();
                    break;
                case 2:
                    Logica.sortByPrice();
                    break;
                case 3:
                    Logica.sortedByNameAndPrice();
                    break;
                case 4:
                    Logica.findLowerPrices();
                    break;
                case 5:
                    Logica.findNames();
                    break;
                case 6:
                    Logica.findByLetterA();
                    break;
                case 7:
                    try {
                        String id = JOptionPane.showInputDialog("ID a Buscar");
                        System.out.println(Logica.findById(id));
                    } catch (NullPointerException e) {
                        System.out.println("Error:" + e.getMessage());
                    } finally {
                        break;
                    }
                case 8:
                    Logica.saveAuto();
                    break;
                default:
                    System.out.println("Opc no valida...");
                    break;
            }
        } while (opcion != 0);

    }
}