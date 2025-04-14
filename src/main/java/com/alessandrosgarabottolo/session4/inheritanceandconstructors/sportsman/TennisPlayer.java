package com.alessandrosgarabottolo.session4.inheritanceandconstructors.sportsman;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * Example of a derived class when the parent class has only constructors with
 * arguments: in this case, you must explicitly call the constructor of the
 * parent class, using "super". The reason for this is that we need to pass the
 * arguments to the correct constructor we want to call. Note: if the parent class has also a
 * default constructor, its default constructor gets called if you don't specify
 * any "super". Try to verify this behaviour adding a default constructor to
 * Sportsman and to TennisPlayer.
 * Note that a tennis player IS a sportsman. This is a very simple example of inheritance.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class TennisPlayer extends Sportsman {

	TennisPlayer(String name) {
		// call to the base class constructor with the appropriate argument list
		super(name);
		/*
		 * if a default constructor is defined in the parent class one can comment the last line,
		 * but, of course, name will not be used
		 */
		printn("In particular, I am a tennis player.");
	}
	
	/*
	 * The default constructor doesn't need to call super(), the default constructor of the parent class
	 * is automatically called
	 */
	TennisPlayer() {
		printn("What matters is that I am a tennis player.");
	}
}
