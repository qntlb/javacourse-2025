package com.alessandrosgarabottolo.session5.multipleinterfaceimplementation.animals;

/**
 * Multiple implementation: this class implements both the interfaces, and then
 * both the methods. Note: multiple inheritance is not allowed with classes and
 * abstract classes.
 */
public class Duck implements AnimalThatSwims, AnimalThatFlies {

	@Override
	public void swim() {// methods defined in the interface must be public!
		System.out.println("A duck swims");
	}

	@Override
	public void fly() {// methods defined in the interface must be public!
		System.out.println("A duck flies");
	}

	@Override
	public void eat() {// methods defined in the interface must be public!
		System.out.println("A duck eats");
		System.out.println(interfaceField); //POSSIBLE CONFLICT!
//		interfaceField = 12; //not possible! It is implicitly final
	}
}
