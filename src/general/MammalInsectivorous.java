package general;

public abstract class MammalInsectivorous extends Mammal implements JustEat {

	private int mouthparts;

	public MammalInsectivorous(int weight, int age, Sex sex, int height, int lenght, int speed, int mouthparts) {
		super(weight, age, sex, height, lenght, speed);
		this.mouthparts = mouthparts;
	}

	public int getMouthparts() {
		return mouthparts;
	}

	public void setMouthparts(int mouthparts) {
		this.mouthparts = mouthparts;
	}

}
