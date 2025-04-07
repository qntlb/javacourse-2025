package com.alessandrosgarabottolo.session2.divisiblewithconstructor;


/**
 * This class tests if an integer is divisible by another integer. In the main method, a value of
 * dividend and divisor is given and passed to he constructor of CheckDivisibleWithConstructor.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class MainDivisibleConstructor {

	public static void main(String[] args) {

		int dividend = 6;
		int divisor = 2;
		//creation of a new object of type CheckDivisible, passing the two integers through the constructor.
		CheckDivisibleWithConstructor checkDivisible = new CheckDivisibleWithConstructor(dividend, divisor);
		checkDivisible.check(); // call of the method

		CheckDivisibleWithConstructor secondCheckDivisible = new CheckDivisibleWithConstructor(3, 2);
		secondCheckDivisible.check(); // call of the method

	}
	
}
