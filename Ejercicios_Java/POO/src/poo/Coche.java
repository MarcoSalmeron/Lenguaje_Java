
package poo;


public class Coche {
    String Color;
    String Marca;
    int km;
    
    public static void main(String [] args){
    Coche cocheuno = new Coche();
    cocheuno.Color = "Amarillo";
    cocheuno.Marca = "Dodge";
    cocheuno.km = 200;
        System.out.println("El color del objeto es : "+ cocheuno.Color);
        System.out.println("La marca del objeto es : "+ cocheuno.Marca);
        System.out.println("El kilometraje del objeto es : "+ cocheuno.km);
        System.out.println("");
    Coche cochedos = new Coche();
    cochedos.Color = "Blanco";
    cochedos.Marca = "Bochito";
    cochedos.km = 180;

        System.out.println("El color del segundo objeto es: "+ cochedos.Color);
        System.out.println("La marca del segundo objeto es: "+ cochedos.Marca);
        System.out.println("El kilometraje del objeto dos es: "+ cochedos.km);
    }
}
