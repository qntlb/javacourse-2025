package com.alessandrosgarabottolo.session2.oophelloworldwithconstructor;

/**
 * The main use of this class is to print a message. It has one field, messageToBePrinted,
 * one (default) constructor, whose side effect is to print a message, and two methods,
 * printMessage() and printMessageWithArgument(String message).
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class MessageWithConstructor {

	String messageToBePrinted = "Standard message: it can be modified"; // field containing a default message

	/*
	 * Default constructor, because it has no arguments. Note: no return type. This
	 * is different from void, when the method returns nothing but you still
	 * have the option to make it return something else (changing from void to the type
	 * of the object it returns).
	 */
	MessageWithConstructor() {
		// when creating a new object of type MessageWithConstructor a creation message is printed
		System.out.println("A new object is created");
	}

	// this method prints the message contained in the string messageToBePrinted of the object
	void printMessage() {
		System.out.println(messageToBePrinted);
	}

	/*
	 * This method prints a personalized message. It does the same thing that printMessage, but
	 * for the fact that one passes an argument to be printed. We will see that it is possible
	 * to do that without implementing two different methods.
	 */
	void printMessageWithArgument(String messageViaMethod) {
		System.out.println(messageViaMethod);
	}
}
