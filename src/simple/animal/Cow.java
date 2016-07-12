package simple.animal;

import general.MammalHerbivorous;

public class Cow extends MammalHerbivorous {
	private int horn = 2;

	public Cow(double weight, int age, Sex sex, int height, int lenght, int speed, int quatityOfStomach, int horn) {
		super(weight, age, sex, height, lenght, speed, quatityOfStomach);
		this.horn = horn;
	}

	public boolean BlowTheHorn() {
		int i = (int) (Math.random() * 2);
		if (i % 2 == 0)
			return true;
		else
			return false;
	}

	public int getHorn() {
		return horn;
	}

	@Override
	public boolean justRun() {
		
			return false;
	}

	public void setHorn(int horn) {
		this.horn = horn;
	}

}
