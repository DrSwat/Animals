package general;

public abstract class Insect extends Animal {
	private int quantityLegs;

	public Insect(int weight, int age, Sex sex, int quantityLegs, int speed) {
		super(weight, age, sex, speed);
		this.quantityLegs = quantityLegs;
	}

	public int getQuantityLegs() {
		return quantityLegs;
	}

	public void setQuantityLegs(int quantityLegs) {
		this.quantityLegs = quantityLegs;
	}
}
