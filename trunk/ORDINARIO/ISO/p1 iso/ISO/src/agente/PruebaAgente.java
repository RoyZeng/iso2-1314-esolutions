package agente;
import java.sql.SQLException;
import java.util.Vector;


public class PruebaAgente {
    public static void main(String[] args){
        
        
        String SQL_insert_1 = "INSERT INTO Cliente VALUES ('jgh13','pass12');";
        String SQL_insert_2 = "INSERT INTO Cliente VALUES ('reshu23','contrasena');";
        String SQL_insert_3 = "INSERT INTO Cliente VALUES ('olakase','111111t');";
              
        try{
           Agente.getAgente().delete("DELETE * FROM Cliente");
            Agente.getAgente().insert(SQL_insert_1);
           Agente.getAgente().insert(SQL_insert_2);
           Agente.getAgente().insert(SQL_insert_3);
          boolean log=Agente.getAgente().login();
          if(log){
        	  System.out.println("Acceso concedido");
          }
          else{
        	  System.out.println("Acceso denegado");
          }
           Agente.desconectar();
        }
        catch(SQLException sqle){
            //Gesti—n de excepciones de la base de datos
            System.out.println("excepcion sqle");
            return;            
        }
        catch(Exception e){
            //Gesti—n de excepciones
            System.out.println("No se pudo cargar el puente JDBC-ODBC");
            return;
        }
    }
}