package org.example.Repositorio;

import org.example.Modelo.Auto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Simular Base de Datos//
public class BaseDatos {

    /**
     * Autos con Marcas y Precio
     * registros a usar
     */
    private static List<Auto> listaAutos = new ArrayList<>(Arrays.asList(
                new Auto("Volkswagen", "Amorok", 25000.200),
                new Auto("Volkswagen", "Taos", 32000.500),
                new Auto("Chevrolet", "Onix", 22000.400),
                new Auto("Chevrolet", "Tracker", 30000.200),
                new Auto("Fiat", "Cronos", 21000.400),
                new Auto("Fiat", "Pulse", 24000.100),
                new Auto("Toyota", "Corolla", 28000.200),
                new Auto("Toyota", "Yaris", 23000.100),
                new Auto("Renault", "Stepway", 20000.600),
                new Auto("Renault", "Duster", 27000.100),
                new Auto("Nissan", "Versa", 25000.200)
    ));

    /**
     * Lista de Objetos
     * @return registros
     */
    public static List<Auto> registros(){
        return listaAutos;
    }

    /**
     * Crear nuevo Objeto en los registros
     * @param marca
     * @param modelo
     * @param precio
     */
    public static void save(String marca, String modelo, double precio){
        listaAutos.add(new Auto( marca, modelo, precio ));
        System.out.println("Auto Guardado!");
    }
}
