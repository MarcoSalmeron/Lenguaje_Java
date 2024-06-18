
package CUENTAS;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        //Ejercicio1 - EXAMEN//
        String nombre;
         CUENTA objeto = new CUENTA("MARCO SALMERON");
         CUENTA objeto2 = new CUENTA(3.99);
         
         System.out.println("//EJERCICIO 1//\n");
         System.out.println(objeto.getTitular());
         System.out.println(objeto2.getCantidad());
         
         objeto2.ingresar(2.00);
         
         System.out.println(objeto2.getCantidad());
         
         objeto2.retirar(1.99);
         
         System.out.println(objeto2.getCantidad());
         
         
         //Ejercicio2 - EXAMEN//
         Scanner leer = new Scanner(System.in);
         System.out.println("//EJERCICIO 2//");
         System.out.println("Ingresa tu Nombre");
         nombre = leer.nextLine();
         System.out.println("Bienvenido "+nombre);
    }
    
   
}
