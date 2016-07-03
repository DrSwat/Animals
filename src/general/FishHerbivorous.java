package general;

public abstract class FishHerbivorous extends Fish implements Run {
	private int seaweed;

	public FishHerbivorous(int weight, int age, Sex sex, int lenght, int speed, Fertilization fertilization,
			int seaweed) {
		super(weight, age, sex, lenght, speed, fertilization);
		this.seaweed = seaweed;
	}

	public int getSeaweed() {
		return seaweed;
	}

	public void setSeaweed(int seaweed) {
		this.seaweed = seaweed;
	}

}
