package com.drswat.animals;

public class Varan extends ReptileCarnivorous implements Predator {

	public Varan(double weight, int lifetime, Sex sex, boolean hibernation, int speed) {
		super(weight, lifetime, sex, hibernation, speed);
	}

	@Override
	public boolean canKill(Animal animal) {
		double weight = animal.getWeight() / getWeight();
		double speed = getSpeed() - animal.getSpeed();
		if ((animal instanceof Mammal || animal instanceof Bird) && speed >= 0 && weight < 3)
			return true;
		else
			return false;
	}

	@Override
	public boolean DeadlyThrow() {
		int i = (int) (Math.random() * 2);
		if (i % 2 == 0)
			return true;
		else
			return false;
	}

	@Override
	public void kill(Animal animal) {
		setWeight((getWeight() + (animal.getWeight() * .004)));
	}

}
