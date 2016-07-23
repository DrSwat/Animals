package com.drswat.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.drswat.animals.Animal.Sex;

public class OwlTest {
	private static final double DELTA = 0.0001;
	Owl owl0 = new Owl(1, 2, Sex.female, 10, 10, 150, true, 3, 100);
	Owl owl1 = new Owl(.5, 2, Sex.female, 10, 10, 150, true, 3, 100);
	Owl owl2 = new Owl(1.5, 2, Sex.female, 10, 10, 150, true, 3, 100);
	Owl owl3 = new Owl(1, 2, Sex.female, 10, 10, 150, true, 3, 1);
	Owl owl4 = new Owl(.1, 2, Sex.female, 10, 10, 150, true, 3, 9);

	Mouse mouse0 = new Mouse(.2, 1, Sex.female, 8, 15, 10, 1);
	Mouse mouse1 = new Mouse(.2, 1, Sex.female, 8, 15, 10, 1);
	Mouse mouse2 = new Mouse(.2, 1, Sex.female, 8, 15, 10, 1);
	Mouse mouse3 = new Mouse(.2, 1, Sex.female, 8, 15, 10, 1);
	Mouse mouse4 = new Mouse(.2, 1, Sex.female, 8, 15, 10, 1);

	@Test
	public void testCanKill() {
		assertTrue(owl0.canKill(mouse0));
		assertTrue(owl1.canKill(mouse1));
		assertTrue(owl2.canKill(mouse2));
		assertFalse(owl3.canKill(mouse3));
		assertFalse(owl4.canKill(mouse4));
	}

	@Test
	public void testKill() {
		owl0.kill(mouse0);
		owl1.kill(mouse1);
		owl2.kill(mouse2);
		owl3.kill(mouse3);
		owl4.kill(mouse4);

		assertEquals(1.0008, owl0.getWeight(), DELTA);
		assertEquals(.5008, owl1.getWeight(), DELTA);
		assertEquals(1.5008, owl2.getWeight(), DELTA);
		assertEquals(1.0008, owl3.getWeight(), DELTA);
		assertEquals(.1008, owl4.getWeight(), DELTA);
	}

}
