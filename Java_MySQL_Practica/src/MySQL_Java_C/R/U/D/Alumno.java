
package MySQL_Java_C.R.U.D;

import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Alumno {
    private int clave;
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private double calificacion;

    //Funcion Get para los Atributos
    public int getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    public String getGenero() {
        return genero;
    }
    
    public double getCalificacion() {
        return calificacion;
    }
    
    //Funcion Set para los Atributos
    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    
//Metodo para Insertar Alumnos:
public void Insertar(JTextField nombre, JTextField apellido, JTextField edad, JTextField genero, JTextField calificacion){
    //llamar Funciones SET y traer el text field
    setNombre(nombre.getText());
    setApellido(apellido.getText());
    setEdad(Integer.parseInt(edad.getText()));
    setGenero(genero.getText());
    setCalificacion(Double.parseDouble(calificacion.getText()));
    
    Conexion conexion = new Conexion();
    
    //Crear Consulta en Bd:
    String sql = "INSERT INTO estudiantes(nombre , apellido , edad, genero, calificacion) VALUES(?,?,?,?,?);";
    try{
        //preparar Consulta al metodo para conexion en subclase
        CallableStatement cs = conexion.conectar().prepareCall(sql);
        //Pasar String dependiendo la posicion de Valores
        cs.setString(1,getNombre());
        cs.setString(2, getApellido());
        cs.setInt(3, getEdad());
        cs.setString(4, getGenero());
        cs.setDouble(5, getCalificacion());
        cs.execute();
        JOptionPane.showMessageDialog(null, "Inserccion de Datos Satisfactoria!!!", "Consulta Realizada",JOptionPane.INFORMATION_MESSAGE);
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "No se Agrego el Alumno ERROR:"+e.toString(), "Consulta Fallida...",JOptionPane.ERROR_MESSAGE);
    }
}

//Metodo para Mostrar Tabla de Alumnos
public void Mostrar(JTable Alumno){
    Conexion conexion = new Conexion();
    //Crear Formato de la tabla en el JPanel
    DefaultTableModel modelo = new DefaultTableModel();
    TableRowSorter <TableModel> ordenartabla = new TableRowSorter<TableModel>(modelo);
    Alumno.setRowSorter(ordenartabla);
    
    //Crear Consulta para la tabla a mostrar
    String sql = "SELECT * FROM estudiantes;";
    
    //Definir columnas de la tabla
    modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Edad");
    modelo.addColumn("Genero");
    modelo.addColumn("Calificacion");
    //Iterar Datos dependiendo la cantidad de columnas en la tabla
    String[] datos = new String[6];
    Statement st;
    try{
        st = conexion.conectar().createStatement();
        ResultSet rs = st.executeQuery(sql);
        //Iterar Datos sobre cada elemento en la tabla
        while(rs.next()){
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            datos[2] = rs.getString(3);
            datos[3] = rs.getString(4);
            datos[4] = rs.getString(5);
            datos[5] = rs.getString(6);
            modelo.addRow(datos);
        }
        //Pasar Modelo con Datos ya Iterados al JTable
        Alumno.setModel(modelo);
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"ERROR: "+ex+"\nNo se pudo Mostrar los Registros...","ERROR",JOptionPane.ERROR_MESSAGE);
    }
}

//metodo para Seleccionar Elementos de mi Tabla
public void Seleccionar(JTable Alumno,JTextField ID, JTextField Nombre, JTextField Apellido, JTextField Edad, JTextField Genero, JTextField Calificacion) {
    
    try{
        int fila = Alumno.getSelectedRow();
        if (fila >= 0) {
           ID.setText(Alumno.getValueAt(fila,0).toString());
           Nombre.setText(Alumno.getValueAt(fila, 1).toString());
           Apellido.setText(Alumno.getValueAt(fila, 2).toString());
           Edad.setText(Alumno.getValueAt(fila, 3).toString());
           Genero.setText(Alumno.getValueAt(fila, 4).toString());
           Calificacion.setText(Alumno.getValueAt(fila, 5).toString());
        } else {
            JOptionPane.showMessageDialog(null,"Fila no Seleccionada","Advertencia!",JOptionPane.WARNING_MESSAGE);
        }
} catch(Exception ex){
    JOptionPane.showMessageDialog(null, "ERROR: "+ex+"\nNo se pudo Seleccionar la Fila...","ERROR",JOptionPane.ERROR_MESSAGE);
}   
}

//Metodo para Modificar Atributos de la Tabla
public void Modificar(JTextField ID, JTextField Nombre, JTextField Apellido, JTextField Edad, JTextField Genero, JTextField Calificacion) {
    Conexion conexion = new Conexion();
    setClave(Integer.parseInt(ID.getText()));
    setNombre(Nombre.getText());
    setApellido(Apellido.getText());
    setEdad(Integer.parseInt(Edad.getText()));
    setGenero(Genero.getText());
    setCalificacion(Double.parseDouble(Calificacion.getText()));
    
    //Crear Consulta en BD
    String sql = "UPDATE estudiantes SET estudiantes.nombre = ? , estudiantes.apellido = ?, estudiantes.edad = ?, estudiantes.genero = ?, estudiantes.calificacion = ? WHERE estudiantes.id_estudiante = ?;";
    try{
    //Crear Argumento para ejecutar consulta sql
    CallableStatement cs = conexion.conectar().prepareCall(sql);
    //Pasar Valores a la Consulta
    cs.setString(1, getNombre());
    cs.setString(2, getApellido());
    cs.setInt(3, getEdad());
    cs.setString(4, getGenero());
    cs.setDouble(5, getCalificacion());
    cs.setInt(6, getClave());
    cs.execute();
    JOptionPane.showMessageDialog(null, "Se Modifico el Alumno!", "Consulta Exitosa",JOptionPane.INFORMATION_MESSAGE);
    
    } catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Error: "+ex+"\nNo se modifico el Alumno","ERROR", JOptionPane.ERROR_MESSAGE);      
    }
}

//Metodo para Eliminar
public void Eliminar(JTextField ID) {
    Conexion conexion = new Conexion();
    setClave(Integer.parseInt(ID.getText()));
    
    String sql = "DELETE FROM estudiantes WHERE estudiantes.id_estudiante = ?;";
    try{
        CallableStatement cs = conexion.conectar().prepareCall(sql);
        cs.setInt(1, getClave());
        cs.execute();
        JOptionPane.showMessageDialog(null,"Alumno Eliminado Correctamente!","Consulta Realizada",JOptionPane.INFORMATION_MESSAGE);
    } catch(Exception ex){
        JOptionPane.showMessageDialog(null, "ERROR: "+ex+"\nNo se Elimino el Alumno","ERROR",JOptionPane.ERROR_MESSAGE);
    }
}

//Metodo para Limpiar JTextField
public void Limpiar(JTextField ID, JTextField Nombre, JTextField Apellido, JTextField Edad, JTextField Genero, JTextField Calificacion) {
    ID.setText("");
    Nombre.setText("");
    Apellido.setText("");
    Edad.setText("");
    Genero.setText("");
    Calificacion.setText("");
}
}
