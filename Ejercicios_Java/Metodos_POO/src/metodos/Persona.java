
package metodos;

import java.util.Scanner;


public class Persona {
    //compartir atributos
    String nombre;
    String genero;
    int edad;
    Scanner entrada = new Scanner (System.in);
    
    //crear metodos
    public void nombre(){
        System.out.println("Cual es tu nombre?");
        nombre = entrada.nextLine();
        System.out.println("Encantado de conocerte!!");
    }
    public void genero(){
        System.out.println("Cual es tu genero?");
        genero = entrada.nextLine();
    }
    public void edad(){
        System.out.println("Cual es tu edad?");
        edad = entrada.nextInt();
    }
    public void resultados(){
        System.out.println("");
        System.out.println("Nombre de la persona: "+ nombre);
        System.out.println("Genero de la misma: "+ genero);
        System.out.println("Edad de "+ nombre + ": "+edad);
    }
}
