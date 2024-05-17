
package Argumentos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
    public static void main (String [] arg){
         Ejercicios Alumno = new Ejercicios();
         String num1,num2;
        int n1,n2;
        Scanner entrada = new Scanner (System.in);
        
        num1 = JOptionPane.showInputDialog("Ingresa el primer numero para iniciar el ciclo");
        n1 = Integer.parseInt(num1);
        //System.out.println("Ingresa el primer numero para iniciar el ciclo");
        //n1 = entrada.nextInt();
        num2 = JOptionPane.showInputDialog("Ingresa el segundo numero para terminar ciclo");
        n2 = Integer.parseInt(num2);
        //System.out.println("Ingresa el segundo numero pata terminar ciclo");
        //n2 = entrada.nextInt();
        Alumno.numero_ciclofor(n1,n2);
        
        
        System.out.println("Ingresa un numero para terminar el segundo ciclo");
        n1 = entrada.nextInt();
        Alumno.numero_pares(n1);
        
        
        System.out.println("Ingresa un numero para identificar");
        n2 = entrada.nextInt();
        Alumno.positivo_negativo(n2);
    }
}
