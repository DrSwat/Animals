package general;

public abstract class BirdGranivorous extends Bird {

	private int eatGrown;

	public BirdGranivorous(int weight, int age, Sex sex, int growth, int wingspan, int rangeOfFlight, boolean canFlight,
			int eatGrown, int speed) {
		super(weight, age, sex, growth, wingspan, rangeOfFlight, canFlight, speed);
		this.eatGrown = eatGrown;
	}

	public abstract boolean flightFlock();

	public int getEatGrown() {
		return eatGrown;
	}

	public void setEatGrown(int eatGrown) {
		this.eatGrown = eatGrown;
	}
}
