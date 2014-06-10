import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class TestJUnit {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPrintHelloWorld() {
 
		Assert.assertEquals("Hello World", "Hello World");
 
	}

}
