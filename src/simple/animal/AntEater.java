package simple.animal;

import general.Animal;
import general.MammalInsectivorous;
import general.Predator;

public class AntEater extends MammalInsectivorous implements Predator {

	public AntEater(double weight, int age, Sex sex, int height, int lenght, int speed, int mouthparts) {
		super(weight, age, sex, height, lenght, speed, mouthparts);
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
		
		if (animal instanceof Ant)
			return true;
		else
			return false;
	}

	@Override
	public void kill(Animal animal) {
		setWeight((getWeight() + (animal.getWeight() * .004)));
	}

}
