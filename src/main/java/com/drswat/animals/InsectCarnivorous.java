package com.drswat.animals;

public abstract class InsectCarnivorous extends Insect implements Predator {
	public enum Weapon {
		sting, fangs
	}

	private Weapon weapon;

	public InsectCarnivorous(double weight, int age, Sex sex, int quantityLegs, Weapon weapon, int speed) {
		super(weight, age, sex, quantityLegs, speed);
		this.weapon = weapon;
	}

	public abstract boolean Attak();

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
