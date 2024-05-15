
package Ejercicios;


public class Ejercicio9 {
  public static void   Ejercicio9 (){
      int i,pares,impar,total;
      impar = 0;
      pares = 0;
      i=1;
      do{
          System.out.println(i);
          if(i % 2 == 0){
              pares = pares + i;
          }else{
              impar = impar + i;
          }
          i++;
  }while(i<=6);
      total = (pares + impar) + 2;
      System.out.println("La suma de pares del ciclo es : " +pares);
      System.out.println("La suma de impares del ciclo es : "+impar);
     System.out.println("La suma total es : "+total);
      
  }
}
