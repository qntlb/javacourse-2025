package com.alessandrosgarabottolo.session1.gauss;

/**
 * This class uses a simple for loop as well as the Gauss formula in order to compute the sum of natural
 * numbers from 1 to a given number,
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class SumOfIntegers {

	/**
	 * Compute the sum of natural numbers from 1 to lastNumber, with a for loop. As an extra, it also prints
	 * all those numbers.
	 *
	 * @param lastNumber: final number of the sum
	 * @return the sum from 1 to lastNumber
	 */
	int sumUpToNumber(int lastNumber) {
		int sum = 0;
		// TODO: implement the method. Hint: to increase sum by a number you can use sum = sum + number or sum += number.
		return sum;
	}
	
	/**
	 * Compute the sum of natural numbers from 1 to lastNumber, using Gauss formula. 
	 *
	 * @param lastNumber: final number of the sum
	 * @return the sum from 1 to lastNumber
	 */
	int sumUpToNumberWithGauss(int lastNumber) {
		int sumWithGauss = lastNumber * (lastNumber + 1) / 2;
		return sumWithGauss;	
	}
}
