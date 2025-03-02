package C.R.U.D;

import java.sql.*;
import java.util.Scanner;

public class Consultas {
        //Atriutos
    private String nombre;
    private String apellido;
    private String puesto;
    private double salario;
    private int ID;
    
    //Metodos Get//

    public String getNombre() {return nombre;}
    
    public String getApellido(){return apellido;}

    public String getPuesto() {return puesto;}

    public double getSalario() {return salario;}
    
    public int getID() {return ID;}
    
    //Metodos Set//

    public void setNombre(String nombre) {
        try{
            //Verificar Valor Vacio u Otro Tipo de Dato
            if(nombre == null  || nombre.trim().isEmpty()){
                throw new IllegalArgumentException("El Nombre no debe ir vacio o ser nulo\n");
            }else{this.nombre = nombre.toUpperCase();}
        }catch(IllegalArgumentException e){System.out.println("\nERROR:\n"+e.getMessage());} 
    }
    
    public void setApellido(String Apellido){
        try{
            //Verificar valor Vacio/Nulo u Otro tipo de Dato
            if(Apellido == null || Apellido.trim().isEmpty()){
                throw new IllegalArgumentException("El Apellido No debe ir Vacio o Nulo\n");
            }else{this.apellido = Apellido.toUpperCase();}
        } catch(IllegalArgumentException e){System.out.println("\nERROR:\n"+e.getMessage());}
    }

    public void setPuesto(String puesto) {
        try{
            //Verificar Valores Vacios o de Otro Tipo de Dato
            if(puesto == null  || puesto.trim().isEmpty()){
                throw new IllegalArgumentException("El Puesto no debe ir vacio o ser nulo\n");
            }else{this.puesto = puesto.toUpperCase();}
        }catch(IllegalArgumentException e){System.out.println("\nERROR:\n"+e.getMessage());}
    }

    public void setSalario(String salario) {
        try{
            //Verificar Valor Mayor a 0 u Otro tipo de Dato
            Double nuevo_salario = Double.parseDouble(salario);
            if(nuevo_salario>0){this.salario = nuevo_salario;}
            else{ throw new NumberFormatException("Valor Negativo\n");} 
        }catch(NumberFormatException e){System.out.println("\nERROR:\nTipo de Valor no Permitido\n"+e.getMessage());}
    }
    //AGREGAR 'ID' A BUSCAR
    public void setID(String ID_strg) throws SQLException {
        try{
            //Verificar que el ID NO EXISTA u otro tipo de Dato
            int ID = Integer.parseInt(ID_strg);
            if(ID > 0){
                if(ID_existe(ID)){
                throw new IllegalArgumentException("ERROR:\nEL 'ID' YA EXISTE\n");
                }else{this.ID = ID;System.out.println("ID Asignado Correctamente\n");}
            }else{System.out.println("\nERROR:\nValor Negativo\n");}
        }catch(IllegalArgumentException e){System.out.println("\nERROR:\nValor no Permitido\n"+e.getMessage());}
    }
    //BUSCAR 'ID' EN TABLA EMPLEADOS
    private boolean ID_existe(int ID) throws SQLException{
        //Consulta para verificar ID
        boolean existe = false;
        String SQL = "SELECT COUNT(*) FROM empleados WHERE id_empleado = ?;";
        try{
            conexion conn = new conexion();
            PreparedStatement consulta = conn.conectar().prepareStatement(SQL);
            consulta.setInt(1, ID);
            try(ResultSet resultado = consulta.executeQuery()){
                if (resultado.next()) { existe = resultado.getInt(1) > 0; }
            }
        }catch(SQLException e){System.out.println("\nERROR:\n"+e.getMessage());}
        return existe;
    }
    //Metodo que Actualiza Atributo tipo String (nombre,apellido,puesto) de la Tabla Empleados
    private void ActualizarAtributo(String Atributo,int ID,String columna) throws SQLException{
        conexion conn = new conexion();
        try{
            //Reemplazar Atributo a Atualizar en cada Consulta de la Tabla Empleados//
            String actualizar = Atributo.toUpperCase();
            String columna_actualizar = columna.toLowerCase();
            String SQL = "UPDATE empleados SET "+columna_actualizar+" = ? WHERE id_empleado = ?;";
            CallableStatement consulta = conn.conectar().prepareCall(SQL);
            //Pasar Atributos a la Consulta
            consulta.setString(1,actualizar);
            consulta.setInt(2,ID);
            consulta.execute();
            System.out.println(columna.toUpperCase()+": Actualizado Correctamente!\n");
        } catch(NumberFormatException e){System.out.println("\nERROR al ACTUALIZAR: "+columna+"\n"+e.getMessage());}
    }
    //Metodo que Actualiza Atributo tipo Double (Salario) de la Tabla Empleados
    private void ActualizarAtributo(double salario,int ID) throws SQLException{
        conexion conn = new conexion();
        try{
            String SQL = "UPDATE empleados SET salario = ? WHERE id_empleado = ?;";
            CallableStatement consulta = conn.conectar().prepareCall(SQL);
            //Pasar Atributos a Consulta
            consulta.setDouble(1, salario);
            consulta.setInt(2,ID);
            consulta.execute();
            System.out.println("SALARIO: Actualizado Correctamente!\n");
        } catch(NumberFormatException e){System.out.println("\nERROR al ACTUALIZAR Salario\n"+e.getMessage());}
    }
    
    
    
    
    
