package org.example;

import org.example.Servicio.Logica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         *
         * Reserva de Asientos para un Teatro
         * El teatro cuenta con 10 filas y 10 asientos cada fila
         *
         * 1-Cargar los asientos con X si estan ocupados y L si estan libres (todos deben ir libres al inicio)
         * 2-Reservar solo si el asiento esta en L, si no se debera escoger otro asiento
         * 3-Finalizar Programa solo al introducir un valor especifico
         * 4-No se puede sobrevender mas de las 10 filas con 10 asientos cada una
         */
        Scanner leer = new Scanner(System.in);
        int opcion;


        do {
            boolean bandera = false;
            System.out.println("-----MENU-----");
            System.out.println("1- Mostrar Asientos");
            System.out.println("2- Reservar Asiento");
            System.out.println("0 -> SALIR ");
            System.out.println("--------------");
            System.out.print("elegir opcion = ");
            opcion = leer.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    Logica.mostrarRegistros();
                    break;
                case 2:
                    while (!bandera){
                        //pedir fila y asiento
                        System.out.println("Contamos con 10 Filas de Asientos\n(10 Asientos cada una)\n");
                        System.out.print("--Fila en la que desea reservar: ");
                        int nFila = leer.nextInt();
                        System.out.print("--No. de Asiento: ");
                        int nAsiento = leer.nextInt();
                        //si es realizado preguntar si quiere continuar
                        if(Logica.reservarAsientos(nFila,nAsiento)){
                            System.out.println("Deseas reservar mas asientos?\n1- Continuar\n2- Salir");
                            opcion = leer.nextInt();
                            if(opcion != 2){
                                System.out.println("\nContinuando...");
                            } else {
                                bandera = true;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("\nOpc no Valida...");
                    break;
            }
        } while (opcion != 0);
    }
}