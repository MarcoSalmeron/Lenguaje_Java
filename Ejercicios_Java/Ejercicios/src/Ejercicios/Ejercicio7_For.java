
package Ejercicios;

import java.util.Scanner;

public class Ejercicio7_For {
    public static void Ejercicio7_For(){
        int inicio,fin,i;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingresa el inicio del ciclo");
        inicio = entrada.nextInt();
        System.out.println("Ingresa el fin del ciclo");
        fin = entrada.nextInt();
        
        for( i = inicio; i <= fin; i+=2){
            System.out.println(i);
        }
    }
    
}
