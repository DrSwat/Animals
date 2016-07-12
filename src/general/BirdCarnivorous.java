package general;

public abstract class BirdCarnivorous extends Bird implements Predator {

	private int eatAnimal;

	public BirdCarnivorous(double weight, int lifetime, Sex sex, int growth, int wingspan, int rangeOfFlight,
			boolean canFlight, int eatAnimal, int speed) {
		super(weight, lifetime, sex, growth, wingspan, rangeOfFlight, canFlight, speed);
		this.eatAnimal = eatAnimal;
	}

	public abstract boolean airAttak();

	public int getEatAnimal() {
		return eatAnimal;
	}

	public void setEatAnimal(int eatAnimal) {
		this.eatAnimal = eatAnimal;
	}
}
