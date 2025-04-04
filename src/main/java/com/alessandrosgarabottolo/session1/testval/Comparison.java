package com.alessandrosgarabottolo.session1.testval;

/**
 * This class is used to check if a given number is inside an interval. Example
 * of if/else statement with logic operators
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class Comparison {

	// note: the Javadoc documentation of a method describes the parameters
	// and the return value
	/**
	 * Checks whether a given number is inside a specified interval [leftEnd, rightEnd].
	 *
	 * @param testedNumber: number which has to be tested
	 * @param leftEnd:      left boundary of the interval
	 * @param rightEnd:     right boundary of the interval
	 * @return {@code true} if {@code testedNumber} is inside the interval, {@code false} if not
	 */
	boolean isInside(double testedNumber,
			double leftEnd, double rightEnd) {
		if (testedNumber < leftEnd || testedNumber > rightEnd) {
			/*
			 * the return keyword has two purposes: it specifies what value a method will
			 * return (if the method doesn’t have a void return value) and it immediately
			 * ends the method.
			 */
			return false;
		} else {
			/*
			 * since the method returns a boolean, you must have a return statement in both
			 * cases
			 */
			return true;
		}
	}

	/*
	 * Another way to do it: indeed, having an if/else statement above did not make
	 * a lot of sense
	 */
	/**
	 * Checks whether a given number is inside a specified interval [leftEnd, rightEnd].
	 *
	 * @param testedNumber: number which has to be tested
	 * @param begin:     left boundary of the interval
	 * @param end:       right boundary of the interval
	 * @return true if testedNumber is inside the interval, false if not
	 */
	boolean compactIsInside(double testedNumber, double leftEnd, double rightEnd) {
		/*
		 * the operator "!" applied to a boolean returns the opposite of its value:
		 * false if the value of the boolean is true and true if it is false
		 */
		//return (testedNumber >= leftEnd & testedNumber <= rightEnd);
		return !(testedNumber < leftEnd || testedNumber > rightEnd);
	}

	/**
	 * Checks whether a given number is inside a specified interval [leftEnd, rightEnd].
	 *
	 * @param testedNumber: number which has to be tested
	 * @param begin:     left boundary of the interval
	 * @param end:       right boundary of the interval
	 * @return 1 if testedNumber is inside the interval, 0 if not
	 */
	int isInsideAsInt(double testedNumber, double leftEnd, double rightEnd) {
		/*
		 * this is the so called ternary operator. It consists of a boolean value,
		 * followed by the value that we want the operator to return when the boolean is
		 * true and the value that we want the operator to return when the boolean is
		 * false.
		 */
		int resultAsInteger = (testedNumber >= leftEnd & testedNumber <= rightEnd) ? 1 : 0;
		return resultAsInteger;
	}
}