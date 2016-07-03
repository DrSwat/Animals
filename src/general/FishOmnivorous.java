package general;

public abstract class FishOmnivorous extends Fish implements JustEat {
	private int eatFood;

	public FishOmnivorous(int weight, int age, Sex sex, int lenght, int speed, Fertilization fertilization,
			int eatFood) {
		super(weight, age, sex, lenght, speed, fertilization);
		this.eatFood = eatFood;
	}

	public int getEatFood() {
		return eatFood;
	}

	public void setEatFood(int eatFood) {
		this.eatFood = eatFood;
	}

}
