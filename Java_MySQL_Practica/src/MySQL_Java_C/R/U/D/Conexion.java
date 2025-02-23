
package MySQL_Java_C.R.U.D;
// Importar Coneccion descargada
 
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    //Crear Variale para Conexion
    Connection conn = null;
    //Iniciar Sesion
    String Usuario = "usuario";
    String Contra = "contra";
    String BD = "escuela";
    String Puerto = "puerto";
    String IP = "localhost";
    // Crear Cadena de Conexion
    String cadena ="jdbc:mysql://"+IP+":"+Puerto+"/"+BD;
    
    //Crear Funcion para Conectarse
    public Connection conectar(){
        try{
            //Buscar Driver Class Descargado
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(cadena,Usuario,Contra);
        JOptionPane.showMessageDialog(null, "Conexion Satisfactoria");
    }catch (Exception ex){
        JOptionPane.showMessageDialog(null, "ERROR: "+ex.toString()+" Conexion Interrumpida a BD ","ERROR 404",JOptionPane.ERROR_MESSAGE);
    }
    return conn;    
    }
}
