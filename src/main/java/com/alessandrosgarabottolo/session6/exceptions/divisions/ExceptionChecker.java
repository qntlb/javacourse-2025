package com.alessandrosgarabottolo.session6.exceptions.divisions;

/**
 * The main method in this class shows you the syntax you use when calling a method that can
 * throw one or more exceptions.
 */
public class ExceptionChecker {

	public static void main(String[] args) {
		
		//in this way, we get an overflow or an underflow
		double maxValue = Double.MAX_VALUE;
		double minValue = -Double.MAX_VALUE;
		double firstDividend = 1;
		
		//for these values, we would get no overflow or underflow
//		double maxValue = 10000;
//		double minValue = 0.001;
		
		double divisor = 1000; // this leads to an underflow exception
//		double divisor = 0; // this leads to a divide by zero exception
//		double divisor = 0.001; // this leads to an overflow exception
		
		// you cannot call it in this way, because of possible exceptions
		//Divider.divide(firstDividend, divisor, minValue, maxValue);

		
		// The code from which exceptions can derive is surrounded by brackets, after "try"
		try {
			Divider.divide(firstDividend, divisor, minValue, maxValue);
		}
		
		// List of the possible exceptions: you have to catch them or throw them as we did in the class Divider
		catch (MyException myException) {
			/*
			 * you catch the object thrown and you ask it to call the method
			 * printExceptionMessage()
			 */
			myException.printExceptionMessage();
		}
		
		
	}
}