    //Metodos CRUD//
    //(CREATE)//
    public void Insertar() throws SQLException {
        conexion conn = new conexion();
    Scanner leer = new Scanner(System.in); 
    System.out.println("\n------------------\n" 
            +            "INSERTAR-EMPLEADOS\n"
            +            "------------------"); 
    System.out.print("\n-Ingresa el 'ID' del Empleado: "); 
        String nuevo_ID = leer.nextLine(); 
        setID(nuevo_ID); 
    System.out.print("\n-Ingresa el Nombre: "); 
        String nuevo_nombre = leer.nextLine(); 
        setNombre(nuevo_nombre); 
    System.out.print("\n-Ingresa el Apellido: ");
        String nuevo_apellido = leer.nextLine();
        setApellido(nuevo_apellido);
    System.out.print("\n-Ingresa el Puesto: "); 
       String nuevo_puesto = leer.nextLine(); 
       setPuesto(nuevo_puesto); 
    System.out.print("\n-Ingresa el Salario: "); 
       String nuevo_salario = leer.nextLine(); 
       setSalario(nuevo_salario); 
    String SQL = "INSERT INTO empleados(id_empleado, nombre, apellido, puesto, salario) VALUES(?, ?, ?, ?, ?)"; 
    try (CallableStatement consulta = conn.conectar().prepareCall(SQL)) {
        consulta.setInt(1, getID()); 
        consulta.setString(2, getNombre()); 
        consulta.setString(3, getApellido()); 
        consulta.setString(4, getPuesto()); 
        consulta.setDouble(5, getSalario()); 
        consulta.execute(); 
        System.out.println("Registro Insertado Correctamente!\n"); } 
    catch (SQLException e) { System.out.println("\nERROR AL INSERTAR REGISTRO EN EMPLEADOS!\n" + e.getMessage()); }
    }
    
