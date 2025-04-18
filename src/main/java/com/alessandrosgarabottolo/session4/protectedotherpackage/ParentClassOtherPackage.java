package com.alessandrosgarabottolo.session4.protectedotherpackage;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * This class shows the effects of inheritance and of the protected access modifier.
 * It has one protected field and one protected method, which will be inherited and called
 * from a class in another package.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class ParentClassOtherPackage {

	protected int i = 6;
	
	protected void computeAndSetDouble() {
		printn("A protected method in another package. You can call it from methods"
				+ " of all classes that inherit from this class");
		i *= 2;
	}

	//only package access!
	void computeAndSetHalf() {
		i /= 2.;
	}
}
