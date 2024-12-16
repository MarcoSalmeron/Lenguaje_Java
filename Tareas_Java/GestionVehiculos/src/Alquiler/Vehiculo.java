
package Alquiler;

public class Vehiculo {
    //atributos de un vehiculo//
    protected String matricula;
    protected String marca;
    protected String modelo;
    private double precioAlquilerPorDia;
    final  double DESCUENTO_LARGA_DURACION;
    private double Total_Factura;
    
    //Metodo para Factura
     Factura factura = new Factura();
    //constructor para iniciar mis atributos//
    public Vehiculo(String matricula, String marca, String modelo, double precioAlquilerPorDia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precioAlquilerPorDia = precioAlquilerPorDia;
        this.DESCUENTO_LARGA_DURACION = 9.5;
    }    
        //SET//

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
             //GET
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
        try{
            double presio = precioAlquilerPorDia * dias;
            //Si rentan mas de 6 dias se aplica descuento
            if(dias <= 0 ){
                 return "ERROR: El valor es Negativo";
            }else if(dias >= 7){
                 double descuento = DESCUENTO_LARGA_DURACION / 100;
                 double resta = descuento * presio;
                 presio = presio - resta;
                
                 return "El precio por "+dias+" dias (con DESCUENTO del 9.5%) "+presio;
            }
            //Sumar Factura
            Total_Factura = factura.calcularTotalconImpuesto(presio);
            presio += Total_Factura;
            return "El precio por "+dias+" dias (Mas Impuesto del 15%):\n"+presio;
         }catch(NumberFormatException e){
                return "El valor no es numero valido";
    
    } 
        }
}
    

