package org.example.Repositorio;

//Simular Base de Datos//
public class BaseDatos {

    /**
     * Asientos del Teatro:
     * 10 Filas con 10 asientos cada una
     */
    private static String[][] matriz = new String[10][10];


    /**
     * Cargar Asientos, todos deben ir Libres al Inicio
     */
    public static String[][] cargarAsientos(){
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[0].length; j++){
                matriz[i][j] = "L";
            }
        }
        return matriz;
    }
}
