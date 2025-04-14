package com.alessandrosgarabottolo.session5.abstractclasses.basicexample;

/**
 * This class has a method callMethod which takes as an argument an object of a
 * class which EXTENDS AbstractBaseClass. In fact, creating objects of the base
 * abstract class is not possible. Without polymorphism,
 * therefore, having a method with such an argument would be not possible.
 * Instead, thanks to late binding, we can forget about the specific type
 * of the object passed to the method until run time. One of the nice aspects of
 * this behavior is that if we want to define another class extending
 * AbstractBaseClass we don't have to change the implementation and the argument
 * list of callMethod.
 *
 */
public class OtherClass {
	static void callMethod(AbstractBaseClass objectOfBaseClass) {
		
		// abstractMethod is implemented in every class extending AbstractBaseClass
		objectOfBaseClass.abstractMethod();
		
//		AbstractBaseClass myObject = new AbstractBaseClass(); //does not work
	}
}

