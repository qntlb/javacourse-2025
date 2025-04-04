package com.alessandrosgarabottolo.session1.divisible;

/**
 * This class checks if a number is divisible by another number: this is a very simple example of if/else statement
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class Divisible {

	public static void main(String[] args) {

		int dividend = 16;
		int divisor = 5;

		// the parenthesis are not necessary, but this way the code is more readable
		boolean statement = (dividend % divisor == 0);
		// recall: the operator % gives the reminder of the ratio of two numbers
		if (statement) {
			// or directly:
			// if (dividend % divisor == 0) //more common. Writing it separately I wanted to stress the fact that it's a boolean
			System.out.println(dividend + " is divisible by " + divisor);
		}
		else {
			System.out.println(dividend + " is not divisible by " + divisor);
		}
	}
}
