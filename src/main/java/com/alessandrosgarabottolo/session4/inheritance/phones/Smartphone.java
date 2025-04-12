package com.alessandrosgarabottolo.session4.inheritance.phones;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * This class illustrates one of the uses of inheritance: having the same methods and fields
 * of the parent class - without having to implement them again - plus possibly new methods
 * or fields characteristic of the derived class. Moreover, it also shows how overriding works.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class Smartphone extends Phone {

	
	Smartphone() { // it automatically calls the constructor of the base class
		printn("But also to surf the internet");
		isSmartphone = true;
	}
	
	
	/*
	 * Method overriding: we provide a different implementation of a method of the
	 * base class. The annotation @override is there to let Java give us a compilation error
	 * if we are actually not overriding any method of the base class (maybe because of a typo).
	 */
	@Override
	protected void call() {
		super.call(); // call to the method of the parent class
		printn("I also have the possibility to video call"); 
	}

	
	// methods specifically defined in this class: not inherited nor overridden
	void goOnInternet() { // this is a specific method of the derived class
		printn("I am browsing the Internet");
	}	
	
	void goOnInternetAndThenCall() { // this is a specific method of the derived class
		printn("I’m looking up useful information online before making a call.");
		call(); // no "super" here: this will call the overridden method given here
	}	
	
	
}