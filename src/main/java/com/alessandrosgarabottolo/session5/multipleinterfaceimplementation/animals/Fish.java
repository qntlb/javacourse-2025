package com.alessandrosgarabottolo.session5.multipleinterfaceimplementation.animals;

/**
 * A class which implements the AnimalThatSwims interface, and therefore in particular
 * the swim() method
 */
public class Fish implements AnimalThatSwims {

	@Override
	public void swim() {// methods defined in the interface must be public!
		System.out.println("A fish swims");
	}

	@Override
	public void eat() {// methods defined in the interface must be public!
		System.out.println("A fish eats");
	}
}
