package com.drswat.animals;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.drswat.animals.Doe;
import com.drswat.animals.Shark;
import com.drswat.animals.Animal.Sex;
import com.drswat.animals.Fish.Fertilization;

public class SharkTest {
	Shark shark0 = new Shark(40, 3, Sex.female, 2000, 50, Fertilization.inside, 70);
	Shark shark1 = new Shark(60, 3, Sex.female, 3000, 50, Fertilization.inside, 70);
	Shark shark2 = new Shark(30, 3, Sex.female, 1000, 50, Fertilization.inside, 70);
	Shark shark3 = new Shark(10, 3, Sex.female, 500, 50, Fertilization.inside, 70);
	Shark shark4 = new Shark(40, 3, Sex.female, 2000, 10, Fertilization.inside, 70);

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
		assertTrue(shark0.canKill(dou0));
		assertTrue(shark1.canKill(dou1));
		assertTrue(shark2.canKill(dou2));
		assertFalse(shark3.canKill(dou3));
		assertFalse(shark4.canKill(dou4));
	}

	@Test
	public void testKill() {
		shark0.kill(dou0);
		shark1.kill(dou1);
		shark2.kill(dou2);
		shark3.kill(dou3);
		shark4.kill(dou4);
		
		assertTrue(shark0.getWeight() == 40.16);
		 assertTrue(shark1.getWeight() == 60.16);
		 assertTrue(shark2.getWeight() == 30.16);
		 assertTrue(shark3.getWeight() == 10.16);
		 assertTrue(shark4.getWeight() == 40.16);
	}

}
