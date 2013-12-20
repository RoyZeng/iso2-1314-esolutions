package main.java.org.modulo1;

public class Usuario {
	private String DNI,nombre,apellido1,apellido2,password;

	public Usuario (String DNI, String nombre, String apellido1,String apellido2,String pass){
		this.DNI=DNI;
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.password=pass;
	}
	public String getApellido2() {
		return apellido2;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public String getPassword() {
		return password;
	}
	public boolean equals(Usuario user2){
		boolean equals=true;
		equals=getDNI().equals(user2.getDNI())&&equals;
		equals=getNombre().equals(user2.getNombre())&&equals;
		equals=getApellido1().equals(user2.getApellido1())&&equals;
		equals=getApellido2().equals(user2.getApellido2())&&equals;
		equals=getPassword().equals(user2.getPassword())&&equals;

		return equals;
	}

}
