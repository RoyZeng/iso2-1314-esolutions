package dominio;

import persistence.AgenteBD;

public class AgenteUsuario {
public void insertUsuario(Usuario user){
	String sentence="INSERT INTO Usuario VALUES ("+user.getDNI()+","+user.getNombre()+","+user.getApellido1()+","+user.getApellido2()+","+user.getPassword()+")";
	AgenteBD.getInstance().executeQuery(sentence);
}
public void modifyUsuario(Usuario user){
	String sentence="UPDATE Usuario SET Nombre = "+user.getNombre()+" , Apellido1 =  "+user.getApellido1()+" , Apellido2 = "+user.getApellido2()+" , Password = "+user.getPassword()+" WHERE DNI = "+user.getDNI()+";";
	AgenteBD.getInstance().executeQuery(sentence);
}
public void removeUsuario(Usuario user){
	String sentence="DELETE FROM Usuario WHERE DNI="+user.DNI+";";
	AgenteBD.getInstance().executeQuery(sentence);
}
}
