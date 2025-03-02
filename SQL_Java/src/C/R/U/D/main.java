
package C.R.U.D;

import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws SQLException {
        boolean terminar = true;
        //Instancia con Metodos C.R.U.D.//
        Consultas empleado = new Consultas();
        Scanner leer = new Scanner(System.in);
        
        
        while(terminar){
        System.out.println("\n--------------\n"
                +            "MENU PRINCIPAL\n"
                +            "--------------");
        System.out.println("1- Insertar Empleado.");
        System.out.println("2- Consultar Empleados.");
        System.out.println("3- Actualizar Empleado.");
        System.out.println("4- Eliminar Empleado.");
        System.out.println("5- SALIR.");
        System.out.print("Elige una opcion: ");
        String opc = leer.nextLine();
        try{
            int aux = Integer.parseInt(opc);
            switch(aux){
                
                case 1:
                    //CREATE//
                    empleado.Insertar();
                    break;
                case 2:
                    //READ//
                    empleado.Mostrar();
                    break;
                case 3:
                    //UPDATE//
                    empleado.Modificar();
                    break;
                case 4:
                    //DELETE//
                    empleado.Eliminar();
                    break;
                case 5:
                    System.out.println("\nCerrando Programa...");
                    terminar = false;
                    break;
                default:
                    System.out.println("Opcion no Valida!\n");
                    break;
            }
            //Controlar Datos de Otro Tipo
        }catch(NumberFormatException e){System.out.println("\nERROR:\nValor No Permitido\n"+e.getMessage());}
        }
    }
}
