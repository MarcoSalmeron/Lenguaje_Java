package org.example.Modelos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Setter     @Getter
public class Ticket extends Cliente{

    /**
     *
     * Guadar No. Ticket, Fila, Asiento,
     * fecha Compra, fecha Validez y Precio
     */
    private static int id=0;
    private final String noTicket;
    private int fila, asiento;
    private LocalDate fechaCompra, fechaValidez;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private double precio;

    /**
     * Costructor Completo
     *
     * @param nombre
     * @param apellido constante con id estatico
     * @param fila
     * @param asiento
     * @param precio
     */
    public Ticket(String nombre, String apellido, int fila, int asiento, double precio) {
        super(nombre, apellido);
        this.fila=fila;
        this.asiento=asiento;
        this.precio=precio;
        this.fechaCompra=LocalDate.now();
        this.fechaValidez = fechaCompra.plusDays(2);
        this.noTicket="TCKT-"+(++id);
    }


    @Override
    public String mostrarDatos() {
        return "\nID-CLIENTE: "+getId_Cliente()+
                "\nNombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nFila: "+fila+
                "\nAsiento: "+asiento+
                "\nPrecio: "+precio+
                "\nNum. Ticket: "+noTicket+
                "\nFecha de Compra: "+fechaCompra.format(formatter)+
                "\nFecha Validez: "+fechaValidez.format(formatter);
    }
}
