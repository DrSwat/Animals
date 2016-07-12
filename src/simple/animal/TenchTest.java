package simple.animal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import general.Animal.Sex;
import general.Fish.Fertilization;
import general.InsectHerbivorous.Mouth;

public class TenchTest {
	private static final double DELTA = 0.00000001;
	Tench tench0 = new Tench(3, 2, Sex.female, 400, 10, Fertilization.outside, 10);
	Tench tench1 = new Tench(1, 2, Sex.female, 400, 10, Fertilization.outside, 10);
	Tench tench2 = new Tench(2, 2, Sex.female, 400, 10, Fertilization.outside, 10);
	Tench tench3 = new Tench(.001, 2, Sex.female, 400, 10, Fertilization.outside, 1);
	Tench tench4 = new Tench(3, 2, Sex.female, 400, 10, Fertilization.outside, 1);

	Pike pike = new Pike(.4, 2, Sex.female, 400, 8, Fertilization.outside, 1);
	Cockroach cockroach = new Cockroach(.0001, 1, Sex.female, 8, 1, 1);
	Ant ant = new Ant(.00150, 1, Sex.male, 6, 1, 1);
	Locust locust = new Locust(.01, 1, Sex.female, 6, Mouth.antennae, 20);
	Carp carp = new Carp(10, 1, Sex.male, 1, 1, Fertilization.outside, 1);

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
		assertTrue(tench0.canKill(pike));
		assertTrue(tench1.canKill(cockroach));
		assertTrue(tench2.canKill(ant));
		assertFalse(tench3.canKill(locust));
		assertFalse(tench4.canKill(carp));
	}

	@Test
	public void testKill() {
		tench0.kill(pike);
		tench1.kill(cockroach);
		tench2.kill(ant);
		tench3.kill(locust);
		tench4.kill(carp);
		

		assertEquals(3.0016, tench0.getWeight(), DELTA);
		assertEquals(1.0000004, tench1.getWeight(), DELTA);
		assertEquals(2.000006, tench2.getWeight(), DELTA);
		assertEquals(.00104, tench3.getWeight(), DELTA);
		assertEquals(3.04, tench4.getWeight(), DELTA);
	}

}
