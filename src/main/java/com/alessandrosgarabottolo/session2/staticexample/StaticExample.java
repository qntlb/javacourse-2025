package com.alessandrosgarabottolo.session2.staticexample;
/**
 * This class contains two methods, a static one and a non-static one.
 * It is shown that it is not possible to reference to non-static methods and
 * non-static variables of the class from a static method.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class StaticExample {

	static int staticField = 8;
	int nonStaticField = 3;

	void printFields() { // non-static print method
		System.out.println("Non static field: " + nonStaticField + " Static field: " + staticField);
	}

	static void staticModifier() {  //static method
		staticField++;
		//printFields(); //Error: static method cannot reference non static methods!!
		//nonStaticField++; //Error: static method cannot reference non static variables!!
	}

}

