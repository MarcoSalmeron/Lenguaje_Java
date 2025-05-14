package org.example.Repositorio;

import org.example.Modelos.Ticket;

import java.util.ArrayList;
import java.util.List;

//Base de Datos Logica//
public class BaseDatos {

    /**
     *
     * Almacenar y cargar estructura de Datos con Ticket
     */
    private static List<Ticket> registros = new ArrayList<Ticket>();

    public static void save(String nombre, String apellido, int fila, int asiento, double precio){
        registros.add(new Ticket(nombre,apellido,fila,asiento,precio));
        System.out.println("Ticket Guardado Exitosamente:\n");
    }

    public static List<Ticket> getRegistros(){
        return registros;
    }
}