    //(UPDATE)//
   public void Modificar() throws SQLException{
       Scanner leer = new Scanner(System.in);
       System.out.println("\n--------------------\n"
               +            "ACTUALIZAR-EMPLEADOS\n"
               +            "--------------------");
       System.out.print("Ingresa un 'ID' de Empleado: ");
       String ID_str = leer.nextLine();
       try{
           int ID = Integer.parseInt(ID_str);
           if(ID > 0){
               //Verificar que SI EXISTA ID//
             if(ID_existe(ID)){
                 //Menu con Campos para Actualizar
               this.ID = ID;
               boolean terminar = true;
               while(terminar){
               System.out.println("\nEmpleado con 'ID': "+getID());
               System.out.println("\nQue Campo Deseas Actualizar?");
               System.out.println("\n1- Nombre.\n"
                       +            "2- Apellido.\n"
                       +            "3- Puesto.\n"
                       +            "4- Salario.\n"
                       +            "5- SALIR.\n");
               System.out.print("Elige una opcion: ");
               String opc = leer.nextLine();
               try{
                   int aux = Integer.parseInt(opc);
                   //Actualizar Dependiendo la Columna de Tabla Empleados//
                   String columna;
                   switch(aux){
                       case 1:
                           columna = "Nombre";
                           System.out.print("Ingresa el nuevo Nombre: ");
                           String nombre = leer.nextLine();
                           if(nombre == null || nombre.trim().isEmpty()){
                               System.out.println("\nNo deben ir Campos Vacios\n");
                               break;
                           }else{
                               setNombre(nombre);
                               ActualizarAtributo(getNombre(),getID(),columna);
                               break;
                           }                   
                       case 2:
                           columna = "Apellido";
                           System.out.print("Ingresa el nuevo Apellido: ");
                           String apellido = leer.nextLine();
                           if(apellido == null || apellido.trim().isEmpty()){
                               System.out.println("\nNo deben ir Campos Vacios\n");
                               break;
                           }else{
                               setApellido(apellido);
                               ActualizarAtributo(getApellido(),getID(),columna);
                               break;
                           }
                       case 3:
                           columna = "Puesto";
                           System.out.print("Ingresa el nuevo Puesto: ");
                           String puesto = leer.nextLine();
                           if(puesto == null || puesto.trim().isEmpty()){
                               System.out.println("\nNo deben ir Campos Vacios\n");
                               break;
                           }else{
                               setPuesto(puesto);
                               ActualizarAtributo(getPuesto(),getID(),columna);
                               break;
                           }
                       case 4:
                           System.out.print("Ingresa el nuevo Salario: ");
                           String salario_str = leer.nextLine();
                           if(salario_str == null || salario_str.trim().isEmpty()){
                               System.out.println("\nNo deben ir Campos Vacios\n");
                               break;
                           }else{
                               setSalario(salario_str);
                               ActualizarAtributo(getSalario(),getID());
                               break;
                           }
                       case 5:
                           System.out.println("\nSaliendo de Actualizar Empleado...\n");
                           terminar = false;
                           break;
                       default:
                           System.out.println("\nOpcion no Valida\n");
                           break;
                   }
                }catch(NumberFormatException e){System.out.println("\nERROR:\nValor no Permitido\n"+e.getMessage());}
              }
           }else{System.out.println("\nNO EXISTE REGISTRO CON ESE 'ID'!\n");}
             
           }else{System.out.println("\nERROR:\nValor Negativo\n");}
       }catch(NumberFormatException e){System.out.println("\nERROR:\n"+e.getMessage());}
   }
   //DELETE//
   public void Eliminar() throws SQLException{
       conexion conn = new conexion();
       Scanner leer = new Scanner(System.in);
      
       System.out.println("\n------------------\n"
               +            "ELIMINAR-EMPLEADOS\n"
               +            "------------------");
       System.out.print("Ingresa el 'ID' del Empleado a Eliminar: ");
       String ID_str = leer.nextLine();
       try{
           int ID = Integer.parseInt(ID_str);
           if(ID > 0){
               //Verificar que EXISTA el ID
               if(ID_existe(ID)){
                   this.ID = ID;
                   //Verificar Eliminacion
                   System.out.println("\nSeguro de Eliminar al Empleado con 'ID' = "+getID());
                   System.out.println("1- SI.\n2- NO.");
                   System.out.print("Elige una Opcion: ");
                   String opc = leer.nextLine();
                   try{
                       int aux = Integer.parseInt(opc);
                       switch(aux){
                           case 1:
                               String SQL = "DELETE FROM empleados WHERE id_empleado = ?;";
                               try{
                                   //Pasar Atributo ID a la consulta
                                   CallableStatement consulta = conn.conectar().prepareCall(SQL);
                                   consulta.setInt(1,getID());
                                   consulta.execute();
                                   System.out.println("\nRegistro Eliminado Correctamente!\n");
                               }catch(SQLException e){System.out.println("\nERROR AL ELIMINAR REGISTRO\n"+e.getMessage());}
                               break;
                           case 2:
                               System.out.println("\nSaliendo de Eliminar Empleados...");
                               break;
                           default:
                               System.out.println("\nOpcion No Valida\n");
                               break;
                       }
                   }catch(NumberFormatException e){System.out.println("\nValor no Perimitido!\n"+e.getMessage());}
               }else{System.out.println("\nERROR:\n'ID' INEXISTENTE\n");}
           }else{System.out.println("\nERROR:\nValor Negativo\n");}
       } catch(NumberFormatException e){System.out.println("\nERROR:\nTipo de Valor No Permitido\n"+e.getMessage());}
   }
    //READ//
   public void Mostrar() throws SQLException{
       conexion conn = new conexion();
       String SQL = "SELECT id_empleado,nombre,apellido,puesto,salario FROM empleados;";
       //ejecutar solo al realizar consulta
       try(PreparedStatement consulta = conn.conectar().prepareStatement(SQL);
           ResultSet resultado = consulta.executeQuery()){
           System.out.println("\nTABLA EMPLEADOS:\n");
           while(resultado.next()){
               //imprimir campos
               int id = resultado.getInt("id_empleado");
               String nombres = resultado.getString("nombre");
               String apellidos = resultado.getString("apellido");
               String puestos = resultado.getString("puesto");
               double salarios = resultado.getDouble("salario");
               
               System.out.println("ID: "+id+" | Nombre: "+nombres+" | Apellido: "+apellidos+" | Puesto: "+puestos+" | Salario: "+salarios);
           }  
       }catch(SQLException e){System.out.println("\nERROR AL MOSTRAR EMPLEADOS!\n"+e.getMessage());}
   }
    
}