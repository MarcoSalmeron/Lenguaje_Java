package org.example.Repositorios;

import java.util.Scanner;

//Simular Base de Datos
public class BaseDatos {

    /**
     *
     * --Aerolinea con 6 destinos a los que realizan 3 vuelos diariamente
     * uno por la mañana, tarde y noche
     * --Cada fila es un destino, cada columuna guarda los asientos para el numero de vuelo
     *
     *              Mañana  Tarde  Noche
     *      Brazil    120    15     30
     *      Cancun    65     1      2
     *      Madrid    4      52     7
     *      Roma      46     32     16
     *      Milan     64     23     11
     *      India     61     12     91
     */

    private static final int destinos = 6;
    private static final int numVuelo = 3;
    private static Scanner leer = new Scanner(System.in);

    private static Integer[][] vuelos = new Integer[destinos][numVuelo];

    /**
     * Cargar Matriz (solo 1 vez al ejecutar codigo)
     */
    public static Integer[][] cargarMatriz(){

        System.out.println("\nCargando Matriz:\n");
        for(int i=0; i<destinos; i++){

            System.out.println("Destino No. "+(i+1)+"\n");
            for(int j=0; j<numVuelo; j++){

                System.out.print((j+1)+". Vuelo = ");
                vuelos[i][j] = leer.nextInt();
            }
        }
        return vuelos;
    }


}
