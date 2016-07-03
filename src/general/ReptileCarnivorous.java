package general;

public abstract class ReptileCarnivorous extends Animal implements Predator {
	boolean hibernation;

	public ReptileCarnivorous(int weight, int lifetime, Sex sex, boolean hibernation, int speed) {
		super(weight, lifetime, sex, speed);
		this.hibernation = hibernation;
	}

	public abstract boolean DeadlyThrow();

	public boolean isHibernation() {
		return hibernation;
	}

	public void setHibernation(boolean hibernation) {
		this.hibernation = hibernation;
	}
}
