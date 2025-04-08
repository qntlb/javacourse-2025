package com.alessandrosgarabottolo.session1.primenumbers;

/**
 * This class checks if a number is prime by using a simple for method and an if statement
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
	// TODO implement the method with a for loop, starting from i=2, incrementing by 1, and checking if numberToBeChecked is divisible by i
	// Hint: use Math.sqrt(numberToBeChecked) to obtain the square root of numberToBeChecked
	for (int possibleDivisor = 2; possibleDivisor <= Math.sqrt(numberToBeChecked); possibleDivisor++) {
		if (numberToBeChecked % possibleDivisor == 0) {
			smallestDivisor = possibleDivisor;
			return false;
		}
	}
	return true;
	}
}
