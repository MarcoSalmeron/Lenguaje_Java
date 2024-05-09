
package javaapplication5;


public class Ejercicio5 {
    static void Ejercicio5(){
        int i,suma;
        suma = 0;
        i = 1;
        while(i <=5){
            System.out.println(i);
            i++;
            if(i % 2 == 0){
                suma = i;
            }
        }
        System.out.println("La suma de pares es : "+suma);
    }
}
