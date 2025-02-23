
package org.Patrones.Busqueda;

import javax.swing.JOptionPane;

public class Secuencial {
    
    public void Secuencial(){
   //Busqueda de Elementos en Arreglos
int array[] = {9, 5, 6, 4, 3, 22, 1, 10};
int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Numero a Buscar"));

boolean aux = false;
int i = 0;
while (i < array.length && aux == false) {
    if (array[i] == buscar) {
        aux = true;
    }
    i++;
}
if (aux == false) {
    JOptionPane.showMessageDialog(null, "No se Encontro el Elemento en la Lista");
} else {
    JOptionPane.showMessageDialog(null, "Elemento encontrado en la posición: " + (i - 1));
}
    }
}
