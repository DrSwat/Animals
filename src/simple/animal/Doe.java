package simple.animal;

import general.JustEat;
import general.MammalHerbivorous;
import general.Run;

public class Doe extends MammalHerbivorous implements Run, JustEat {

	public Doe(int weight, int age, Sex sex, int height, int lenght, int speed, int quatityOfStomach) {
		super(weight, age, sex, height, lenght, speed, quatityOfStomach);
	}

	@Override
	public boolean justRun() {
		int i = (int) (Math.random() * 2);
		if (i % 2 == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean eat() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
