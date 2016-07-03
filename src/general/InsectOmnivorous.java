package general;

public abstract class InsectOmnivorous extends Insect implements JustEat {
	private int range;

	public InsectOmnivorous(int weight, int age, Sex sex, int quantityLegs, int range, int speed) {
		super(weight, age, sex, quantityLegs, speed);
		this.range = range;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

}
