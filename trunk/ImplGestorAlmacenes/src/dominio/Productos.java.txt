package dominio;


public class Productos{
	public void insertProd(Producto p){
		String sentencia="INSERT INTO Almacen VALUES ("+p.getId()+", "+p.getNombre()+", "+p.getCantidad()+", "+
							p.getTipo()+", "+p.getFecha()+")";
		AgenteBD.getInstance().executeQuery(sentencia);					
	}
	public void modifyProd(int id,Producto p){
		String sentencia="UPDATE Almacen"
						+ " SET nombre='"+p.getNombre()+"', cantidad='"+p.getCantidad()+"', tipo='"+
				p.getTipo()+"', fecha='"+p.getFecha()+"'"
						+ "WHERE id="+p.getId();
        AgenteBD.getInstance().executeQuery(sentencia);	
	}
	public void deleteProd(int id){
		String sentencia="DELETE FROM Almacen"
				+ "WHERE id="+id;
        AgenteBD.getInstance().executeQuery(sentencia);	
					
	}
}

 class Producto {
	int id;
	String nombre;
	int cantidad;
	String tipo;
	String fecha;
	
	
	public Producto(int id, String nombre, int cantidad, String tipo,
			String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.tipo = tipo;
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
