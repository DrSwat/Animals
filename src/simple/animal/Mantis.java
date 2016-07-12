package simple.animal;

import general.Animal;
import general.Bird;
import general.Insect;
import general.InsectCarnivorous;
import general.Mammal;
import general.Predator;

public class Mantis extends InsectCarnivorous implements Predator {

	public Mantis(double weight, int age, Sex sex, int quantityLegs, Weapon weapon, int speed) {
		super(weight, age, sex, quantityLegs, weapon, speed);
	}

	@Override
	public boolean Attak() {
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
		if ((animal instanceof Mammal || animal instanceof Bird || animal instanceof Insect) && speed >= 0 && weight < 3)
			return true;
		else
			return false;		
	}

	@Override
	public void kill(Animal animal) {
		setWeight((getWeight() + (animal.getWeight() * .004)));		
	}

	

}
