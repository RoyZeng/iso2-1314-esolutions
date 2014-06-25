package dominio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import persistence.AgenteBD;

public class AgenteProducto {
	public void insertProducto(Producto producto){
		String sentence="INSERT INTO Producto VALUES ('"+producto.getId()+"','"+producto.getNombre()+"','"+producto.getCantidad()+"','"+producto.getTipo()+"','"+producto.getFecha()+"');";
		AgenteBD.getInstance().executeUpdate(sentence);
	}
	public void modifyProducto(Producto producto){
		String sentence="UPDATE Producto SET nombre = "+producto.getNombre()+" , cantidad =  "+producto.getCantidad()+" , tipo = "+producto.getTipo()+" , fecha = "+producto.getFecha()+" WHERE Id = "+producto.getId()+";";
		AgenteBD.getInstance().executeQuery(sentence);
	}
	public void removeProducto(Producto producto){
		String sentence="DELETE FROM Producto WHERE Id="+producto.getId()+";";
		AgenteBD.getInstance().executeQuery(sentence);
	}
	public Producto consultProducto(String Id){
		Producto userRet = null;
		String sentence="SELECT * FROM Producto WHERE Id='"+Id+"';";
		try {
			ResultSet rs= AgenteBD.getInstance().executeQuery(sentence);
			rs.first();
			userRet=new Producto(Integer.parseInt(rs.getString(1)),rs.getString(2),Integer.parseInt(rs.getString(3)),rs.getString(4),rs.getString(5));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userRet;
	}
	public ArrayList <Producto> consultAllProducto(){
		ArrayList <Producto> userRet = new ArrayList <Producto>();
		String sentence="SELECT * FROM Producto;";
		try {
			ResultSet rs= AgenteBD.getInstance().executeQuery(sentence);
			rs.first();
			while(!rs.isAfterLast()){
				userRet.add(new Producto(Integer.parseInt(rs.getString(1)),rs.getString(2),Integer.parseInt(rs.getString(3)),rs.getString(4),rs.getString(5)));
				rs.next();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userRet;
	}
	
}
