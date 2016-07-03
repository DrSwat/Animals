package simple.animal;

import general.FishHerbivorous;
import general.JustEat;

public class SilverCarp extends FishHerbivorous implements JustEat {

	public SilverCarp(int weight, int age, Sex sex, int lenght, int speed, Fertilization fertilization, int seaweed) {
		super(weight, age, sex, lenght, speed, fertilization, seaweed);
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
