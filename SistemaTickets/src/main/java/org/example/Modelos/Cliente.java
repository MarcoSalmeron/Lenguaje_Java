package org.example.Modelos;

import lombok.Getter;
import lombok.Setter;

//Clase Padre con Datos del Cliente//
@Getter     @Setter
public abstract class Cliente {

    //Atributos//
    private static int id=0;
    private final String id_Cliente;
    private String nombre;
    private String apellido;

    /**
     * Costructor Completo
     * @param nombre
     * @param apellido
     * constante con id estatico
     */
    public Cliente (String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
        this.id_Cliente="CLT-"+(++id);
    }

    public abstract String mostrarDatos();
}
