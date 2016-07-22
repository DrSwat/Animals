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
import com.drswat.animals.Thrush;
import com.drswat.animals.Animal.Sex;
import com.drswat.animals.Fish.Fertilization;
import com.drswat.animals.InsectCarnivorous.Weapon;
import com.drswat.animals.InsectHerbivorous.Mouth;

public class ThrushTest {
	private static final double DELTA = 0.00000001;
	Thrush thrush0 = new Thrush(1, 1, Sex.female, 10, 10, 100, true, 3, 50);
	Thrush thrush1 = new Thrush(1, 1, Sex.female, 10, 10, 100, true, 3, 50);
	Thrush thrush2 = new Thrush(1, 1, Sex.female, 10, 10, 100, true, 3, 50);
	Thrush thrush3 = new Thrush(1, 1, Sex.female, 10, 10, 100, false, 3, 5);
	Thrush thrush4 = new Thrush(1, 1, Sex.female, 10, 10, 100, true, 3, 50);
	
	
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
		assertTrue(thrush0.canKill(mantis));
		assertTrue(thrush1.canKill(cockroach));
		assertTrue(thrush2.canKill(ant));
		assertFalse(thrush3.canKill(locust));
		assertFalse(thrush4.canKill(carp));
		
	}

	@Test
	public void testKill() {
		thrush0.kill(mantis);
		thrush1.kill(cockroach);
		thrush2.kill(ant);
		thrush3.kill(locust);
		thrush4.kill(carp);
		
		assertEquals(1.000004, thrush0.getWeight(), DELTA);
		assertEquals(1.0000004, thrush1.getWeight(), DELTA);
		assertEquals(1.000006, thrush2.getWeight(), DELTA);
		assertEquals(1.000004, thrush3.getWeight(), DELTA);
		assertEquals(1.04, thrush4.getWeight(), DELTA);
	}

}