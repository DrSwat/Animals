package general;

public abstract class Animal {
	public enum Sex {
		male, female, undefined
	}

	private double weight;
	private int age;
	private Sex sex;
	private int speed;

	public Animal(int weight, int age, Sex sex, int speed) {
		super();
		this.weight = weight;
		this.age = age;
		this.setSex(sex);
		this.speed = speed;
	}

	public int getAge() {
		return age;
	}

	public Sex getSex() {
		return sex;
	}

	public double getWeight() {
		return weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public void setWeight(double d) {
		this.weight = d;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
