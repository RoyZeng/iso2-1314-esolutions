
package dominio;
import persistence.AgenteBD;

public class Historial {


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

