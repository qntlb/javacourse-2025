package com.alessandrosgarabottolo.session5.abstractclasses.basicexample;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * This class extends AbstractBaseClass and implements abstractMethod().
 * Note that it MUST implement it: every non abstract class that extends an abstract
 * class MUST implement its abstract methods. It makes sense: these methods have
 * to be implemented somewhere! The non-abstract methods, on the other hand, can
 * be just inherited as they are already implemented in the base class.
 * However, they can also be overridden.
 */
public class DerivedClassFromAbstract extends AbstractBaseClass {

	
	public DerivedClassFromAbstract() {
		printn("Created a class that extends AbstractBaseClass");
	}
	
	@Override
	protected void abstractMethod() {
		printn("Overriding of the abstract method");
	}

	public void specificMethod() {
		printn("Specific method");
	}
}
