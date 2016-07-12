package general;

public abstract class Mammal extends Animal {

	private int height;
	private int lenght;

	public Mammal(double weight, int age, Sex sex, int height, int lenght, int speed) {
		super(weight, age, sex, speed);
		this.height = height;
		this.lenght = lenght;
	}

	public int getHeight() {
		return height;
	}

	public int getLenght() {
		return lenght;
	}

	

	public void setHeight(int height) {
		this.height = height;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	

}
