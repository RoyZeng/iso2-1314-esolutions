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
	String url="jdbc:mysql://db4free.net/mercadona";
	String usuario="mercadona";
	String password="contraseña";
	conexion = DriverManager.getConnection (url,usuario,password);
		}catch(SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e){
			success=false;
			System.err.println("SQL CONEXION ERROR: "+e.toString());
		}
		return success;
	}
	
	public boolean executeQuery(String sentence){
		boolean success=true;
		try {
			// Creamos una sentencia SQL
			Statement sentenciaSQL = conexion.createStatement();
			// Ejecutamos la sentencia
			ResultSet res = sentenciaSQL.executeQuery(sentence);
			res.close();
				sentenciaSQL.close();
		} catch (SQLException e) {
			success=false;
			System.err.println("SQL CONEXION ERROR: "+e.toString());
		}
		return success;
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
