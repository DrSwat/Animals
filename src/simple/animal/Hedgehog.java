package simple.animal;

import general.MammalInsectivorous;

public class Hedgehog extends MammalInsectivorous {

	public Hedgehog(double weight, int age, Sex sex, int height, int lenght, int speed, int mouthparts) {
		super(weight, age, sex, height, lenght, speed, mouthparts);
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
