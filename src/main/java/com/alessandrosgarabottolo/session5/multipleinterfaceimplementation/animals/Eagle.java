package com.alessandrosgarabottolo.session5.multipleinterfaceimplementation.animals;

/**
 * A class which implements the AnimalThatFlies interface, and therefore in particular
 * the fly() method
 */
public class Eagle implements AnimalThatFlies {

	@Override
	public void fly() {// methods defined in the interface must be public!
		System.out.println("An eagle flies");
	}

	@Override
	public void eat() {// methods defined in the interface must be public!
		System.out.println("An eagle eats");
	}
}
