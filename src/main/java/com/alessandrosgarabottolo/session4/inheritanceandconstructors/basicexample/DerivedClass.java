package com.alessandrosgarabottolo.session4.inheritanceandconstructors.basicexample;

/**
 * This is a very simple example of inheritance: DerivedClass extends
 * ParentClass (i.e., it is a subclass of ParentClass). Look at the syntax!
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */

public class DerivedClass extends ParentClass {

	DerivedClass() {
		/*
		 * The constructor super() of the parent class is called implicitly: when you
		 * create an object of the derived class, it will automatically contain a
		 * subobject of the parent class.
		 */
		System.out.println("Calling the constructor of the derived class");
	}
}
