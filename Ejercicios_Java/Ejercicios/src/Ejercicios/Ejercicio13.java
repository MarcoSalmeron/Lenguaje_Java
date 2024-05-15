
package Ejercicios;


public class Ejercicio13 {
    public static void Array(){
        int i ,suma = 0, checador = 0, numero = 3;
        int[] Array = {3,45,3,8};
        for(i=0;i< Array.length;i++){
            if(Array[i] == numero){
                checador = 1;
                System.out.println("El numero esta en el ciclo");
            } else{
                checador = 2;
                System.out.println("Numero inexitente");
            }
            suma += Array[i];
        }
        System.out.println("La suma del arreglo es : "+ suma);
    }
}
