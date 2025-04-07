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
		
		// for non-prime numbers, can we know which is the smallest nontrivial divisor of numberToBeChecked?
	}
}
