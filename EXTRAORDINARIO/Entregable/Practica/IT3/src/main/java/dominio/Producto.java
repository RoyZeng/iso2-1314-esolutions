package dominio;

 public class Producto {
	private int id;
	private String nombre;
	private int cantidad;
	private String tipo;
	private String fecha;
	
	
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
