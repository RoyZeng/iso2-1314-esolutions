
package AgenteBD;

import java.sql.SQLException;
import java.util.Vector;

public class PruebaAgente {
    public static void main(String[] args){
        Vector resultado = new Vector();
        String SQL_insert_1 = "INSERT INTO Propietario VALUES ('12235625G','Perico','Palotes');";
        String SQL_insert_2 = "INSERT INTO Propietario VALUES ('85749623T','Enjuto','Mojamuto');";
        String SQL_insert_3 = "INSERT INTO Coche VALUES ('8975-CCR','12235625G','Citroen Xsara');";
        String SQL_insert_4 = "INSERT INTO Coche VALUES ('8775-LNH','12235625G','Audi');";
        String SQL_insert_5 = "INSERT INTO Coche VALUES ('4529-JUT','85749623T','Talbot');";
        String SQL_update = "UPDATE Propietario SET apellido='Palustres' WHERE nif='12235625G';";
        String SQL_delete = "DELETE FROM Coche WHERE propietario='85749623T';";
        String SQL_select = "SELECT nombre,apellido,matricula,modelo FROM Propietario,Coche "+
                            "WHERE propietario=nif AND nif='12235625G';";

        try{
            Agente.getAgente().delete("DELETE * FROM Propietario;");
            Agente.getAgente().insert(SQL_insert_1);
            Agente.getAgente().insert(SQL_insert_2);
            Agente.getAgente().insert(SQL_insert_3);
            Agente.getAgente().insert(SQL_insert_4);
            Agente.getAgente().insert(SQL_insert_5);
            Agente.getAgente().update(SQL_update);
            Agente.getAgente().delete(SQL_delete);
            resultado = Agente.getAgente().select(SQL_select);
            //C—digo para mostrar el resultado
            System.out.println(resultado.toString());

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
