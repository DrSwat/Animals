package simple.animal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import general.Animal.Sex;

public class MantisTest {
	private static final double DELTA = 0.0001;
	Magpie mantis0 = new Magpie(.005, 1, Sex.female, 10, 10, 50, true, 3, 10);
	Magpie mantis1 = new Magpie(.005, 1, Sex.female, 10, 10, 50, true, 3, 10);
	Magpie mantis2 = new Magpie(.005, 1, Sex.female, 10, 10, 50, true, 3, 10);
	Magpie mantis3 = new Magpie(.005, 1, Sex.female, 10, 10, 50, true, 3, 1);
	Magpie mantis4 = new Magpie(.0005, 1, Sex.female, 10, 10, 50, true, 3, 10);

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
		assertTrue(mantis0.canKill(ant0));
		assertTrue(mantis1.canKill(ant1));
		assertTrue(mantis2.canKill(ant2));
		assertFalse(mantis3.canKill(ant3));
		assertFalse(mantis4.canKill(ant4));
	}

	@Test
	public void testKill() {
		mantis0.kill(ant0);
		mantis1.kill(ant1);
		mantis2.kill(ant2);
		mantis3.kill(ant3);
		mantis4.kill(ant4);
		
		assertEquals(.00501, mantis0.getWeight(), DELTA);
		assertEquals(.00502, mantis1.getWeight(), DELTA);
		assertEquals(.00501, mantis2.getWeight(), DELTA);
		assertEquals(.00501, mantis3.getWeight(), DELTA);
		assertEquals(.000506, mantis4.getWeight(), DELTA);
	}

}
