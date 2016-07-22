package com.drswat.animals;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.drswat.animals.Ant;
import com.drswat.animals.Carp;
import com.drswat.animals.Cockroach;
import com.drswat.animals.Locust;
import com.drswat.animals.Mantis;
import com.drswat.animals.Animal.Sex;
import com.drswat.animals.Fish.Fertilization;
import com.drswat.animals.InsectCarnivorous.Weapon;
import com.drswat.animals.InsectHerbivorous.Mouth;

public class CarpTest {
	private static final double DELTA = 0.00000001;
Carp carp0 = new Carp(3, 2, Sex.female, 400, 10, Fertilization.outside, 10);
Carp carp1= new Carp(1, 2, Sex.female, 400, 10, Fertilization.outside, 10);
Carp carp2 = new Carp(2, 2, Sex.female, 400, 10, Fertilization.outside, 10);
Carp carp3 = new Carp(.001, 2, Sex.female, 400, 10, Fertilization.outside, 1);
Carp carp4 = new Carp(3, 2, Sex.female, 400, 10, Fertilization.outside, 1);


Mantis mantis = new Mantis(.001, 1, Sex.female, 6, Weapon.sting, 1);
Cockroach cockroach = new Cockroach(.0001, 1, Sex.female, 8, 1, 1);
Ant ant = new Ant(.00150, 1, Sex.male, 6, 1, 1);
Locust locust = new Locust(.001, 1, Sex.female, 6, Mouth.antennae, 20);
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
		assertTrue(carp0.canKill(mantis));
		assertTrue(carp1.canKill(cockroach));
		assertTrue(carp2.canKill(ant));
		assertFalse(carp3.canKill(locust));
		assertFalse(carp4.canKill(carp));
	}

	@Test
	public void testKill() {
		carp0.kill(mantis);
		carp1.kill(cockroach);
		carp2.kill(ant);
		carp3.kill(locust);
		carp4.kill(carp);
		assertEquals(3.000004, carp0.getWeight(), DELTA);
		assertEquals(1.0000004, carp1.getWeight(), DELTA);
		assertEquals(2.000006, carp2.getWeight(), DELTA);
		assertEquals(.001004, carp3.getWeight(), DELTA);
		assertEquals(3.04, carp4.getWeight(), DELTA);
	}

}
