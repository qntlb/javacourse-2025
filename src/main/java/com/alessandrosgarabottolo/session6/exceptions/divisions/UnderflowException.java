package com.alessandrosgarabottolo.session6.exceptions.divisions;

//Exception is a class, when you write an Exception you extend it
/**
 * Customized exception writing an exception message: called when an underflow is encountered
 */
public class UnderflowException extends MyException { // we can ignore this warning
	
	@Override
	public void printExceptionMessage() {// method you want to call when you catch the exception
		System.out.println("I caught an underflow exception");
	}
}
