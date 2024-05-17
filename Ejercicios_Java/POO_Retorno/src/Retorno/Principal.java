
package Retorno;

import javax.swing.JOptionPane;


public class Principal {
    
    public static void main (String [] arg){
        //crear metodos con argumento y retorno
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        
      //clase   nombre  nuevo constructor//
        Retorno objeto = new Retorno();
        
        System.out.println(objeto.suma(n1, n2));
        System.out.println(objeto.resta(n1, n2));
        
        
        //guardar en auxiliar
        int multiplicacion = objeto.multiplicar(n1, n2);
        int division = objeto.division(n1, n2);
        
        //System.out.println(objeto.multiplicar(n1, n2));
        //System.out.println(objeto.division(n1, n2));
        
        
    }
}
