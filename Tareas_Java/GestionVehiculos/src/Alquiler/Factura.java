/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alquiler;

/**
 *
 * @author Marco Sal Ram
 */
public class Factura {
     //Atributo
     private double precio;

     //Metodo para Calcular Precio
     public double calcularTotalconImpuesto(double precio){
         double impuesto = calcularImpuestoInterno(precio);
         this.precio += impuesto;
         return this.precio = precio;
     }
     
     //Metodo Privado (No debe ni puede ser Modificado)
     private double calcularImpuestoInterno(double precio){
         //impuesto interno de 15% del total
         return 0.15 * precio;
     }
}
