
package org.Patrones.Ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Inserccion {
    int array[],posiciones,aux,posicion;
    Scanner leer = new Scanner(System.in);
    public void INSERCCION(){
        posiciones = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la Cantidad de Elementos del Arreglo:"));
        array = new int[posiciones];
        
        System.out.println("Crear Arreglo:\n");
        for(int i=0;i<posiciones;i++){
            System.out.print((i+1)+". Digita un Numero: ");
            array[i] = leer.nextInt();
            
        }
        
        //Metodo Inserccion
        for(int i=0;i<posiciones;i++){
            posicion = i;
            aux = array[i];
            
            while(posicion>0 && array[posicion-1] > aux){
                array[posicion] = array[posicion-1];
                posicion--;
            }
            array[posicion] = aux;
        }
        
        System.out.println("\nArreglo Ordenado Acendentemente:\n");
        for(int i=0;i<posiciones;i++){
            System.out.print(array[i]+" - ");
        }
        System.out.println("\nArreglo ordenado (Reversa)\n");
        for(int i = (posiciones-1);i>=0;i--){
            System.out.print(array[i]+" - ");
        }
    }
}
