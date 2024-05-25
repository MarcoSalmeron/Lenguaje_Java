
package Alquiler;

public class Vehiculo {
    //atributos de un vehiculo//
    protected String matricula;
    protected String marca;
    protected String modelo;
    private double precioAlquilerPorDia;
    final  double DESCUENTO_LARGA_DURACION;
Vehiculo Objeto = new Vehiculo("*Depende el modelo*","Suzuki y Nissan","Ninja y GTR",144.55);

public void detalles(){
        System.out.println("Dettalles: ");
        System.out.println("Matriculas: "+Objeto.matricula);
        System.out.println("Marcas que manejamos: "+Objeto.marca);
        System.out.println("Modelos: "+Objeto.modelo);
        System.out.println("\nDesde (Precio Por cada dia):");
        System.out.println("$"+Objeto.precioAlquilerPorDia);
        System.out.println("DESCUENTO DE "+Objeto.DESCUENTO_LARGA_DURACION+"% POR 7 DIAS!");
        System.out.println(Objeto.calcularPrecioAlquiler(5));
    }
    //constructor para iniciar mis atributos//
    public Vehiculo(String matricula, String marca, String modelo, double precioAlquilerPorDia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precioAlquilerPorDia = precioAlquilerPorDia;
        this.DESCUENTO_LARGA_DURACION = 9.5;
    }    
        //metodos//

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioAlquilerPorDia(double precioAlquilerPorDia) {
        if(precioAlquilerPorDia > 0){
        this.precioAlquilerPorDia = precioAlquilerPorDia;
    }
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAlquilerPorDia() {
        return precioAlquilerPorDia;
    }

    public double getDESCUENTO_LARGA_DURACION() {
        return DESCUENTO_LARGA_DURACION;
    }
    public String calcularPrecioAlquiler(int dias){
        double presio = precioAlquilerPorDia * dias;
            if(dias >= 7){
              double descuento = DESCUENTO_LARGA_DURACION / 100;
              double resta = descuento * presio;
              presio = presio - resta;
              return "El precio por "+dias+" dias (con DESCUENTO) "+presio;
            } 
            return "El precio por "+dias+" dias es: "+ presio ;
        }
}
    

