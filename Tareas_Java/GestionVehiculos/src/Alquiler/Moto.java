
package Alquiler;

public class Moto extends Vehiculo {
 //atributos//
 private int cilindrada;
 private int velocidad;
 private double aceleracion;
 
 
//Constructor
 public Moto(String matricula, String marca, String modelo, double precioAlquilerPorDia) {
     super(matricula, marca, modelo, precioAlquilerPorDia);
     this.cilindrada = 200;
     this.aceleracion = 55.5;
     this.velocidad = 290;
 }
 
 
 public void Detalles(){
     System.out.println("\n'Atributos'\nCilindrada:\n"+this.cilindrada+"\nRPM:\n"+this.aceleracion+"\nVelocidad:\n"+this.velocidad+"\n");
 }
 public void setCilindrada(int cilindrada) {
     this.cilindrada = cilindrada;
 }

 public void setVelocidad(int velocidad) {
     this.velocidad = velocidad;
 }

 public void setAceleracion(double aceleracion) {
     this.aceleracion = aceleracion;
 }

 public int getCilindrada() {
     return cilindrada;
 }

 public int getVelocidad() {
     return velocidad;
 }

 public double getAceleracion() {
     return aceleracion;
 }
 
}
