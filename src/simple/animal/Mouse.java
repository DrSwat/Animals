package simple.animal;

import general.JustEat;
import general.MammalHerbivorous;
import general.Run;

public class Mouse extends MammalHerbivorous implements JustEat, Run {

	public Mouse(double weight, int age, Sex sex, int height, int lenght, int speed, int quatityOfStomach) {
		super(weight, age, sex, height, lenght, speed, quatityOfStomach);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean justRun() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eat() {
		// TODO Auto-generated method stub
		return false;
	}

}
