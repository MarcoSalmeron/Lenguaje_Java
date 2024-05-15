
package Ejercicios;


public class Ejercicio5 {
    static void Ejercicio5(){
        int i,suma,impar;
        impar = 0;
        suma = 0;
        i = 1;
        while(i <=5){
            System.out.println(i);
           
            if(i % 2 == 0){
                suma += i;
            }else if(i % 2 == 1){
                impar += i;
            }
            i++;
        }
        System.out.println("La suma de pares es : "+suma);
        System.out.println("La suma de impares es : "+impar);
    }
}
