package com.alessandrosgarabottolo.session5.inheritinginterfaces;

/**
 * A class implementing the first interface, i.e., implementing firstMethod()
 */
public class ClassImplementingFirstInterface implements FirstInterface {

	@Override
	public void firstMethod() {
		System.out.println("Implementation of method 1, specific of this class");
	}

}
