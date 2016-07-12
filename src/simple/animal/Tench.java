package simple.animal;

import general.Animal;
import general.Fish;
import general.FishOmnivorous;
import general.Insect;
import general.JustEat;
import general.Predator;

public class Tench extends FishOmnivorous implements Predator, JustEat {

	public Tench(double weight, int age, Sex sex, int lenght, int speed, Fertilization fertilization, int eatFood) {
		super(weight, age, sex, lenght, speed, fertilization, eatFood);
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
		if ((animal instanceof Fish || animal instanceof Insect) && speed >= 0 && weight < 3)
			return true;
		else
			return false;		
	}



	@Override
	public void kill(Animal animal) {
		setWeight((getWeight() + (animal.getWeight() * .004)));		
	}

	

}
