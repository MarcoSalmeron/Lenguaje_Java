
package Alquiler;

public class Moto extends Vehiculo {
   //atributos//
    private int cilindrada;
    private int velocidad;
    private double aceleracion;
    
    Moto Objeto3 = new Moto("DR45AF","Suzuki","Ninja",250.55);

    public Moto(String matricula, String marca, String modelo, double precioAlquilerPorDia) {
        super(matricula, marca, modelo, precioAlquilerPorDia);
        this.cilindrada = 200;
        this.aceleracion = 55.5;
        this.velocidad = 290;
    }
    
    @Override
    public void detalles(){
       System.out.println("Dettalles: ");
        System.out.println("Matriculas: "+Objeto3.matricula);
        System.out.println("Marca: "+Objeto3.marca);
        System.out.println("Modelo: "+Objeto3.modelo);
         System.out.println("velocidad: "+Objeto3.velocidad);
         System.out.println("Aceleracion: "+Objeto3.aceleracion);
         System.out.println("Cilindrada: "+Objeto3.cilindrada);
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
