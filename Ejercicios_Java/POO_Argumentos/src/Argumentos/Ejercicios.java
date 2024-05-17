
package Argumentos;

import javax.swing.JOptionPane;


public class Ejercicios {
    
    public void numero_ciclofor(int n1, int n2){
    for(int i = n1; i<= n2; i++){
        System.out.println(i);
    }
}
    public void numero_pares(int n1){
        int i = 0, suma = 0;
        
        while(i <= n1){
        if(i % 2 == 0){
            System.out.println(i + " Es par");
            suma += i;
        }
        i++;
    }
        JOptionPane.showMessageDialog(null,"La suma de pares es: " + suma);
    }
    public void positivo_negativo(int n2){
        System.out.println("Numero ingresado: " + n2);
        if(n2 > 0){
            JOptionPane.showMessageDialog(null,"El numero : "+n2+" es positivo");
        }else{
            JOptionPane.showMessageDialog(null,"El numero : "+n2+" es negativo");
        }
    }
}
