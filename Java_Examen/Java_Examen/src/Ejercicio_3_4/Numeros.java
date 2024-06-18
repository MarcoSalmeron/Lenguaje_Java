
package Ejercicio_3_4;

import java.util.Scanner;
import javax.swing.JFrame;

public class Numeros {
    public static void main(String[] args) {
        
         //EJERCICIO4 - EXAMEN//
    NOMBRE ventana = new NOMBRE();
    ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    ventana.setVisible(true);
    ventana.setLocationRelativeTo(null);
    
    
        //Ejercicio3 - EXAMEN//
          int opc;
          int opc2;
       int aux = 0;
    
   Scanner leer = new Scanner(System.in);
   
   do{
            System.out.println("//EJERCICIO 3//");
            System.out.println("1- Ingresa 1 Numero");
            System.out.println("2- Cantidad de Numeros Ingresados");
            System.out.println("3- Salir");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    System.out.println("INGRESA 1 NUMERO");
                    opc2 = leer.nextInt();
                    aux++;
                    break;
                case 2:
                    System.out.println("Cantidad de Numeros Ingresados: "+aux+"\n");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no Valida...");
            }
    }while(opc != 3);
   
   
    }
}
