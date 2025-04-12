package com.alessandrosgarabottolo.session4.inheritanceandconstructors.sportsman;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * Parent (or base) class: it has one constructor taking a String as an argument
 * and a default constructor.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class Sportsman {

	/*
	 * In Tennisplayer, we see that if we don't define a default constructor in the
	 * base class, we have to explicitly call a constructor of the base class, giving
	 * it the arguments it needs.
	 */
	Sportsman(String name) {
		printn("I am a sportsman. My name is " + name);
	}
	
	/*
	 * TODO: write a constructor with no arguments that can be called from the constructor
	 * of the derived class without using "super".
	 */
}
