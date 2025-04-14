package com.alessandrosgarabottolo.session5.inheritinginterfaces;

/**
 * This class MUST implement firstMethod(), secondMethod() (that InheritingInterface has
 * inherited from FirstInterface and SecondInterface) and thirdMethod(), which is an own method
 * of InheritingInterface. Moreover, it inherits aClassMethod() and, in this case, it overrides it.
 */
public class InheritingAndImplementingClass extends FirstClass implements InheritingInterface {

	@Override
	public void firstMethod() {
		System.out.println("Implementation of method 1");
	}

	@Override
	public void secondMethod() {
		System.out.println("Implementation of method 2");
	}

	@Override
	public void thirdMethod() {
		System.out.println("Implementation of method 3");
	}

	@Override // this is not mandatory, the class could also simply inherit aClassMethod from FirstClass
	void aClassMethod() {
		System.out.println("Overriding of class method");
	}
	
}
