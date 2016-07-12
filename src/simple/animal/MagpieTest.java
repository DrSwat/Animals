package simple.animal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import general.Animal.Sex;

public class MagpieTest {
	
	private static final double DELTA = 0.0001;
	Magpie magpie0 = new Magpie(.005, 1, Sex.female, 10, 10, 50, true, 3, 10);
	Magpie magpie1 = new Magpie(.005, 1, Sex.female, 10, 10, 50, true, 3, 10);
	Magpie magpie2 = new Magpie(.005, 1, Sex.female, 10, 10, 50, true, 3, 10);
	Magpie magpie3 = new Magpie(.005, 1, Sex.female, 10, 10, 50, true, 3, 1);
	Magpie magpie4 = new Magpie(.0005, 1, Sex.female, 10, 10, 50, true, 3, 10);

	Ant ant0 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
	Ant ant1 = new Ant(.00050, 1, Sex.male, 4, 1, 1);
	Ant ant2 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
	Ant ant3 = new Ant(.00150, 1, Sex.male, 4, 1, 2);
	Ant ant4 = new Ant(.00150, 1, Sex.male, 4, 1, 1);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCanKill() {
		assertTrue(magpie0.canKill(ant0));
		assertTrue(magpie1.canKill(ant1));
		assertTrue(magpie2.canKill(ant2));
		assertFalse(magpie3.canKill(ant3));
		assertFalse(magpie4.canKill(ant4));

	}
	

	@Test
	public void testKill() {
		magpie0.kill(ant0);
		magpie1.kill(ant1);
		magpie2.kill(ant2);
		magpie3.kill(ant3);
		magpie4.kill(ant4);
		assertEquals(.00501, magpie0.getWeight(), DELTA);
		assertEquals(.00502, magpie1.getWeight(), DELTA);
		assertEquals(.00501, magpie2.getWeight(), DELTA);
		assertEquals(.00501, magpie3.getWeight(), DELTA);
		assertEquals(.000506, magpie4.getWeight(), DELTA);
	}

}
