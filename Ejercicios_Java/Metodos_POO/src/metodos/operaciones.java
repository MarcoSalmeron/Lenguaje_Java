
package metodos;

import java.util.Scanner;

public class operaciones {
    //compartir atributos con los metodos
    int n1, n2, suma, resta, multiplicacion;
    //crear metodos
    
    public void pedirnum(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingresa un numero");
        n1 = entrada.nextInt();
        System.out.println("Ingresa el segundo numerp");
        n2 = entrada.nextInt();
        System.out.println("");
    }    
    public void suma(){
        suma = n1 + n2;
    }    
    public void resta(){
        resta = n1 - n2;
    } 
    public void multiplicacion(){
        multiplicacion = n1 * n2;
    }
    public void resultados(){
        System.out.println("La suma de "+ n1 + " y "+ n2 + " es : "+ suma);
        System.out.println("La resta es : "+ resta);
        System.out.println("La multiplicacion es : "+ multiplicacion);
    }
}
