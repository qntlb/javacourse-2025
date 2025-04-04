package com.alessandrosgarabottolo.session1.oophelloworld;

/**
 * In the main method of this class we construct an object of type Message,
 * i.e., an instance of the Message class, in order to print an hello message
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class OopHelloWorld {

	public static void main(String[] args) {
		/*
		 * Object creation: NameOfClass nameOfObject = new NameOfClass();
		 * Message() is a particular method called constructor.
		 * More about this tomorrow
		 */
		Message myMessage = new Message();

		myMessage.printMessage(); // see how a method is called

		System.out.println();// we make a line between two prints

		System.out.println("Hi world! " + myMessage.messageToBePrinted); // see how a field of an object is accessed

		System.out.println();
		
		Message myOtherMessage = new Message();
		
		myOtherMessage.printMessage();
		
		System.out.println();
	
		/* we manually modify the message of the second object. This is not how we typically want to interact 
		with fields from outside the class, more on this at a later stage.
		*/
		myOtherMessage.messageToBePrinted = "Hallo";
		
		myOtherMessage.printMessage();
		/*
		 * Same method, same inputs (well, no input at all), different results. The
		 * output of method usually depends on the (value of the fields of) the object
		 * calling the method!
		 */
		
		System.out.println();

		/*
		 * Not always, anyway: we will see how to treat methods whose output does no
		 * depend on the object calling them
		 */
		String firstMessageToBeGiven = "Goodbye";
		String secondMessageToBeGiven = "Bye bye";

		myMessage.printMessageWithArgument("message from myMessage: " + firstMessageToBeGiven);
		myOtherMessage.printMessageWithArgument("message from myOtherMessage: " + secondMessageToBeGiven);
	}
}
