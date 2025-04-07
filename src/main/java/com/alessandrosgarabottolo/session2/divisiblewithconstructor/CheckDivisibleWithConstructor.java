package com.alessandrosgarabottolo.session2.divisiblewithconstructor;

/**
 * In this class we check if an integer is divisible by another integer. The two are passed to the
 * constructor, which takes two integers as arguments. It illustrates the use of "this" to reference
 * the object itself, thus allowing for the argument name of the constructor to match the field name.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class CheckDivisibleWithConstructor {

	int dividend;
	int divisor;

	CheckDivisibleWithConstructor(int dividend, int divisor)
	{
		/*
		 * The constructor sets the data field this.dividend to the value of the argument dividend.
		 * The keyword "this" resolves the name clash (otherwise the local variable/parameter "shadows" the field).
		 */
		this.dividend = dividend; //note the use of this
		this.divisor = divisor;
	}

	//the method checks if dividend is divisible by divisor. These are fields of the class.
	void check() {
		if (dividend % divisor == 0) {
			System.out.println(dividend + " is divisible by " + divisor);
		} else {
			System.out.println(dividend + " is not divisible by " + divisor);
		}
	}

}
