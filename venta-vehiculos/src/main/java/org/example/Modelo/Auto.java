package org.example.Modelo;

import lombok.*;

//Modelo a Abstraer//
@Getter     @Setter
public class Auto {

    /**
     * Atributos privados
     */
    private static int id = 0;
    private final String id_auto;
    private String modelo;
    private String marca;
    private double precio;

    /**
     * Constructor Completo
     * @param marca
     * @param modelo
     * @param precio
     *
     * constante id = static int ++
     */
    public Auto (String marca, String modelo, double precio){
        this.modelo=modelo;
        this.marca=marca;
        this.precio=precio;
        this.id_auto = "AUTO-"+(++id);
    }

    /**
     * Mostrar Objeto
     * @return Auto
     */
    @Override
    public String toString() {
        return "Auto{   " +
                "ID: '" + id_auto + '\'' +
                ", marca=' " + marca + '\'' +
                ", modelo=' " + modelo + '\'' +
                ", precio= $." + precio +
                "   }";
    }
}
