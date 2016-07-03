package simple.animal;

import general.Animal;
import general.Fish;
import general.FishCarnivorous;
import general.Insect;

public class Catfish extends FishCarnivorous {

	public Catfish(int weight, int lifetime, Sex sex, int lenght, int speed, Fertilization fertilization,
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
		if (animal instanceof Fish || animal instanceof Insect && speed > 0 && weight > 3)
			return true;
		else
			return false;
		
	}





	@Override
	public void kill(Animal animal) {
		setWeight((getWeight() + (animal.getWeight() * .004)));		
	}

}