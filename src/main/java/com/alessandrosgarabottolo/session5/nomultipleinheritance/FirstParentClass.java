package com.alessandrosgarabottolo.session5.nomultipleinheritance;

/**
 * This class has a method void methodWithSameName() with a given implementation, and a field i
 * which is initialized to be 1.
 */
public abstract class FirstParentClass {

	protected int i;

	public FirstParentClass() {
		i = 1;
	}
	
	public abstract void abstractMethod(); // this has to be implemented by subclasses

	public void methodWithSameName() {
		System.out.println("Implementation of the method in the first class");
	}

	public void firstInterestingMethod() {
		System.out.println("This is a very interesting method");
	}
}
