package agente;

import java.sql.*;
import java.util.*;
import java.util.Vector;

public class Agente {
	protected static Agente mInstancia = null;
	protected static Connection mBD;

	// Constructor
	private Agente() throws Exception {
		Agente.conectar();
	}

	public static Agente getAgente() throws Exception {
		if (mInstancia == null) {
			mInstancia = new Agente();
		}
		return mInstancia;
	}

	public boolean login() {
		boolean in = false;
		String nombreUsuario, contrasena;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Introduzca el nombre de usuario:");
		nombreUsuario = sc.next();
		System.out.println("Introduzca la contraseña");
		contrasena = sc.next();
		int numColumnas = 0;
		try {
			Agente.conectar();
			PreparedStatement sentence = mBD
					.prepareStatement("SELECT login, passw FROM Cliente");
			ResultSet respuesta = sentence.executeQuery();
			while (respuesta.next()) {
				if (nombreUsuario.equals(respuesta.getString("login"))) {
					if (contrasena.equals(respuesta.getString("passw"))) {
						in = true;
					}
				}
			}
			Agente.desconectar();
			sc.close();
			return in;
		} catch (Exception e) {
			System.out.println("Fallo de autenticación");
		}
		throw new UnsupportedOperationException();
	}

	public static void conectar() throws Exception {
		String url = "jdbc:odbc:nombreODBC";
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		Class.forName(driver);
		mBD = DriverManager.getConnection(url, "login", "password");
	}

	public static void desconectar() throws Exception {
		mBD.close();
	}

	public int insert(String SQL) throws SQLException, Exception {
		PreparedStatement sentencia = mBD.prepareStatement(SQL);
		return sentencia.executeUpdate();
	}

	public Vector select(String SQL) throws SQLException, Exception {
		int numColumnas = 0;
		Vector resultado = new Vector();
		Vector registro = new Vector();
		// Creamos la consulta y la lanzamos contra la BD
		PreparedStatement sentencia = mBD.prepareStatement(SQL);
		ResultSet respuesta = sentencia.executeQuery();
		// Obtenemos metainformaci—n del resultado de la consulta
		ResultSetMetaData rsmd = respuesta.getMetaData();
		numColumnas = rsmd.getColumnCount();
		// Al ejecutar "next()", el objeto ResultSet apunta al siguiente
		// registro, y la primera vez, apunta al primer registro de todos.
		while (respuesta.next()) {
			// Por cada registro inicializamos el vector registro
			registro = new Vector();
			// Dentro del While, vamos a procesar uno a uno los registros
			// Muy importante, empezamos a contar desde la posici—n 1, si
			// buscamos
			// en la posici—n 0 de los registros del ResultSet dar‡ un error
			for (int i = 1; i <= numColumnas; i++) {
				// En este switch controlamos el tipo de cada uno de las
				// columnas del
				// registro, y segoen el tipo, utilizamos un mŽtodo y otro de la
				// clase
				// ResultSet para extraer el dato.
				// Para simplificar, podemos poner s—lo los tipos de dato que
				// tenemos
				// en la BD de ejemplo de la pr‡ctica
				switch (rsmd.getColumnType(i)) {
				case Types.INTEGER:
					registro.add(new Integer(respuesta.getInt(i)));
					break;
				case Types.VARCHAR:
					registro.add(respuesta.getString(i));
					break;
				case Types.DOUBLE:
					registro.add(new Double(respuesta.getDouble(i)));
					break;
				}
			}
			// Al terminar de procesar cada registro, lo almacenamos en el
			// vector resultado
			resultado.add(registro);
		}
		// Al terminar, ya hemos procesado todos los registros del ResultSet,
		// los tenemos
		// en el vector, y podemos cerrar todos los punteros que hay hacia la BD
		// y
		// desconectar de la BD
		respuesta.close();
		sentencia.close();
		desconectar();
		return resultado;
	}

	public int delete(String SQL) throws SQLException, Exception {
		PreparedStatement sentencia = mBD.prepareStatement(SQL);
		return sentencia.executeUpdate();
	}

	public int update(String SQL) throws SQLException, Exception {
		PreparedStatement sentencia = mBD.prepareStatement(SQL);
		return sentencia.executeUpdate();
	}
}
