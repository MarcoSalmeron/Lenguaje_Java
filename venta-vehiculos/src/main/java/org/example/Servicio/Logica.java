package org.example.Servicio;

import org.example.Modelo.Auto;
import org.example.Repositorio.BaseDatos;

import javax.swing.*;
import java.util.Comparator;
import java.util.List;

//Servicio con la Logica del Negocio//
public class Logica {

    //Usar registros de la BaseDatos//
    private static List<Auto> registros = BaseDatos.registros();

    /**
     * Ordenar por Precio de menor a mayor
     *
     */
    public static void sortByPrice(){
        registros.stream()
                .sorted(Comparator.comparing(Auto::getPrecio))
                .forEach(System.out::println);
    }

    /**
     * Ordenar por Marca y Precio
     *
     */
    public static void sortedByNameAndPrice(){
        registros.stream()
                .sorted(Comparator
                        .comparing(Auto::getMarca)
                        .thenComparing(Auto::getPrecio))
                .forEach(System.out::println);

    }

    /**
     * Mostrar Autos con Precio menores a $23k
     *
     */
    public static void findLowerPrices(){
        registros.stream()
                .filter(a->Math.floor(a.getPrecio())<=23000)
                .forEach(System.out::println);
    }

    /**
     * Filtrar por Marcas Volskwagen y Chevrolet
     *
     */
    public static void findNames(){
        registros.stream()
                .filter(a->a.getMarca().equals("Volkswagen") || a.getMarca().equals("Chevrolet"))
                .forEach(System.out::println);
    }


    /**
     * Mostrar Autos cuyo modelo contenga letra A
     *
     */
    public static void findByLetterA(){
        registros.stream()
                .filter(a->a.getModelo().toLowerCase().contains("a"))
                .forEach(System.out::println);
    }


    /**
     * Buscar Auto por ID
     * @param ID
     * @return auto
     */
    public static Auto findById(String ID){
        return registros.stream()
                .filter(a->a.getId_auto().equals(ID))
                .findFirst()
                .orElseThrow(()-> new NullPointerException(" -> [ID Inexistente!]"));
    }

    /**
     * Guardar Nuevo Objeto
     * en BaseDatos
     */
    public static void saveAuto(){
        String marca = JOptionPane.showInputDialog("Marca del Auto:");
        String modelo = JOptionPane.showInputDialog("Modelo del Auto:");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del Auto"));

        BaseDatos.save(marca, modelo, precio);
    }

    /**
     * Mostrar todos los registros
     * en BaseDatos
     */
    public static void all(){
        for(Auto autos : registros){
            System.out.println(autos);
        }
    }
}
