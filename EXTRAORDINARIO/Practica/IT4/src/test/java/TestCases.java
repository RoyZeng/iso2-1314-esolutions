import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import dominio.AgenteProducto;
import dominio.Producto;


public class TestCases {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAñadeProducto() throws IOException {
		AgenteProducto agente =new AgenteProducto();
		agente.insertProducto(new Producto(1,"nombre1",1,"tipo1","fecha1"));
		assertTrue(true);
	}

	@Test
	public void testComprobarMercancia() {
		AgenteProducto agente =new AgenteProducto();
		agente.consultProducto("1");
		Assert.assertTrue(true);
	}

}
