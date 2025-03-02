

package C.R.U.D;

import java.sql.*;
import javax.swing.JOptionPane;


public class conexion {
    
    //conectar base de datos//
    Connection conexion = null;
        private String usuario;
        private String contra;
        private String BD;
        private String IP;
        private String Puerto;
        //URL a conectar//
        String url = "jdbc:mysql://"+IP+":"+Puerto+"/"+BD;
    
        //Metodo para conectar//
    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contra);
            JOptionPane.showMessageDialog(null, "Conexion Satisfactoria","Completado!",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"Se perdio la conexion a la base de Datos","ERROR:",JOptionPane.ERROR_MESSAGE);
                               System.out.println("\nERROR:\nSe Perdio la Conexion a la Base de Datos\n"+e.getMessage());}
        return conexion;
    }
    
    
}
