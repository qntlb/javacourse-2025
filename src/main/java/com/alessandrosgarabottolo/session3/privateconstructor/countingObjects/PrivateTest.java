package com.alessandrosgarabottolo.session3.privateconstructor.countingObjects;

/**
 * This class shows the use of the class PrivateConstructorClass. We see how, thanks to
 * our implementation of PrivateConstructorClass, it is possible to create only a single
 * object of that class.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class PrivateTest{
	public static void main(String[] args){
		/*
		 * The idea here is that the user should not be able to spontaneously create instances of the
		 * class PrivateConstructorClass
		 */
//		PrivateConstructorClass anObject = new PrivateConstructorClass(); //we cannot

		/*
		 * The user rather has to ask the public and static method createOneObject() to create
		 * a new instance of PrivateConstructorClass. The responsibility for the creation of the object
		 * is transfered from the user to the public method. 
		 */
		PrivateConstructorClass firstObject = PrivateConstructorClass.createOneObject(); // the private constructor is called from inside the class PrivateConstructorClass

		PrivateConstructorClass secondObject = PrivateConstructorClass.createOneObject(); // this second object does not get created
	}
}
