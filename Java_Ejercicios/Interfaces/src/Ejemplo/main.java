
package Ejemplo;


public class main {
    public static void main(String[] args) {
        
        //crear objeto e implementar metodos//
                   Clase objeto = new Clase();  
                    objeto.arrancar();
                   System.out.println("Velocidad inicial: "+ objeto.velocidad());
                 
                   objeto.detener();
                   System.out.println("Velocidad final: "+ objeto.velocidad());
    }
}