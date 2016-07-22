package com.drswat.animals;

public abstract class InsectHerbivorous extends Insect implements Run {
	public enum Mouth {
		proboscis, antennae
	}

	private Mouth mouth;

	public InsectHerbivorous(double weight, int age, Sex sex, int quantityLegs, Mouth mouth, int speed) {
		super(weight, age, sex, quantityLegs, speed);
		this.mouth = mouth;
	}

	public Mouth getMouth() {
		return mouth;
	}

	public void setMouth(Mouth mouth) {
		this.mouth = mouth;
	}
}
