package org.example.Servicios;

import org.example.Repositorios.BaseDatos;

//Servicio con la Logica del Negocio
public class Logica {

    //usar registros en Base de Datos
    private static Integer[][] registros = new Integer[6][3];
    private static int nFilas = registros.length;
    private static int nCol = registros[0].length;

    /**
     *
     * --usuario debe escoger destino, numero de asientos
     * y numero del vuelo (mañana, tarde o noche)
     *
     * --Verificar que el destino, num de vuelo y total de asientos de la Matriz
     * esten dentro del rango introducido por el usuario
     */
    public static void reservarAsientos(int destino, int nAsientos, int numVuelo){

        if(destino < nFilas && destino >= 0 ){ // <- Destinos menores a 6 y mayores a 0

            if(numVuelo < nCol && numVuelo >= 0){ // <- Vuelos menores a 3 y mayores a 0

                if(nAsientos <= registros[destino][numVuelo] ){ // <- Asientos menor o igual al valor dentro de matriz

                    registros[destino][numVuelo] -= nAsientos;
                    System.out.println("Reserva de Asientos Exitosa!");
                } else {
                    System.out.println("Falta de Disponibilidad solo hay ["+registros[destino][numVuelo]+"] asientos, no hay : "+nAsientos+". asientos");
                }
            } else {
                System.out.println("Solo hay 3 Numeros de Vuelos, no existe ["+numVuelo+"]");
            }
        } else {
            System.out.println("Solo hay 6 Destinos, no existe ["+destino+"]");
        }
    }

    /**
     *
     * Mostrar Registros en B.D
     */
    public static void getRegistros(){
        System.out.println("\nMostrando Asientos de los Vuelos:\n");
        for(Integer[] array : registros){
            for(Integer aux : array){
                System.out.print(" ["+aux+"] ");
            }
            System.out.println("");
        }
    }

    /**
     * Usar los Registros de la Base de Datos
     */
    public static void setRegistros(Integer[] ... matriz){
        registros = matriz;
    }

}
