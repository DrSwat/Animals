package simple.animal;

import general.Animal;
import general.Bird;
import general.Mammal;
import general.MammalCarnivorous;
import general.Predator;

public class Ñheetah extends MammalCarnivorous implements Predator {

	public Ñheetah(int weight, int lifetime, Sex sex, int height, int lenght, int speed, int quantityOfTeeth) {
		super(weight, lifetime, sex, height, lenght, speed, quantityOfTeeth);

	}

	@Override
	public boolean rush() {
		int i = (int) (Math.random() * 4);
		if (i % 2 == 0)
			return true;
		else
			return false;

	}

	@Override
	public boolean canKill(Animal animal) {
		double weight = animal.getWeight() / getWeight();
		double speed = getSpeed() - animal.getSpeed();
		if (animal instanceof Mammal || animal instanceof Bird && speed > 0 && weight > 3)
			return true;
		else
			return false;

	}

	@Override
	public void kill(Animal animal) {
		setWeight((getWeight() + (animal.getWeight() * .004)));

	}

}
