package org.example;

import org.example.Servicios.Logica;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         *
         *
         * Sistema de Tickets
         */

        Scanner leer = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n-------MENU-------");
            System.out.println("1- Mostrar Tickets");
            System.out.println("2- Guardar Ticket");
            System.out.println("3- Sumar Precio de Tickets");
            System.out.println("4- Buscar Ticket por Fila");
            System.out.println("0 -> SALIR");
            System.out.println("------------------");
            System.out.print("elegir opcion: ");
            opcion = leer.nextInt();

            switch (opcion){

                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    Logica.all();
                    break;
                case 2:
                    Logica.saveTicket();
                    break;
                case 3:
                    Logica.sumPrecio();
                    break;
                case 4:
                    int nFila = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Fila a Buscar"));
                    if(!Logica.findByRow(nFila)){
                        System.out.println("\nNo se encuentra la fila seleccionada...");
                    }
                    break;
                default:
                    System.out.println("Opcion Invalida!!!");
                    break;
            }
        } while (opcion != 0);
    }
}