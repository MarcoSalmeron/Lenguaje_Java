
package javaapplication5;

import java.util.Scanner;


public class Ejercicio8 {
    public static void Ejercicio8(){
        int i,contador;
        System.out.println("Ingresa una tabla de multiplicar");
        Scanner entrada = new Scanner (System.in);
        contador = entrada.nextInt();
        for(i=1;i<=10;i++){
           
            System.out.println(i + " x " + contador + " = " + contador * i);
        }
    }    

}
