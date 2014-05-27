package persistence;
import java.sql.*;


public class AgenteBD {
	
	private Connection conexion;
	
	
	//SINGLETON 
	private static AgenteBD instance;
	public static AgenteBD getInstance(){
		if(instance==null){
			instance=new AgenteBD();
			instance.connect();
		}
		return instance;
	}
	
	private boolean connect(){
	boolean success=true;
		try{
	// Cargamos el driver JDBC para MySQL
	String controlador = "com.mysql.jdbc.Driver";
	Class.forName(controlador).newInstance();
	// Conectamos con la BD
	String url="jdbc:mysql://sql3.freemysqlhosting.net";
	String usuario="sql341597";
	String password="eT4%lL5!";
	conexion = DriverManager.getConnection (url,usuario,password);
		}catch(SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e){
			success=false;
			System.err.println("SQL CONEXION ERROR: "+e.toString());
		}
		return success;
	}
	
	public ResultSet executeQuery(String sentence){
		ResultSet res = null;
		try {
			// Creamos una sentencia SQL
			Statement sentenciaSQL = conexion.createStatement();
			// Ejecutamos la sentencia
			sentenciaSQL.executeQuery("USE sql341597;");
			res = sentenciaSQL.executeQuery(sentence);
		} catch (SQLException e) {
			System.err.println("SQL CONEXION ERROR: "+e.toString());
		}
		return res;
	}
	
	public boolean close(){
		boolean success=true;
		try {
			conexion.close();
		} catch (SQLException e) {
			success=false;
			System.err.println("SQL CONEXION ERROR: "+e.toString());
		}
		return success;
	}

}
