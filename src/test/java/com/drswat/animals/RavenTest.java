package com.drswat.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.drswat.animals.Animal.Sex;
import com.drswat.animals.Fish.Fertilization;
import com.drswat.animals.InsectCarnivorous.Weapon;
import com.drswat.animals.InsectHerbivorous.Mouth;

public class RavenTest {
	private static final double DELTA = 0.00000001;
	Raven raven0 = new Raven(1, 1, Sex.female, 10, 10, 100, true, 3, 50);
	Raven raven1 = new Raven(1, 1, Sex.female, 10, 10, 100, true, 3, 50);
	Raven raven2 = new Raven(1, 1, Sex.female, 10, 10, 100, true, 3, 50);
	Raven raven3 = new Raven(1, 1, Sex.female, 10, 10, 100, false, 3, 5);
	Raven raven4 = new Raven(1, 1, Sex.female, 10, 10, 100, true, 3, 50);

	Mantis mantis = new Mantis(.001, 1, Sex.female, 6, Weapon.sting, 1);
	Cockroach cockroach = new Cockroach(.0001, 1, Sex.female, 8, 1, 1);
	Ant ant = new Ant(.00150, 1, Sex.male, 6, 1, 1);
	Locust locust = new Locust(.001, 1, Sex.female, 6, Mouth.antennae, 20);
	Carp carp = new Carp(10, 1, Sex.male, 1, 1, Fertilization.outside, 1);

	@Test
	public void testCanKill() {
		assertTrue(raven0.canKill(mantis));
		assertTrue(raven1.canKill(cockroach));
		assertTrue(raven2.canKill(ant));
		assertFalse(raven3.canKill(locust));
		assertFalse(raven4.canKill(carp));
	}

	@Test
	public void testKill() {
		raven0.kill(mantis);
		raven1.kill(cockroach);
		raven2.kill(ant);
		raven3.kill(locust);
		raven4.kill(carp);

		assertEquals(1.000004, raven0.getWeight(), DELTA);
		assertEquals(1.0000004, raven1.getWeight(), DELTA);
		assertEquals(1.000006, raven2.getWeight(), DELTA);
		assertEquals(1.000004, raven3.getWeight(), DELTA);
		assertEquals(1.04, raven4.getWeight(), DELTA);
	}

}
