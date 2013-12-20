package dominio;

import java.sql.ResultSet;
import java.sql.SQLException;

import persistence.AgenteBD;

public class AgenteUsuario {
public void insertUsuario(Usuario user){
	String sentence="INSERT INTO Usuarios VALUES ("+user.getDNI()+","+user.getNombre()+","+user.getApellido1()+","+user.getApellido2()+","+user.getPassword()+")";
	AgenteBD.getInstance().executeQuery(sentence);
}
public void modifyUsuario(Usuario user){
	String sentence="UPDATE Usuarios SET Nombre = "+user.getNombre()+" , Apellido1 =  "+user.getApellido1()+" , Apellido2 = "+user.getApellido2()+" , Password = "+user.getPassword()+" WHERE DNI = "+user.getDNI()+";";
	AgenteBD.getInstance().executeQuery(sentence);
}
public Usuario consultUsuario(String DNI){
	Usuario userRet = null;
	String sentence="SELECT * FROM Usuarios WHERE DNI='"+DNI+"';";
	try {
		ResultSet rs= AgenteBD.getInstance().executeQuery(sentence);
		rs.first();
		userRet=new Usuario(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return userRet;
}
public void removeUsuario(Usuario user){
	String sentence="DELETE FROM Usuarios WHERE DNI="+user.getDNI()+";";
	AgenteBD.getInstance().executeQuery(sentence);
}
}
