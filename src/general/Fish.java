package general;

public abstract class Fish extends Animal {
	public enum Fertilization {
		inside, outside
	}

	private int lenght;

	private Fertilization fertilization;

	public Fish(double weight, int age, Sex sex, int lenght, int speed, Fertilization fertilization) {
		super(weight, age, sex, speed);
		this.lenght = lenght;
		this.fertilization = fertilization;
	}

	public Fertilization getFertilization() {
		return fertilization;
	}

	public int getLenght() {
		return lenght;
	}

	

	public void setFertilization(Fertilization fertilization) {
		this.fertilization = fertilization;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	

}
