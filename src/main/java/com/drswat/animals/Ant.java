package com.drswat.animals;

public class Ant extends InsectOmnivorous implements Predator {

	public Ant(double weight, int age, Sex sex, int quantityLegs, int range, int speed) {
		super(weight, age, sex, quantityLegs, range, speed);
	}

	@Override
	public boolean canKill(Animal animal) {
		double weight = animal.getWeight() / (getWeight() * 1000000);
		double speed = getSpeed() - animal.getSpeed();
		if ((animal instanceof Mammal || animal instanceof Bird || animal instanceof Insect || animal instanceof Fish)
				&& speed >= 0 && weight < 3)
			return true;
		else
			return false;
	}

	@Override
	public boolean eat() {

		return false;
	}

	@Override
	public void kill(Animal animal) {
		setWeight((getWeight() + (animal.getWeight() * .00004)));
	}

}
