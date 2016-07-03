package simple.animal;

import general.Animal;
import general.Bird;
import general.Fish;
import general.FishCarnivorous;
import general.Mammal;
import general.Predator;

public class Shark extends FishCarnivorous implements Predator {

	public Shark(int weight, int lifetime, Sex sex, int lenght, int speed, Fertilization fertilization,
			int numberOfTeeth) {
		super(weight, lifetime, sex, lenght, speed, fertilization, numberOfTeeth);

	}

	

	@Override
	public boolean UnderwaterAttack() {
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
		if (animal instanceof Mammal || animal instanceof Bird || animal instanceof Fish && speed > 0 && weight > 3)
			return true;
		else
			return false;		
	}



	@Override
	public void kill(Animal animal) {
		setWeight((getWeight() + (animal.getWeight() * .004)));		
	}

}
