package simple.animal;

import general.BirdGranivorous;
import general.Run;

public class Bunting extends BirdGranivorous implements Run {

	public Bunting(double weight, int age, Sex sex, int growth, int wingspan, int rangeOfFlight, boolean canFlight,
			int eatGrown, int speed) {
		super(weight, age, sex, growth, wingspan, rangeOfFlight, canFlight, eatGrown, speed);
	}

	@Override
	public boolean flightFlock() {
		int i = (int) (Math.random() * 2);
		if (i % 2 == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean justRun() {
		
			return false;
	}

}
