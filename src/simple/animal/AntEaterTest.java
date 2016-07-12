package simple.animal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import general.Animal.Sex;

public class AntEaterTest {
	AntEater antEater0 = new AntEater(10, 1, Sex.female, 200, 200, 10, 10);
	AntEater antEater1 = new AntEater(20, 1, Sex.female, 200, 200, 10, 10);
	AntEater antEater2 = new AntEater(15, 1, Sex.female, 200, 200, 10, 10);
	AntEater antEater3 = new AntEater(30, 1, Sex.female, 200, 200, 10, 10);
	AntEater antEater4 = new AntEater(10, 1, Sex.female, 200, 200, 10, 10);
	
	
	Ant ant0 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
	Ant ant1 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
	Ant ant2 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
	Ant ant3 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
	Ant ant4 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
	

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
		
	}

	@Test
	public void testKill() {
		fail("Not yet implemented");
	}

}
