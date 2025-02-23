
package org.Patrones.Ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Seleccion {
    //crear array//
    int array[],aux,posiciones,i,j,min;
    Scanner leer = new Scanner(System.in);
    public void SELECCION(){
    posiciones = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la cantidad de Elementos de la Lista"));
    array = new int[posiciones];
    
    
    for(i=0;i<posiciones;i++){
        System.out.print((i+1)+". Digite un Valor: ");
        array[i] = leer.nextInt();
    }
    
    //Algoritmo de Ordenamiento(BUSCAR MINIMO Y RECORRERLO AL INICIO)
    for(i=0;i<posiciones;i++){
        min=i;
        for(j=i+1;j<posiciones;j++){
            if(array[j] < array[min]){
                min = j;
            }
        }
        aux = array[i];
        array[i] = array[min];
        array[min] = aux;
    }
    
        System.out.println("\nArray Ordenado:\n");
        for(int v:array){
            System.out.print(v+" -- ");
        }
}
}
    