package com.drswat.animals;

public abstract class MammalHerbivorous extends Mammal implements Run {

	private int quatityOfStomach;

	public MammalHerbivorous(double weight, int age, Sex sex, int height, int lenght, int speed, int quatityOfStomach) {
		super(weight, age, sex, height, lenght, speed);
		this.quatityOfStomach = quatityOfStomach;
	}

	public int getQuatityOfStomach() {
		return quatityOfStomach;
	}

	public void setQuatityOfStomach(int quatityOfStomach) {
		this.quatityOfStomach = quatityOfStomach;
	}

}
