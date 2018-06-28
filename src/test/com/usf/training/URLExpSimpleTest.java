package test.com.usf.training;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.usf.training.URLExpSimple;

public class URLExpSimpleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void test() {
		boolean canConnecttoURL = new URLExpSimple().isWebConnectionSuccessful("http://www.cs.utexas.edu/~scottm");
	    assertEquals(canConnecttoURL, true);
	}

}
