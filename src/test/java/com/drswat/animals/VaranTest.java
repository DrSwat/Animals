package com.drswat.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.drswat.animals.Animal.Sex;

public class VaranTest {
	private static final double DELTA = 0.0001;
	Varan varan0 = new Varan(10, 2, Sex.female, false, 10);
	Varan varan1 = new Varan(10, 2, Sex.female, false, 10);
	Varan varan2 = new Varan(10, 2, Sex.female, false, 10);
	Varan varan3 = new Varan(10, 2, Sex.female, false, 1);
	Varan varan4 = new Varan(.1, 2, Sex.female, false, 9);

	Mouse mouse0 = new Mouse(.2, 1, Sex.female, 8, 15, 10, 1);
	Mouse mouse1 = new Mouse(.2, 1, Sex.female, 8, 15, 10, 1);
	Mouse mouse2 = new Mouse(.2, 1, Sex.female, 8, 15, 10, 1);
	Mouse mouse3 = new Mouse(.2, 1, Sex.female, 8, 15, 10, 1);
	Mouse mouse4 = new Mouse(.2, 1, Sex.female, 8, 15, 10, 1);

	@Test
	public void testCanKill() {
		assertTrue(varan0.canKill(mouse0));
		assertTrue(varan1.canKill(mouse1));
		assertTrue(varan2.canKill(mouse2));
		assertFalse(varan3.canKill(mouse3));
		assertFalse(varan4.canKill(mouse4));
	}

	@Test
	public void testKill() {
		varan0.kill(mouse0);
		varan1.kill(mouse1);
		varan2.kill(mouse2);
		varan3.kill(mouse3);
		varan4.kill(mouse4);

		assertEquals(10.0008, varan0.getWeight(), DELTA);
		assertEquals(10.0008, varan1.getWeight(), DELTA);
		assertEquals(10.0008, varan2.getWeight(), DELTA);
		assertEquals(10.0008, varan3.getWeight(), DELTA);
		assertEquals(.1008, varan4.getWeight(), DELTA);
	}

}
