package com.drswat.animals;

public class Owl extends BirdCarnivorous implements Predator {

	public Owl(double weight, int lifetime, Sex sex, int growth, int wingspan, int rangeOfFlight, boolean canFlight,
			int eatAnimal, int speed) {
		super(weight, lifetime, sex, growth, wingspan, rangeOfFlight, canFlight, eatAnimal, speed);
	}

	@Override
	public boolean airAttak() {
		int i = (int) (Math.random() * 2);
		if (i % 2 == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean canKill(Animal animal) {
		double weight = animal.getWeight() / getWeight();
		double speed = getSpeed() - animal.getSpeed();
		if (animal instanceof Mammal && speed >= 0 && weight < 3)
			return true;
		else
			return false;
	}

	@Override
	public void kill(Animal animal) {
		setWeight((getWeight() + (animal.getWeight() * .004)));
	}

}
