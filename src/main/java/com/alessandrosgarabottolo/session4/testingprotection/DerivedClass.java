package com.alessandrosgarabottolo.session4.testingprotection;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

import com.alessandrosgarabottolo.session4.protectedotherpackage.ParentClassOtherPackage;

/**
 * This class extends a class which is in another package. The base class
 * contains a protected field and a protected method. We observe that methods of
 * the derived class can access the protected fields and call the protected
 * methods of the base class, which they inherit.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class DerivedClass extends ParentClassOtherPackage {
	
	public DerivedClass(int i) {
		/*
		 * i gets inherited from the base class: it is defined in the base class.
		 * However, its value can be set from outside the package of the class where it
		 * is defined only because it is protected. Try to go in ProtectedOtherPackage and
		 * make it with just package access. You see hat now you get an error here.
		 */
		this.i = i;
	}

	/**
	 * It computes and prints the value of the fields i 
	 */
	public void printField() {
		printn(i);// i here is a field of the base class!
	}

	/**
	 * It computes and prints the value of the sin of 2i 
	 */
	public void computeAndPrintSinOfDouble() {
		/*
		 * computeAndSetDouble() gets inherited from the base class: it is defined in the base
		 * class. However, it can be called from outside the package of the class where
		 * it is defined because it is protected. Try to go in ProtectedOtherPackage and
		 * make it with just package access. You see that now you get an error here.
		 */
		computeAndSetDouble();
		printn("The sin of 2i is " + Math.sin(i));
	}

	/**
	 * It computes and prints the value of sin(i/2)
	 */
	public void computeAndPrintSinOfHalf() {
		// you can't call computeAndSetHalf() because it is not protected!
		//computeAndSetHalf();
		printn(Math.sin(i / 2.));
	}
}
