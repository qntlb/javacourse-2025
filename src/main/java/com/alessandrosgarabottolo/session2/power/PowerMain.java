package com.alessandrosgarabottolo.session2.power;

/**
 * This class tests the Power class. If the base is a negative number and the exponent a double,
 * the user will be warned that the result is a complex number.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class PowerMain {

	public static void main(String[] args) {
		Power powerCalculator = new Power();
		double base = - 3.2; // negative number!
		int intExponent = 2;
		double doubleExponent = 2.5;
		powerCalculator.computePower(base, intExponent); // everything is fine: the arguments are double, int
		powerCalculator.computePower(base, doubleExponent); // the arguments are now double, double: the result can be a complex number
	}
}
