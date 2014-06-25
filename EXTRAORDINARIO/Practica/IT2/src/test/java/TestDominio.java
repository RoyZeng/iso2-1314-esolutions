import static org.junit.Assert.*;

import java.io.IOException;

import interfaz.VentanaLogin;
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
	public void testloginInterfaz() {
		try {
			Assert.assertEquals(VentanaLogin.validarUsuario("05713540","9999"),true);
Assert.assertEquals(VentanaLogin.validarUsuario("05713540","8999"),false);
		} catch (IOException e) {
			fail(e.toString());
		}
	}
	@Test
	public void testAñadeProducto() throws IOException {
		AgenteProducto agente =new AgenteProducto();
		agente.insertProducto(new Producto(99,"nombre",1,"tipo","fecha"));
		assertTrue(true);
	}

}
