package general;

public abstract class FishCarnivorous extends Fish implements Predator {
	private int numberOfTeeth;

	public FishCarnivorous(int weight, int lifetime, Sex sex, int lenght, int speed, Fertilization fertilization,
			int numberOfTeeth) {
		super(weight, lifetime, sex, lenght, speed, fertilization);
		this.numberOfTeeth = numberOfTeeth;
	}

	public int getNumberOfTeeth() {
		return numberOfTeeth;
	}

	public void setNumberOfTeeth(int numberOfTeeth) {
		this.numberOfTeeth = numberOfTeeth;
	}

	public abstract boolean UnderwaterAttack();

}
