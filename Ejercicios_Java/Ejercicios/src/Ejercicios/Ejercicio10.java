
package javaapplication5;

import java.util.Scanner;


public class Ejercicio10 {
    public static void Ejercicio10(){
        Scanner entrada = new Scanner (System.in);
        int dinero,abono,retiro,opc;
        dinero = 5000;
        do{
            System.out.println("***Menu***");
            System.out.println("**********");
            System.out.println("1- Consultar Saldo");
            System.out.println("2- Depositar en cuenta");
            System.out.println("3- Retiro de Saldo");
            System.out.println("4- Salir");
            System.out.println("Elige una opcion: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Saldo de : "+dinero);
                    break;
                case 2:
                    System.out.println("Cuanto dinero deseas ingresar?");
                    abono = entrada.nextInt();
                    dinero += abono;
                    System.out.println("Deposito realizado!");
                    break;
                case 3:
                    System.out.println("Cuanto dinero deseas retirar?");
                    retiro = entrada.nextInt();
                    if(retiro > dinero){
                        System.out.println("ERROR");
                        System.out.println("Saldo insuficiente...");
                        dinero += retiro;
                    }else if(retiro <= dinero){
                    dinero -= retiro;
                    System.out.println("Retiro Exitoso!");
                    }
                    break;
                case 4:
                    System.out.println("Hasta pronto...!");
                    break;
                default:
                    System.out.println("Opcion Invalida...");
                    break;
            }
        }while(opc != 4);
    }
}
