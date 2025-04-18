package com.alessandrosgarabottolo.session2.oophelloworldwithconstructor;

/**
 * In the main method of this class we construct an object of type
 * MessageWithConstructor, i.e., an instance of the MessageWithConstructor
 * class, in order to print the typical hello world message. The default
 * constructor of MessageWithConstructor is called.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class HelloWorldWithConstructor {

	public static void main(String[] args) {
		/*
		 * Object creation. MessageWithConstructor() is a particular method called constructor. Since
		 * we have defined and implemented it, it will call "our" default constructor which prints a creation message
		 */
		MessageWithConstructor myMessage = new MessageWithConstructor();
		myMessage.messageToBePrinted = "Good morning!";// see how a field of an object is manipulated
		myMessage.printMessage(); // see how a method is called

		System.out.println();
		
		MessageWithConstructor myOtherMessage = new MessageWithConstructor();
		myOtherMessage.printMessageWithArgument("Good evening!");
	}

}
