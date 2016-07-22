package com.drswat.animals;

public interface Predator {

	public boolean canKill(Animal animal);

	public void kill(Animal animal);
}