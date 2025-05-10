package org.example;

import org.example.Repositorios.BaseDatos;
import org.example.Servicios.Logica;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Atributos para entrada y seleccion
        Scanner leer = new Scanner(System.in);
        String opcion;
        Object[] destinos = {"Brazil","Cancun","Madrid","Roma","Milan","India"};
        Object[] numerosVuelo = {"Mañana","Tarde","Noche"};


        //Cargar los Registros solo 1 vez al iniciar el programa
        //Cargar Asientos en los Vuelos
        Logica.setRegistros(BaseDatos.cargarMatriz());


        /**
         * --La Aerolinea NO SABE la cantidad de reservas por dia
         * --Salir del menu si se introduce la palabra : finish
         */
        do {
            System.out.println("\n-------MENU-------");
            System.out.println("1. Mostrar todos los Asientos para los Vuelos");
            System.out.println("2. Reservar Asientos");
            System.out.println("Finish -> SALIR");
            System.out.println("------------------");
            System.out.print("opcion = ");
            opcion = leer.nextLine();

            switch (opcion.toLowerCase()){

                case "finish":
                    System.out.println("Saliendo...");
                    break;
                case "1":
                    Logica.getRegistros();
                    break;
                case "2":
                    int destino = JOptionPane.showOptionDialog(null,"Elige un Destino:","Destinos Disponibles:",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,destinos,destinos[0]);
                    int nAsientos = Integer.parseInt(JOptionPane.showInputDialog("Numero de Asientos que desea reservar"));
                    int numVuelo = JOptionPane.showOptionDialog(null,"Elige No. de Vuelo ","Vuelos Disponibles:",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,numerosVuelo,numerosVuelo[0]);
                    Logica.reservarAsientos(destino,nAsientos,numVuelo);
                    break;
                default:
                    System.out.println("Opcion Invalida!");
                    break;
            }

        } while (!opcion.equalsIgnoreCase("finish"));
    }
}