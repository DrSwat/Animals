package simple.animal;

import general.Animal;
import general.Feed;
import general.Predator;

public class Human implements Predator, Feed {
	private int crown;
	private int cartridges;

	@Override
	public boolean canKill(Animal animal) {
		
			return false;
	}

	@Override
	public void feed(int amount) {

	}

	public int getCartridges() {
		return cartridges;
	}

	public int getCrown() {
		return crown;
	}

	@Override
	public void kill(Animal animal) {

	}

	public void setCartridges(int cartridges) {
		this.cartridges = cartridges;
	}

	public void setCrown(int crown) {
		this.crown = crown;
	}

	public boolean shot() {
		int i = (int) (Math.random() * 2);
		if (i % 2 == 0)
			return true;
		else
			return false;
	}
}
