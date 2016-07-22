package com.drswat.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.drswat.animals.Animal.Sex;

public class AntEaterTest {
	private static final double DELTA = 0.00001;
	AntEater antEater0 = new AntEater(10, 1, Sex.female, 200, 200, 10, 10);
	AntEater antEater1 = new AntEater(20, 1, Sex.female, 200, 200, 10, 10);
	AntEater antEater2 = new AntEater(15, 1, Sex.female, 200, 200, 10, 10);
	AntEater antEater3 = new AntEater(30, 1, Sex.female, 200, 200, 10, 10);
	AntEater antEater4 = new AntEater(10, 1, Sex.female, 200, 200, 10, 10);

	Ant ant0 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
	Ant ant1 = new Ant(.00050, 1, Sex.male, 4, 1, 1);
	Ant ant2 = new Ant(.00100, 1, Sex.male, 4, 1, 1);
	Bunting bunting = new Bunting(0.150, 1, Sex.female, 1, 1, 50, true, 1, 1);
	Tiger tiger = new Tiger(50, 20, Sex.female, 120, 200, 50, 40);

	@Test
	public void testCanKill() {
		assertTrue(antEater0.canKill(ant0));
		assertTrue(antEater1.canKill(ant1));
		assertTrue(antEater2.canKill(ant2));
		assertFalse(antEater3.canKill(bunting));
		assertFalse(antEater4.canKill(tiger));
	}

	@Test
	public void testKill() {
		antEater0.kill(ant0);
		antEater1.kill(ant1);
		antEater2.kill(ant2);
		antEater3.kill(ant0);
		antEater4.kill(ant1);
		System.out.println(antEater0.getWeight());
		System.out.println(antEater1.getWeight());
		System.out.println(antEater2.getWeight());
		System.out.println(antEater3.getWeight());
		System.out.println(antEater4.getWeight());
		assertEquals(antEater0.getWeight(), 10.006, DELTA);
		assertEquals(antEater1.getWeight(), 20.002, DELTA);
		assertEquals(antEater2.getWeight(), 15.004, DELTA);
		assertEquals(antEater3.getWeight(), 30.006, DELTA);
		assertEquals(antEater4.getWeight(), 10.002, DELTA);
	}

}
