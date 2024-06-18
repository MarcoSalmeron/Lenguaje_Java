
package proyecto;

public class PROYECTO {


    public static void main(String[] args) {
        
         //atributos a compartir//
    String Titulo = null;
    String Prioridad = null;
    String Descripcion = null;
        
         Ventana ventana = new Ventana(Titulo, Prioridad, Descripcion);
         ventana.setVisible(true);
         ventana.setResizable(false);
         ventana.setLocationRelativeTo(null);
    }
    
}
