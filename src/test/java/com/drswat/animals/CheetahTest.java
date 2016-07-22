package com.drswat.animals;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.drswat.animals.Cheetah;
import com.drswat.animals.Doe;
import com.drswat.animals.Animal.Sex;

public class CheetahTest {
	Cheetah ch0 = new Cheetah(40, 10, Sex.female, 120, 180, 30, 40);
	Cheetah ch1 = new Cheetah(100, 10, Sex.male, 120, 180, 70, 40);
	Cheetah chN2 = new Cheetah(40, 10, Sex.male, 120, 180, 10, 40);
	Cheetah chN3 = new Cheetah(5, 10, Sex.male, 120, 180, 70, 40);
	Cheetah chN4 = new Cheetah(5, 10, Sex.female, 120, 180, 10, 40);

	Doe dou0 = new Doe(40, 3, Sex.male, 150, 150, 30, 2);
	Doe dou1 = new Doe(40, 3, Sex.male, 150, 150, 30, 2);
	Doe dou2 = new Doe(40, 3, Sex.male, 150, 150, 30, 2);
	Doe dou3 = new Doe(40, 3, Sex.male, 150, 150, 30, 2);
	Doe dou4 = new Doe(40, 3, Sex.male, 150, 150, 30, 2);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}



	@Test
	public void testCanKill() {

		assertTrue(ch0.canKill(dou0));
		assertTrue(ch1.canKill(dou1));
	}
	@Test
	public void testCanKillNegative() {
		assertFalse(chN2.canKill(dou2));
		assertFalse(chN3.canKill(dou3));
		assertFalse(chN4.canKill(dou4));
	}


	@Test
	public void testKill() {
		ch0.kill(dou0);
		ch1.kill(dou1);
		chN2.kill(dou2);
		chN3.kill(dou3);
		chN4.kill(dou4);
		 assertTrue(ch0.getWeight() == 40.16);
		 assertTrue(ch1.getWeight() == 100.16);
		 assertTrue(chN2.getWeight() == 40.16);
		 assertTrue(chN3.getWeight() == 5.16);
		 assertTrue(chN4.getWeight() == 5.16);

	}
	
}
