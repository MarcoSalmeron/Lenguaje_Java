
package Alquiler;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Vehiculo Objeto = new Vehiculo("55487HR", "Nissan", "GTR", 144.55);
        Vehiculo Objeto2 = new Vehiculo("33AF01", "Susuky", "NINJA", 280.55);
        Vehiculo objeto3 = new Vehiculo("77668AF","Nissan","Tsuru",220.20);
        Vehiculo objeto4 = new Vehiculo("33281HJ","Tesla","CyberTruck",500.25);
        Vehiculo objeto5 = new Vehiculo("22SA43K","BMW","S-1000 R",340.50);
        Vehiculo objeto6 = new Vehiculo("GA6578U","Italika","AT-110 RT",310.50);
        Coche c1 = new Coche(Objeto.getMatricula(), Objeto.getMarca(), Objeto.getModelo(), Objeto.getPrecioAlquilerPorDia());
        c1.setVelocidad(450); c1.setAceleracion(70.80);
        Coche c2 = new Coche(objeto3.getMatricula(),objeto3.getMarca(),objeto3.getModelo(),objeto3.getPrecioAlquilerPorDia());
        c2.setVelocidad(260); c2.setAceleracion(45.5);
        Coche c3 = new Coche(objeto4.getMatricula(),objeto4.getMarca(),objeto4.getModelo(),objeto4.getPrecioAlquilerPorDia());
        c3.setVelocidad(600); c3.setAceleracion(75.90);
        Moto m1 = new Moto(Objeto2.getMatricula(), Objeto2.getMarca(), Objeto2.getModelo(), Objeto2.getPrecioAlquilerPorDia());
        m1.setCilindrada(350); m1.setAceleracion(60.5); m1.setVelocidad(290);
        Moto m2 = new Moto(objeto5.getMatricula(),objeto5.getMarca(),objeto5.getModelo(),objeto5.getPrecioAlquilerPorDia());
        m2.setCilindrada(290); m2.setAceleracion(50.8); m2.setVelocidad(220);
        Moto m3 = new Moto(objeto6.getMatricula(),objeto6.getMarca(),objeto6.getModelo(),objeto6.getPrecioAlquilerPorDia());
        m3.setCilindrada(210); m3.setAceleracion(48.9); m3.setVelocidad(260);
        String opc2;
        Scanner leer = new Scanner(System.in);
    
        boolean aux = true;
    
        while (aux) {
            System.out.println("\nQue tipo de Vehiculo deseas Comprar:");
            System.out.println("1- Vehiculo");
            System.out.println("2- Motocicleta");
            System.out.println("3- Salir");
            System.out.print("Elige una opcion: ");
            opc2 = leer.nextLine();
            try {
                int opc = Integer.parseInt(opc2);
                String dias_String;
                switch (opc) {
                    case 1:
                        System.out.println("\nVehiculos Disponibles:");
                        System.out.println("(1)- Marca: " + c1.getMarca() + " || Modelo: " + c1.getModelo()+"\n"
                                + "Matricula:\n"+c1.getMatricula()+"\nPrecio de Alquiler por Dia:\n"+c1.getPrecioAlquilerPorDia());
                        c1.Detalles();
                        System.out.println("(2)- Marca: " + c2.getMarca() + " || Modelo: " + c2.getModelo()+"\n"
                                + "Matricula:\n"+c2.getMatricula()+"\nPrecio de Alquiler por Dia:\n"+c2.getPrecioAlquilerPorDia());
                        c2.Detalles();
                        System.out.println("(3)- Marca: " + c3.getMarca() + " || Modelo: " + c3.getModelo()+"\n"
                                + "Matricula:\n"+c3.getMatricula()+"\nPrecio de Alquiler por Dia:\n"+c3.getPrecioAlquilerPorDia());
                        c3.Detalles();
                        System.out.print("Elige una Opcion: ");
                        opc2 = leer.nextLine();
                        try {
                            opc = Integer.parseInt(opc2);
                            switch (opc) {
                                case 1:
                                    System.out.println("Cuantos Dias sera Alquilado?: ");
                                    dias_String = leer.nextLine();
                                    try {
                                        int dias = Integer.parseInt(dias_String);
                                        if (dias > 0) {
                                            System.out.println("El costo Final seria: " + c1.calcularPrecioAlquiler(dias));
                                            break;
                                        } else {
                                            System.out.println("\nERROR: Numero Negativo\n");
                                            break;
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("\nValor no permitido\n");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Cuantos Dias sera Alquilado?: ");
                                    dias_String = leer.nextLine();
                                    try {
                                        int dias = Integer.parseInt(dias_String);
                                        if (dias > 0) {
                                            System.out.println("El costo Final seria: " + c2.calcularPrecioAlquiler(dias));
                                            break;
                                        } else {
                                            System.out.println("\nERROR: Numero Negativo\n");
                                            break;
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("\nValor no permitido\n");
                                    }
                                case 3:
                                    System.out.println("Cuantos Dias sera Alquilado?: ");
                                    dias_String = leer.nextLine();
                                    try {
                                        int dias = Integer.parseInt(dias_String);
                                        if (dias > 0) {
                                            System.out.println("El costo Final seria: " + c3.calcularPrecioAlquiler(dias));
                                            break;
                                        } else {
                                            System.out.println("\nERROR: Numero Negativo\n");
                                            break;
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("\nValor no permitido\n");
                                    }
                                    
                                default:
                                    System.out.println("\nVehiculo no Disponible\n");
                                    break;
                            }
                        } catch (NumberFormatException e) {System.out.println("\nValor no permitido\n");}
                        break; 
                    case 2:
                        System.out.println("\nMotocicletas Disponibles:");
                        System.out.println("(1)- Marca: " + m1.getMarca() + " || Modelo: " + m1.getModelo()+"\n"
                                +          "Matricula:\n"+m1.getMatricula()+"\nPrecio de Alquiler por Dia:\n"+m1.getPrecioAlquilerPorDia());
                        m1.Detalles();
                        
                        System.out.println("(2)- Marca: " + m2.getMarca() + " || Modelo: " + m2.getModelo()+"\n"
                                +          "Matricula:\n"+m2.getMatricula()+"\nPrecio de Alquiler por Dia:\n"+m2.getPrecioAlquilerPorDia());
                        m2.Detalles();
                        
                        System.out.println("(3)- Marca: " + m3.getMarca() + " || Modelo: " + m3.getModelo()+"\n"
                                +          "Matricula:\n"+m3.getMatricula()+"\nPrecio de Alquiler por Dia:\n"+m3.getPrecioAlquilerPorDia());
                        m3.Detalles();
                        System.out.print("Elige una Opcion: ");
                        opc2 = leer.nextLine();
                        try {
                            opc = Integer.parseInt(opc2);
                            switch (opc) {
                                case 1:
                                    System.out.println("Cuantos Dias sera Alquilado?:");
                                    dias_String = leer.nextLine();
                                    try {
                                        int dias = Integer.parseInt(dias_String);
                                        if (dias > 0) {
                                            System.out.println("El costo final seria de: " + m1.calcularPrecioAlquiler(dias));
                                            break;
                                        } else {
                                            System.out.println("\nERROR: Valor Negativo\n");
                                            break;
                                        }
                                    } catch (NumberFormatException e) {System.out.println("\nValor no permitido\n");}
                                    break;
                                case 2:
                                    System.out.println("Cuantos Dias sera Alquilado?:");
                                    dias_String = leer.nextLine();
                                    try {
                                        int dias = Integer.parseInt(dias_String);
                                        if (dias > 0) {
                                            System.out.println("El costo final seria de: " + m1.calcularPrecioAlquiler(dias));
                                            break;
                                        } else {
                                            System.out.println("\nERROR: Valor Negativo\n");
                                            break;
                                        }
                                    } catch (NumberFormatException e) {System.out.println("\nValor no permitido\n");}
                                    break;
                                case 3:
                                    System.out.println("Cuantos Dias sera Alquilado?:");
                                    dias_String = leer.nextLine();
                                    try {
                                        int dias = Integer.parseInt(dias_String);
                                        if (dias > 0) {
                                            System.out.println("El costo final seria de: " + m1.calcularPrecioAlquiler(dias));
                                            break;
                                        } else {
                                            System.out.println("\nERROR: Valor Negativo\n");
                                            break;
                                        }
                                    } catch (NumberFormatException e) {System.out.println("\nValor no permitido\n");}
                                    break;
                                default:
                                    System.out.println("\nMotocicleta No Disponible\n");
                                    break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("\nValor no permitido\n");
                        }
                        break; // Agregar break aquí
                    case 3:
                        System.out.println("Saliendo...");
                        aux = false;
                        break;
                    default:
                        System.out.println("\nOpcion no valida...\n");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("\nNo es un Numero Valido... \n");
            }
        }
    }
}
