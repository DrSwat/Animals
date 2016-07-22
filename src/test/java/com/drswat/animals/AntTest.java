package com.drswat.animals;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.drswat.animals.Ant;
import com.drswat.animals.AntEater;
import com.drswat.animals.Bunting;
import com.drswat.animals.Carp;
import com.drswat.animals.Eagle;
import com.drswat.animals.Tiger;
import com.drswat.animals.Animal.Sex;
import com.drswat.animals.Fish.Fertilization;

public class AntTest {
	private static final double DELTA = 0.00001;
	Ant ant0 = new Ant(.000150, 1, Sex.male, 4, 1, 1);
	Ant ant1 = new Ant(.000050, 1, Sex.male, 4, 1, 1);
	Ant ant2 = new Ant(.000150, 1, Sex.male, 4, 1, 1);
	Ant ant3 = new Ant(.000150, 1, Sex.male, 4, 1, 1);
	Ant ant4 = new Ant(.000150, 1, Sex.male, 4, 1, 1);

	Carp carp = new Carp(1, 1, Sex.male, 300, 1, Fertilization.outside, 1);
	Eagle eagle = new Eagle(5, 2, Sex.female, 1, 1, 100, true, 1, 1);
	AntEater antEater = new AntEater(10, 2, Sex.female, 300, 300, 5, 1);
	Bunting bunting = new Bunting(0.150, 1, Sex.female, 1, 1, 50, true, 1, 1);
	Tiger tiger = new Tiger(50, 20, Sex.female, 120, 200, 50, 40);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKill() {
		ant0.kill(carp);
		ant1.kill(eagle);
		ant2.kill(antEater);
		ant3.kill(bunting);
		ant4.kill(tiger);
		assertEquals(ant0.getWeight(), .00019, DELTA);
		assertEquals(ant1.getWeight(), .00025, DELTA);
		assertEquals(ant2.getWeight(), .00055, DELTA);
		assertEquals(ant3.getWeight(), .000156, DELTA);
		assertEquals(ant4.getWeight(), .00215, DELTA);

	}

	@Test
	public void testCanKill() {
		assertTrue(ant0.canKill(carp));
		assertTrue(ant2.canKill(eagle));
		assertTrue(ant3.canKill(bunting));
		assertFalse(ant3.canKill(antEater));
		assertFalse(ant4.canKill(tiger));
	}

}
