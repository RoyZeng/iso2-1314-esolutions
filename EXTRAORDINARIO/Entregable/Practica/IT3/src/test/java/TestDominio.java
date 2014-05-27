import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import dominio.AgenteProducto;
import dominio.Producto;


public class TestDominio {

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testAñadeProducto() throws IOException {
		AgenteProducto agente =new AgenteProducto();
		agente.removeProducto(new Producto(0,"nombre",1,"tipo","fecha"));
		assertTrue(true);
	}

	@Test
	public void testConsultaAlmacen() {
		AgenteProducto agente =new AgenteProducto();
		agente.consultAllProducto();
		Assert.assertTrue(true);
	}
	

}
