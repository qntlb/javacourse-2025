package com.alessandrosgarabottolo.session3.encapsulation.logarithms;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * In the main method of this class we see how encapsulation works, preventing the user to obtain
 * unwanted results when computing the logarithm of a number.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class LogarithmClient {

	public static void main(String[] args) {

		LogarithmCalculator logarithmExample = new LogarithmCalculator();
		double inputNumber = -3;
		
		//logarithmExample.number = inputNumber; // the user cannot do that because number is a private field
		logarithmExample.setNumber(inputNumber); // use of setter
	
		printn("The logarithm of " + logarithmExample.getNumber() + " is " + logarithmExample.computeLogarithm());
	}
}