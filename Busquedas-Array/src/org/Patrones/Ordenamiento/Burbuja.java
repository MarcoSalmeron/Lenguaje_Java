
package org.Patrones.Ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Burbuja {
    int posiciones,array[],aux;
    Scanner leer = new Scanner(System.in);
    public void BURBUJA(){
        posiciones = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la Cantidad de Elementos del Arreglo"));
        array = new int[posiciones];
        
        //crear Arreglo
        for(int i=0;i<posiciones;i++){
            System.out.print((i+1)+". Digite un Valor: ");
            array[i] = leer.nextInt();
        }
        
        //Metodo Burbuja para Acomodar
        for(int i=0;i<(posiciones-1);i++){
            for(int j=0;j<(posiciones-1);j++){
                if(array[j] > array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        System.out.println("\nArreglo Ordenado:\n");
        //Mostrar Arreglo Ordenado//
        for(int i=0;i<posiciones;i++){
            System.out.print(array[i]+" - ");
        }
        System.out.println("\nArreglo Ordenado (Reversa)\n");
        for(int i=(posiciones-1);i>=0;i--){
            System.out.print(array[i]+" - ");
        }
    }
}
