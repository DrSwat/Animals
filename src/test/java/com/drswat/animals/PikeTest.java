package com.drswat.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.drswat.animals.Animal.Sex;
import com.drswat.animals.Fish.Fertilization;
import com.drswat.animals.InsectHerbivorous.Mouth;

public class PikeTest {
	private static final double DELTA = 0.00000001;
	Pike pike0 = new Pike(3, 2, Sex.female, 400, 10, Fertilization.outside, 10);
	Pike pike1 = new Pike(1, 2, Sex.female, 400, 10, Fertilization.outside, 10);
	Pike pike2 = new Pike(2, 2, Sex.female, 400, 10, Fertilization.outside, 10);
	Pike pike3 = new Pike(.001, 2, Sex.female, 400, 10, Fertilization.outside, 1);
	Pike pike4 = new Pike(3, 2, Sex.female, 400, 10, Fertilization.outside, 1);

	Pike pike = new Pike(.4, 2, Sex.female, 400, 8, Fertilization.outside, 1);
	Cockroach cockroach = new Cockroach(.0001, 1, Sex.female, 8, 1, 1);
	Ant ant = new Ant(.00150, 1, Sex.male, 6, 1, 1);
	Locust locust = new Locust(.01, 1, Sex.female, 6, Mouth.antennae, 20);
	Carp carp = new Carp(10, 1, Sex.male, 1, 1, Fertilization.outside, 1);

	@Test
	public void testCanKill() {
		assertTrue(pike0.canKill(pike));
		assertTrue(pike1.canKill(cockroach));
		assertTrue(pike2.canKill(ant));
		assertFalse(pike3.canKill(locust));
		assertFalse(pike4.canKill(carp));
	}

	@Test
	public void testKill() {
		pike0.kill(pike);
		pike1.kill(cockroach);
		pike2.kill(ant);
		pike3.kill(locust);
		pike4.kill(carp);

		assertEquals(3.0016, pike0.getWeight(), DELTA);
		assertEquals(1.0000004, pike1.getWeight(), DELTA);
		assertEquals(2.000006, pike2.getWeight(), DELTA);
		assertEquals(.00104, pike3.getWeight(), DELTA);
		assertEquals(3.04, pike4.getWeight(), DELTA);
	}

}
