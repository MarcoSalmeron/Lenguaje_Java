
package CUENTAS;

import javax.swing.JOptionPane;

public class CUENTA {
    //ATRIBUTOS DE CUENTA//
    String titular;
    double cantidad;
    
    //titular obligatorio//
    //cantidad opcional//
    //un constructor por cada atributo//
    public CUENTA(String titular) {
        this.titular = titular;
    }
    
    public CUENTA(double cantidad){
        this.cantidad = cantidad;
    }
    //metodos set y get//

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
    //METODOS ESPECIALES//
    public void ingresar(double cantidad){
        if(cantidad <= 0){
            JOptionPane.showMessageDialog(null,"Cantidad Negativa");
        }else{
            this.cantidad += cantidad;
        }
    }
    public void retirar(double cantidad){
        if(cantidad <= 0){
            //si la cantidad es negativa la cantidad pasara a 0//
           this.cantidad = 0;
        }else{
            this.cantidad -= cantidad;
        }
    }
}
