package dominio;

import persistence.AgenteBD;

public class AgenteProducto {
	public void insertProducto(Producto producto){
		String sentence="INSERT INTO Producto VALUES ("+producto.getNombre()+","+producto.getCantidad()+","+producto.getTipo()+","+producto.getFecha()+")";
		AgenteBD.getInstance().executeQuery(sentence);
	}
	public void modifyProducto(Producto producto){
		String sentence="UPDATE Producto SET nombre = "+producto.getNombre()+" , cantidad =  "+producto.getCantidad()+" , tipo = "+producto.getTipo()+" , fecha = "+producto.getFecha()+" WHERE Id = "+producto.getId()+";";
		AgenteBD.getInstance().executeQuery(sentence);
	}
	public void removeProducto(Producto producto){
		String sentence="DELETE FROM Producto WHERE Id="+producto.getId()+";";
		AgenteBD.getInstance().executeQuery(sentence);
	}
	
}
