
package org.Patrones.Busqueda;

import javax.swing.JOptionPane;


public class Binaria {
    //Debe Estar Ordenado el Array de Forma ASCENDENTE//
    public void Binario(){
        //Busqueda Solo Sirve en Arreglos ASCENDENTES//
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int inferior,superior,buscar,mitad,i;
        boolean aux = false;
        
        buscar = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un Valor a Buscar en Arreglo:"));
        //Busqueda Binaria
        inferior = 0;
        superior = 10;
        i=0;
        
        mitad = (inferior+superior)/2;

       while(inferior<=superior && i<10){
           if(array[mitad] == buscar){
               aux = true;
               break;
           }
           if(array[mitad] > buscar){
               superior = mitad;
               mitad = (inferior+superior)/2;
           }
           if(array[mitad] < buscar){
               inferior = mitad;
               mitad = (inferior+superior)/2;
           }
           i++;
       }        
       if(aux){
           JOptionPane.showMessageDialog(null,"Numero Encontrado en Posicion: "+mitad);
       }else{
           JOptionPane.showMessageDialog(null,"Numero No Encontrado");
       }
        
    }
}
