package simple.animal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import general.Animal.Sex;

public class FalconTest {
	private static final double DELTA = 0.0001;
	Falcon falcon0 = new Falcon(1, 2, Sex.female, 10, 10, 150, true, 3, 100);
	Falcon falcon1 = new Falcon(.5, 2, Sex.female, 10, 10, 150, true, 3, 100);
	Falcon falcon2 = new Falcon(1.5, 2, Sex.female, 10, 10, 150, true, 3, 100);
	Falcon falcon3 = new Falcon(1, 2, Sex.female, 10, 10, 150, true, 3, 1);
	Falcon falcon4 = new Falcon(.1, 2, Sex.female, 10, 10, 150, true, 3, 10);

	Bunting bunting0 = new Bunting(.2, 1, Sex.male, 10, 10, 10, true, 1, 20);
	Bunting bunting1 = new Bunting(.2, 1, Sex.male, 10, 10, 10, true, 1, 20);
	Bunting bunting2 = new Bunting(.2, 1, Sex.male, 10, 10, 10, true, 1, 20);
	Bunting bunting3 = new Bunting(.2, 1, Sex.male, 10, 10, 10, true, 1, 20);
	Bunting bunting4 = new Bunting(.2, 1, Sex.male, 10, 10, 10, true, 1, 20);
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
		assertTrue(falcon0.canKill(bunting0));
		assertTrue(falcon1.canKill(bunting1));
		assertTrue(falcon2.canKill(bunting2));
		assertFalse(falcon3.canKill(bunting3));
		assertFalse(falcon4.canKill(bunting4));
		
	}

	@Test
	public void testKill() {
		falcon0.kill(bunting0);
		falcon1.kill(bunting1);
		falcon2.kill(bunting2);
		falcon3.kill(bunting3);
		falcon4.kill(bunting4);
		
		assertEquals(1.0008, falcon0.getWeight(), DELTA);
		assertEquals(.5008, falcon1.getWeight(), DELTA);
		assertEquals(1.5008, falcon2.getWeight(), DELTA);
		assertEquals(1.0008, falcon3.getWeight(), DELTA);
		assertEquals(.1008, falcon4.getWeight(), DELTA);
	}

}
