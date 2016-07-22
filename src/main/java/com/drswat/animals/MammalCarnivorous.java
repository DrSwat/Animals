package com.drswat.animals;

public abstract class MammalCarnivorous extends Mammal implements Predator {
	int quantityOfTeeth;

	public MammalCarnivorous(double weight, int lifetime, Sex sex, int height, int lenght, int speed,
			int quantityOfTeeth) {
		super(weight, lifetime, sex, height, lenght, speed);
		this.quantityOfTeeth = quantityOfTeeth;
	}

	public int getQuantityOfTeeth() {
		return quantityOfTeeth;
	}

	public abstract boolean rush();

	public void setQuantityOfTeeth(int quantityOfTeeth) {
		this.quantityOfTeeth = quantityOfTeeth;
	}

}
