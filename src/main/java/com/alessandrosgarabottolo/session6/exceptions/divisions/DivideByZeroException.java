package com.alessandrosgarabottolo.session6.exceptions.divisions;

//Exception is a class, when you write an Exception you extend it
/**
 * Customized exception writing an exception message: called when a division by zero is
 * done
 */
public class DivideByZeroException extends MyException {
	
	@Override
	public void printExceptionMessage() {// method you want to call when you catch the exception
		System.out.println("You are dividing by zero");
	}
}
