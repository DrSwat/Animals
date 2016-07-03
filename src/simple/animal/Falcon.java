package simple.animal;

import general.Animal;
import general.Bird;
import general.BirdCarnivorous;
import general.Fish;
import general.Insect;
import general.Mammal;

public class Falcon extends BirdCarnivorous {

	public Falcon(int weight, int lifetime, Sex sex, int growth, int wingspan, int rangeOfFlight, boolean canFlight,
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
		if (animal instanceof Mammal || animal instanceof Bird || animal instanceof Insect || animal instanceof Fish && speed > 0 && weight > 3)
			return true;
		else
			return false;		
	}

	@Override
	public void kill(Animal animal) {
		setWeight((getWeight() + (animal.getWeight() * .004)));
	}

	
}
