package org.example.Servicios;

import org.example.Modelos.Ticket;
import org.example.Repositorio.BaseDatos;

import javax.swing.*;
import java.util.List;

//Servicio con Logica del Negocio//
public class Logica {

    /**
     *
     * --Sumar el precio de todos los tickets
     * --Pedir NFila y mostrar los datos del ticket
     */
    private static List<Ticket> listaTickets = BaseDatos.getRegistros();
    static double suma=0;

    /**
     * Guardar
     */
    public static void saveTicket(){
        String nombre = JOptionPane.showInputDialog("Ingresa tu Nombre:");
        String apellido = JOptionPane.showInputDialog("Ingresa tu Apellido:");
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Escoge una Fila:"));
        int asiento = Integer.parseInt(JOptionPane.showInputDialog("Escoge un Asiento:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del Ticket:"));
        BaseDatos.save(nombre,apellido,fila,asiento,precio);
    }

    /**
     * Mostrar
     */
    public static void all(){
        if(listaTickets.isEmpty() || listaTickets == null){
            System.out.println("No Hay Registros Disponibles...");
        } else {

            for(Ticket ticket : listaTickets){
                System.out.println(ticket.mostrarDatos());
            }
        }
    }

    /**
     * Sumar Precio de todos los tickets
     */
    public static void sumPrecio(){

        for(Ticket ticket : listaTickets){
            suma += ticket.getPrecio();
        }
        System.out.println("La Suma Total de los Tickets Venddidos es:\n $."+Math.round(suma));
    }

    /**
     * Buscar Ticket de n Fila
     */
    public static boolean findByRow(int nFila){

        for(Ticket ticket : listaTickets){
            if(ticket.getFila() == nFila){
                System.out.println(ticket.mostrarDatos());
                return  true;
            }
        }
        return false;
    }


}
