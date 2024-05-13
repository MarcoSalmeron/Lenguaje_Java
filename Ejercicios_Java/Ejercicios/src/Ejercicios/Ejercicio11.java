
package javaapplication5;

import java.util.Scanner;

 
public class Ejercicio11 {
 public static void Ejercicio11() {
     int opc;
     Scanner entrada = new Scanner (System.in);
     do{
         System.out.println("**Dias de la semana**");
         System.out.println("*********************");
         System.out.println("1-7: Dias de la semana");
         System.out.println("8- Salir");
         opc = entrada.nextInt();
         switch(opc){
             case 1:
                 System.out.println("Lunes");
                 break;
             case 2:
                 System.out.println("Martes");
                 break;
             case 3:
                 System.out.println("Miercoles");
                 break;
             case 4:
                 System.out.println("Jueves");
                 break;
             case 5:
                 System.out.println("Viernes");
                 break;
             case 6:
                 System.out.println("Sabado");
                 break;
             case 7:
                 System.out.println("Domingo");
                 break;
             case 8:
                 System.out.println("Hasta luego...");
                 break;
             default:
                 System.out.println("Dia no valido...");
                 break;
         }
     }while(opc != 8);
 }
   
}
