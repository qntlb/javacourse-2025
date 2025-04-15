package com.alessandrosgarabottolo.session6.exceptions.divisions;

//Exception is a class, when you write an Exception you extend it
/**
 * Customized exception writing an exception message: called when an overflow is encountered
 */
public class OverflowException extends MyException { // we can ignore this warning
	
	@Override
	public void printExceptionMessage() {// method you want to call when you catch the exception
		System.out.print("I caught an overflow exception");
	}
}
