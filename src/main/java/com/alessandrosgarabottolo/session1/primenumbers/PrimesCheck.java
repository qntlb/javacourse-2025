package com.alessandrosgarabottolo.session1.primenumbers;

/**
 * This class checks if a number is prime by using a simple for method and
 * an if statement
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class PrimesCheck {

	int smallestDivisor = 1;
	
	boolean checkIfPrime(int numberToBeChecked) {

		for (int possibleDivisor = 2; possibleDivisor <= Math.sqrt(numberToBeChecked); possibleDivisor++) {
			if (numberToBeChecked % possibleDivisor == 0) {// only if statement, without else
				smallestDivisor = possibleDivisor; // we store the smallest nontrivial divisor for non-prime numbers 
				return false; // return ends the loop and exit the method
			}
		}
		return true;
	}

}
