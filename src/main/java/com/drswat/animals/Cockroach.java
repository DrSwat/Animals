package com.drswat.animals;

public class Cockroach extends InsectOmnivorous implements JustEat {

	public Cockroach(double weight, int age, Sex sex, int quantityLegs, int range, int speed) {
		super(weight, age, sex, quantityLegs, range, speed);
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
