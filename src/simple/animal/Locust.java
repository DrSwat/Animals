package simple.animal;

import general.InsectHerbivorous;
import general.JustEat;
import general.Run;

public class Locust extends InsectHerbivorous implements Run, JustEat {

	public Locust(double weight, int age, Sex sex, int quantityLegs, Mouth mouth, int speed) {
		super(weight, age, sex, quantityLegs, mouth, speed);
	}

	@Override
	public boolean justRun() {
		int i = (int) (Math.random() * 2);
		if (i % 2 == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean eat() {
		// TODO Auto-generated method stub
		return false;
	}

}
