package simple.animal;

import general.Animal;
import general.BirdOmnivorous;
import general.Insect;
import general.JustEat;
import general.Predator;

public class Raven extends BirdOmnivorous implements Predator, JustEat {

	public Raven(double weight, int age, Sex sex, int growth, int wingspan, int rangeOfFlight, boolean canFlight,
			int eatFood, int speed) {
		super(weight, age, sex, growth, wingspan, rangeOfFlight, canFlight, eatFood, speed);
	}

	

	@Override
	public boolean eat() {
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
		if (animal instanceof Insect && speed >= 0 && weight < 3)
			return true;
		else
			return false;
	}



	@Override
	public void kill(Animal animal) {
		setWeight((getWeight() + (animal.getWeight() * .004)));		
	}

	

}
