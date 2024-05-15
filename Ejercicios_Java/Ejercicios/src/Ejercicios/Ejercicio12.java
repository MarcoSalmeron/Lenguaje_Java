
package Ejercicios;

import javax.swing.JOptionPane;


public class Ejercicio12 {
    public static void JOption(){
        String pedirnumero, pedirnumerodos;
        int n1,n2,total;
        //JOptionPane.showMessageDialog(null, "Hola, ingresa un numero");
        pedirnumero = JOptionPane.showInputDialog("Ingresa un numero");
        n1 = Integer.parseInt(pedirnumero);
        
        pedirnumerodos = JOptionPane.showInputDialog("Ingresa el segundo numero");
        n2 = Integer.parseInt(pedirnumerodos);
        total = n1 * n2;
        
        JOptionPane.showMessageDialog(null, "La multiplicacion es : "+ n1 + " x " + n2 +" = "+ total);
    }
}
