
package metodos;

import javax.swing.JOptionPane;

public class telefono {
    //crear atributos del telefono
    String num;
    String propietario;
    String tipo_num;
    double numero;
    //crear metodos
    public void pedir_num(){
     num = JOptionPane.showInputDialog(null,"Ingresa un numero para marcar");
     numero = Double.parseDouble(num);
    }
    public void pedir_nombre(){
        propietario = JOptionPane.showInputDialog(null,"A quien le pertenece el numero?");
        JOptionPane.showMessageDialog(null,"Encantado de Conocerte!!! ");
    }
    public void tipo_num(){
        tipo_num = JOptionPane.showInputDialog(null,"El numero registrado es Empresarial o Personal?");
        
    }
    public void resultados(){
        JOptionPane.showMessageDialog(null,"Propietario: "+ propietario);
        JOptionPane.showMessageDialog(null,"Numero marcado: "+ numero);
        JOptionPane.showMessageDialog(null,"Tipo de Numero: "+ tipo_num );
        //System.out.println("Numero marcado: "+ numero);
        //System.out.println("Propietario: "+ propietario);
        //System.out.println("Tipo de numero: "+ tipo_num);
    }
}
