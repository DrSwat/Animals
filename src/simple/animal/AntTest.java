package simple.animal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import general.Animal.Sex;
import general.Fish.Fertilization;

public class AntTest {

	Ant ant0 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
	Ant ant1 = new Ant(.00050, 1, Sex.male, 4, 1, 1);
	Ant ant2 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
	Ant ant3 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
	Ant ant4 = new Ant(.00150, 1, Sex.male, 4, 1, 1);

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
		assertTrue(ant0.getWeight() == 0.0015400000000000001);
		assertTrue(ant1.getWeight() == .0007);
		assertTrue(ant2.getWeight() == .0019);
		assertTrue(ant3.getWeight() == .001506);
		assertTrue(ant4.getWeight() == .0035);

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
