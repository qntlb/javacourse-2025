package com.alessandrosgarabottolo.session5.nomultipleinheritance;

/**
 * This class extends FirstParentClass. It has a specific method and inherits
 * the implementation of methodWithSameName(). If we make it SecondParentClass
 * as well, which implementation would it inherit?
 * Note that this is just a motivation: we could not write something like
 * public class DerivedClass extends FirstParentClass, SecondParentClass
 * even if there was no conflict.
 */
public class DerivedClass extends FirstParentClass{

	/*
	 * This class has no constructor, therefore, the default one is called.
	 * If this class inherits from both classes, both the parents
	 * constructors would be called, but then, which value would be set for i?
	 */
	public void specificMethod() {
		System.out.println("A method of the derived class");
	}
	
	@Override
	public void abstractMethod() {
		System.out.println("Implementation of the abstract method");
	}

	public void printI() {
		System.out.println(i);
	}
}
