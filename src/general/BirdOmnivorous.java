package general;

public abstract class BirdOmnivorous extends Bird implements JustEat {

	private int eatFood;

	public BirdOmnivorous(int weight, int age, Sex sex, int growth, int wingspan, int rangeOfFlight, boolean canFlight,
			int eatFood, int speed) {
		super(weight, age, sex, growth, wingspan, rangeOfFlight, canFlight, speed);
		this.eatFood = eatFood;
	}

	public int getEatFood() {
		return eatFood;
	}

	public void setEatFood(int eatFood) {
		this.eatFood = eatFood;
	}

}
