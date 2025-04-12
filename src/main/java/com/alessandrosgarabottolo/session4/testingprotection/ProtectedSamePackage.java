package com.alessandrosgarabottolo.session4.testingprotection;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * This class has one protected field and one protected method, which are called from a class
 * in the same package. This is possible because protected fields
 * have package access.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class ProtectedSamePackage {
	
	protected int j = 6;

	protected void computeAndSetDouble() {
		printn("A protected method. You can call it from the same package or from classes that extend ProtecetedSamePackage");
		j = j * 2;
	}

}
