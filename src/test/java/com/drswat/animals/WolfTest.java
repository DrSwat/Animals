package com.drswat.animals;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.drswat.animals.Doe;
import com.drswat.animals.Wolf;
import com.drswat.animals.Animal.Sex;

public class WolfTest {
	Wolf  wolw0  = new Wolf (40, 10, Sex.female, 120, 180, 30, 40);
	Wolf  wolw1 = new Wolf (80, 10, Sex.male, 120, 180, 50, 40);
	Wolf  wolw2 = new Wolf (40, 10, Sex.male, 120, 180, 50, 40);
	Wolf  wolw3 = new Wolf (5, 10, Sex.male, 120, 180, 50, 40);
	Wolf  wolw4 = new Wolf (100, 10, Sex.female, 120, 180, 10, 40);

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
		assertTrue(wolw0.canKill(dou0));
		assertTrue(wolw1.canKill(dou1));
		assertFalse(wolw3.canKill(dou3));
		assertTrue(wolw2.canKill(dou2));
		assertFalse(wolw4.canKill(dou4));
		
		
	}

	@Test
	public void testKill() {
		wolw0.kill(dou0);
		wolw1.kill(dou1);
		wolw2.kill(dou2);
		wolw3.kill(dou3);
		wolw4.kill(dou4);
		
		assertTrue( wolw0.getWeight() == 40.16);
		assertTrue( wolw1 .getWeight() == 80.16);
		assertTrue( wolw2 .getWeight() == 40.16);
		assertTrue( wolw3 .getWeight() == 5.16);
		assertTrue( wolw4 .getWeight() == 100.16);
	}

}
