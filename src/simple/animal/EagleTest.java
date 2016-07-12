package simple.animal;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import general.Animal.Sex;

public class EagleTest {
	private static final double DELTA = 0.0001;
	Eagle eagle0 = new Eagle(1, 2, Sex.female, 10, 10, 150, true, 3, 100);
	Eagle eagle1 = new Eagle(.5, 2, Sex.female, 10, 10, 150, true, 3, 100);
	Eagle eagle2 = new Eagle(1.5, 2, Sex.female, 10, 10, 150, true, 3, 100);
	Eagle eagle3 = new Eagle(1, 2, Sex.female, 10, 10, 150, true, 3, 1);
	Eagle eagle4 = new Eagle(.1, 2, Sex.female, 10, 10, 150, true, 3, 10);

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
		assertTrue(eagle0.canKill(bunting0));
		assertTrue(eagle1.canKill(bunting1));
		assertTrue(eagle2.canKill(bunting2));
		assertFalse(eagle3.canKill(bunting3));
		assertFalse(eagle4.canKill(bunting4));
	}

	@Test
	public void testKill() {

		eagle0.kill(bunting0);
		eagle1.kill(bunting1);
		eagle2.kill(bunting2);
		eagle3.kill(bunting3);
		eagle4.kill(bunting4);

		assertEquals(1.0008, eagle0.getWeight(), DELTA);
		assertEquals(.5008, eagle1.getWeight(), DELTA);
		assertEquals(1.5008, eagle2.getWeight(), DELTA);
		assertEquals(1.0008, eagle3.getWeight(), DELTA);
		assertEquals(.1008, eagle4.getWeight(), DELTA);

	}

}
