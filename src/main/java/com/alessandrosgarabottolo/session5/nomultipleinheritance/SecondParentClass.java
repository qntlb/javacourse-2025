package com.alessandrosgarabottolo.session5.nomultipleinheritance;

/**
 * This class has a method public void methodWithSameName(), so same name and
 * same argument list as the one of FirstParentClass, with a different implementation.
 * Moreover, it has a field int i which has same name as the field in FirstParentClass.
 * Here it gets initialized to be equal to 2, whereas in FirstParentClass it is 1.
 * This possibility of having conflicts is the main reason why multiple inheritance is
 * not permitted in Java.
 */
public abstract class SecondParentClass {

	protected int i;

	/*
	 * Look at the constructor of the other class, where i is set to be 1: this can
	 * lead to a a conflict!
	 */
	public SecondParentClass() {
		i = 2; // this creates a conflict with FirstParentClass
	}
	
	public abstract void abstractMethod(); // this has to be implemented by subclasses

	// conflict with the method defined and implemented in FirstParentClass
	public void methodWithSameName() {
		System.out.println("Implementation of the method in the second class");
	}
	
	public void secondInterestingMethod() {
		System.out.println("This is also a very interesting method");
	}

}
