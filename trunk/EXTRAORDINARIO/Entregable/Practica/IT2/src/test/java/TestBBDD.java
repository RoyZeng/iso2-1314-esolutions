import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import dominio.Producto;
import persistence.AgenteBD;

public class TestBBDD {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBBDD() {
		Producto userRet = null;
		String sentence="SELECT * FROM test;";
		try {
			ResultSet rs= AgenteBD.getInstance().executeQuery(sentence);
			rs.first();
			String resultado = rs.getString(1);
			Assert.assertEquals(resultado, "9999");
		} catch (SQLException e) {
			fail(e.toString());
		}

		
	}

}
