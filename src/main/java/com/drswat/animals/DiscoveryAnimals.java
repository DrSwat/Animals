package com.drswat.animals;

import com.drswat.animals.Animal.Sex;

public class DiscoveryAnimals {

	public static void main(String[] args) {
		Magpie magpie0 = new Magpie(.005, 1, Sex.female, 10, 10, 50, true, 3, 10);
		Magpie magpie1 = new Magpie(.005, 1, Sex.female, 10, 10, 50, true, 3, 10);
		Magpie magpie2 = new Magpie(.005, 1, Sex.female, 10, 10, 50, true, 3, 10);
		Magpie magpie3 = new Magpie(.005, 1, Sex.female, 10, 10, 50, true, 3, 1);
		Magpie magpie4 = new Magpie(.0005, 1, Sex.female, 10, 10, 50, true, 3, 10);

		Ant ant0 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
		Ant ant1 = new Ant(.00050, 1, Sex.male, 4, 1, 1);
		Ant ant2 = new Ant(.00150, 1, Sex.male, 4, 1, 1);
		Ant ant3 = new Ant(.00150, 1, Sex.male, 4, 1, 2);
		Ant ant4 = new Ant(.00150, 1, Sex.male, 4, 1, 1);

		magpie0.kill(ant0);
		magpie1.kill(ant1);
		magpie2.kill(ant2);
		magpie3.kill(ant3);
		magpie4.kill(ant4);
		double a = ant0.getWeight();
		double b = ant1.getWeight();
		double c = ant2.getWeight();
		double d = ant3.getWeight();
		double e = ant4.getWeight();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		// if(canKill(animal) == true)
		// setWeight((getWeight() + (animal.getWeight() * .004)));
		// else
		// setWeight(1000000010);

	}

}
