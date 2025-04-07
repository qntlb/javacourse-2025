package com.alessandrosgarabottolo.session1.switches;

import java.util.Random;

/**
 * Examples of switch statement: it selects among pieces of codes based on the
 * value of an integral expression, i.e., an expression whose result is an
 * integer, a char or a String
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class ARandomSwitch {

	public static void main(String[] args) {
		Random randomNumberGenerator = new Random();
		int switchValue = randomNumberGenerator.nextInt(7);
		System.out.println("The generated number is " + switchValue);
		System.out.println();
		
		switch (switchValue /* integer between 0 and 6 */ ) {
		/*
		 * The switch statement compares the value of switchValue to each value listed below.
		 * If it finds a match, the corresponding statement executes. If no match
		 * occurs, the default statement executes.
		 */
		case 0:
			System.out.println("The selected number has been invented by the Arabs");
			break; // the break causes execution to jump to the end of the switch body.
			// you can eliminate break to see what happens

		case 2:
			System.out.println("The selected number is the smallest positive even number");
			break;

		case 4:
			System.out.println("The selected number is the number of seasons");
			break;

		case 6:
			System.out.println("The selected number is the numbers of faces of a dice");
			break;

		default: // if no match occurs
			System.out.println("The selected number is odd ");
			/*
			 * The statement following the default doesn’t need a break because the
			 * execution of the switch statement ends anyway.
			 * One could put a break at the end of the default statement and the result would be the same.
			 */

		}
	}
}
