package com.drswat.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.drswat.animals.Animal.Sex;
import com.drswat.animals.Fish.Fertilization;

public class CatfishTest {
	private static final double DELTA = 0.001;
	Catfish catfish0 = new Catfish(1, 1, Sex.female, 300, 10, Fertilization.outside, 60);
	Catfish catfish1 = new Catfish(2, 1, Sex.female, 300, 10, Fertilization.outside, 60);
	Catfish catfish2 = new Catfish(3, 1, Sex.female, 300, 10, Fertilization.outside, 60);
	Catfish catfish3 = new Catfish(.150, 1, Sex.female, 300, 10, Fertilization.outside, 60);
	Catfish catfish4 = new Catfish(1, 1, Sex.female, 300, 10, Fertilization.outside, 1);

	Carp carp0 = new Carp(.200, 1, Sex.male, 1, 1, Fertilization.outside, 1);
	Catfish catfish = new Catfish(.150, 1, Sex.female, 300, 10, Fertilization.outside, 1);
	Carp carp1 = new Carp(1, 1, Sex.male, 1, 1, Fertilization.outside, 1);
	Carp carp2 = new Carp(10, 1, Sex.male, 1, 1, Fertilization.outside, 1);
	Carp carp3 = new Carp(.150, 1, Sex.male, 1, 15, Fertilization.outside, 1);

	@Test
	public void testCanKill() {
		assertTrue(catfish0.canKill(carp0));
		assertTrue(catfish1.canKill(catfish));
		assertTrue(catfish2.canKill(carp1));
		assertFalse(catfish3.canKill(carp2));
		assertFalse(catfish4.canKill(carp3));
	}

	@Test
	public void testKill() {
		catfish0.kill(carp0);
		catfish1.kill(catfish);
		catfish2.kill(carp1);
		catfish3.kill(carp2);
		catfish4.kill(carp3);
		assertEquals(1.0008, catfish0.getWeight(), DELTA);
		assertEquals(2.0006, catfish1.getWeight(), DELTA);
		assertEquals(3.004, catfish2.getWeight(), DELTA);
		assertEquals(.19, catfish3.getWeight(), DELTA);
		assertEquals(1.0006, catfish4.getWeight(), DELTA);

	}

}
