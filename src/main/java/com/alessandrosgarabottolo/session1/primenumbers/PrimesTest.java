package com.alessandrosgarabottolo.session1.primenumbers;

/**
 * This class checks if a number is prime
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class PrimesTest {

	public static void main(String[] args) {
		
		int numberToBeChecked = 31;

		PrimesCheck checker = new PrimesCheck();

		boolean result = checker.checkIfPrime(numberToBeChecked);

		System.out.println("Is the number " + numberToBeChecked + " prime? " + (result ? "Yes" : "No"));
		
		if (!result) {
			System.out.println("The smallest nontrivial divisor of " + numberToBeChecked + " is " + checker.smallestDivisor);
		}
	}
}
