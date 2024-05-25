
package Alquiler;


public class Coche extends Vehiculo {
    //atributos del coche//
    private int numPuertas;
    private int velocidad;
    private double aceleracion;
    
    Coche Objeto2 = new Coche("33AF01","Nissan","GTR",144.55);

     @Override
    public void detalles(){
        System.out.println("Dettalles: ");
        System.out.println("Matriculas: "+Objeto2.matricula);
        System.out.println("Marca: "+Objeto2.marca);
        System.out.println("Modelo: "+Objeto2.modelo);
         System.out.println("velocidad: "+Objeto2.velocidad);
         System.out.println("Aceleracion: "+Objeto2.aceleracion);
         System.out.println("Numero de puertas: "+Objeto2.numPuertas);
    }
    public Coche(String matricula, String marca, String modelo, double precioAlquilerPorDia) {
        super(matricula, marca, modelo, precioAlquilerPorDia);
        this.velocidad = 350;
        this.numPuertas = 4;
        this.aceleracion = 44.5;
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
