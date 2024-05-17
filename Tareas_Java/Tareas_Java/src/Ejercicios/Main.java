
package Ejercicios;

import javax.swing.JOptionPane;

public class Main {
    public static void main (String [] arg){
        
        
        Telefono celular = new Telefono();
       celular.pedir_num();
       celular.pedir_nombre();
       celular.tipo_num();
       celular.resultados();
       
       
       //TAREA 2//
        //crear metodos con argumento y retorno
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        
      //clase   nombre  nuevo constructor//
        Operaciones objeto = new Operaciones();
        
        System.out.println(objeto.suma(n1, n2));
        System.out.println(objeto.resta(n1, n2));
        
        
        //guardar en auxiliar//
        //int multiplicacion = objeto.multiplicar(n1, n2);
        //int division = objeto.division(n1, n2);
        
        System.out.println(objeto.multiplicar(n1, n2));
        System.out.println(objeto.division(n1, n2));
       
    }
    
}
