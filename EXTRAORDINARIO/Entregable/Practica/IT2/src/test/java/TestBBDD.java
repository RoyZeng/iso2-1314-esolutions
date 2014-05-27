import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import persistence.AgenteBD;

public class TestBBDD {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBBDD() {
		AgenteBD.getInstance().executeQuery("USE sql341597;");
		AgenteBD.getInstance().executeQuery("DROP *;");
		AgenteBD.getInstance().executeQuery("CREATE TABLE `test` (`test` INT NULL ) COLLATE='latin1_swedish_ci' ENGINE=InnoDB;");
		AgenteBD.getInstance().executeQuery("INSERT INTO test VALUES (9999);");
		ResultSet query= AgenteBD.getInstance().executeQuery("SELECT * from test;");
		try {
			query.first();
			Assert.assertEquals(query.getInt(1), 9999);
		} catch (SQLException e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void testlogin() {
		AgenteBD.getInstance().executeQuery("USE sql341597;");
		AgenteBD.getInstance().executeQuery("CREATE TABLE `user` (`user` INT NULL ,`pass` INT NULL ) COLLATE='latin1_swedish_ci' ENGINE=InnoDB;");
		AgenteBD.getInstance().executeQuery("INSERT INTO user VALUES (05713540,9999);");
		ResultSet query= AgenteBD.getInstance().executeQuery("SELECT * from user WHERE dni=05713540;");
		try {
			query.first();
			Assert.assertEquals(query.getInt(1), 9999);
		} catch (SQLException e) {
			fail(e.toString());
		}
	}
	

}
