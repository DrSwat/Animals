package simple.animal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import general.Animal.Sex;

public class TigerTest {
	Tiger tiger0 = new Tiger(40, 10, Sex.female, 120, 180, 30, 40);
	Tiger tiger1 = new Tiger(80, 10, Sex.male, 120, 180, 50, 40);
	Tiger tiger2 = new Tiger(40, 10, Sex.male, 120, 180, 50, 40);
	Tiger tiger3 = new Tiger(5, 10, Sex.male, 120, 180, 50, 40);
	Tiger tiger4 = new Tiger(100, 10, Sex.female, 120, 180, 10, 40);

	Doe dou0 = new Doe(40, 3, Sex.male, 150, 150, 30, 2);
	Doe dou1 = new Doe(40, 3, Sex.male, 150, 150, 30, 2);
	Doe dou2 = new Doe(40, 3, Sex.male, 150, 150, 30, 2);
	Doe dou3 = new Doe(40, 3, Sex.male, 150, 150, 30, 2);
	Doe dou4 = new Doe(40, 3, Sex.male, 150, 150, 30, 2);

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
		assertTrue(tiger0.canKill(dou0));
		assertTrue(tiger1.canKill(dou1));
		assertTrue(tiger2.canKill(dou2));
		assertFalse(tiger3.canKill(dou3));
		assertFalse(tiger4.canKill(dou4));
	}

	@Test
	public void testKill() {
		tiger0.kill(dou0);
		tiger1.kill(dou1);
		tiger2.kill(dou2);
		tiger3.kill(dou3);
		tiger4.kill(dou4);
		assertTrue(tiger0.getWeight() == 40.16);
		assertTrue(tiger1.getWeight() == 80.16);
		assertTrue(tiger2.getWeight() == 40.16);
		assertTrue(tiger3.getWeight() == 5.16);
		assertTrue(tiger4.getWeight() == 100.16);
	}

}
