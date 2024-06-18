
package Ejemplo;

public class Clase implements Interfaz {
int velocidad;

    @Override
    public void arrancar() {
        System.out.println("El coche avanza");
        velocidad = 120;
    }

    @Override
    public void detener() {
        System.out.println("El coche esta quieto");
        velocidad = 0;
    }

    @Override
    public int velocidad() {
      return velocidad;
    }
}
