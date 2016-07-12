package general;

public abstract class Bird extends Animal {
	private int growth;
	private int wingspan;
	private int rangeOfFlight;
	private boolean canFlight;

	public Bird(double weight, int age, Sex sex, int growth, int wingspan, int rangeOfFlight, boolean canFlight, int speed) {
		super(weight, age, sex, speed);
		this.growth = growth;
		this.wingspan = wingspan;
		this.rangeOfFlight = rangeOfFlight;
		this.canFlight = canFlight;
	}

	public int getGrowth() {
		return growth;
	}

	public int getRangeOfFlight() {
		return rangeOfFlight;
	}

	public int getWingspan() {
		return wingspan;
	}

	public boolean isCanFlight() {
		return canFlight;
	}

	public void setCanFlight(boolean canFlight) {
		this.canFlight = canFlight;
	}

	public void setGrowth(int growth) {
		this.growth = growth;
	}

	public void setRangeOfFlight(int rangeOfFlight) {
		this.rangeOfFlight = rangeOfFlight;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

}