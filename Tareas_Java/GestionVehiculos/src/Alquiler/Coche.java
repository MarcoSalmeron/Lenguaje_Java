
package Alquiler;


public class Coche extends Vehiculo {
      //atributos del coche//
      private int numPuertas;
      private int velocidad;
      private double aceleracion;
      
      //Constructor
      public Coche(String matricula, String marca, String modelo, double precioAlquilerPorDia) {
          //Atributos Heredados
          super(matricula, marca, modelo, precioAlquilerPorDia);
          //Valores Propios
          this.velocidad = 350;
          this.numPuertas = 4;
          this.aceleracion = 44.5;
      }
      
      public void Detalles(){
          System.out.println("\n'Atributos'\n-Velocidad en km:\n"+this.velocidad+"\n-RPM:\n"+this.aceleracion+"\n-Puertas:\n"+this.numPuertas+"\n");
      }
      public void setNumPuertas(int numPuertas) {
          if(numPuertas > 2){
          this.numPuertas = numPuertas;
      }
      }
  
      public void setVelocidad(int velocidad) {
          if(velocidad > 0){
          this.velocidad = velocidad;
      }
      }
      public void setAceleracion(double aceleracion) {
          if(aceleracion > 0){
          this.aceleracion = aceleracion;
      }
      }
  
      public int getNumPuertas() {
          return numPuertas;
      }
  
      public int getVelocidad() {
          return velocidad;
      }
  
      public double getAceleracion() {
          return aceleracion;
      }
  

}
