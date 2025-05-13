package org.example.Servicio;

import org.example.Repositorio.BaseDatos;

import java.util.Scanner;

//Servicio con la Logica del Negocio//
public class Logica {

    //Usar Registros de la Base de Datos//
    private static String[][] registros = BaseDatos.cargarAsientos();
    private static int nFilas = registros.length,nAsientos = registros[0].length;
    private static Scanner leer = new Scanner(System.in);

    /**
     * Mostrar Registros
     */
    public static void mostrarRegistros(){
        for(String[] array : registros){
            for(String aux : array){
                System.out.print(" ["+aux+"] ");
            }
            System.out.println("");
        }
    }

    /**
     * Reservar Asientos si el asiento es L
     * Al reservar cambiar el asiento a ocupado X
     * Verificar que exista el asiento y fila
     */
    public static boolean reservarAsientos(int nFila, int nAsiento) {

        if(nFila <= nFilas && nFila > 0){

            if(nAsiento <= nAsientos && nAsiento > 0){

                if(registros[nFila - 1][nAsiento - 1].equals("L")){

                    registros[nFila-1][nAsiento-1] = "X";
                    System.out.println("Reserva de Asiento Exitosa!!!\n");
                    return true;
                } else {
                    System.out.println("["+registros[nFila-1][nAsiento-1]+"] Asiento no disponible, escoge otro Asiento!!\n");
                }
            } else {
                System.out.println("Asiento Inexistente : "+nAsiento+"\n");
            }
        } else {
            System.out.println("Fila Inexistente  : "+nFila+"\n");
        }
        return false;
    }


}
