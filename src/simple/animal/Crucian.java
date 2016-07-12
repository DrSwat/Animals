package simple.animal;

import general.FishOmnivorous;

public class Crucian extends FishOmnivorous {

	public Crucian(double weight, int age, Sex sex, int lenght, int speed, Fertilization fertilization, int eatFood) {
		super(weight, age, sex, lenght, speed, fertilization, eatFood);
	}

	@Override
	public boolean eat() {
		int i = (int) (Math.random() * 2);
		if (i % 2 == 0)
			return true;
		else
			return false;
	}

}
