import static org.junit.Assert.*;
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
	public void testAviso() {
		AgenteProducto agente =new AgenteProducto();
		Producto prod= agente.consultProducto("50");
		Assert.assertTrue("No esta implementado pero funcionaria asi y de forma correcta",prod.getCantidad()>99);
	}

}
