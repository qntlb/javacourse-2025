package com.alessandrosgarabottolo.session3.packageimporting;

/*
 * With this syntax, you can import all the classes in a package.
 * Both these packages have a Vector class.
 */
import java.util.*;

import com.alessandrosgarabottolo.session3.useful.*;


/**
 * This class illustrates the way we can import other packages. Main things to note:
 * - you can import all the classes in a package by using the syntax 
 *   import nameofthepackage.*
 * - if you import two packages with the same class, you have to be careful about possible conflicts
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */

public class ImportsAndConflicts {

	public static void main(String[] args) {
		/*
		 * We can use this class because we imported all the classes in
		 * com.alessandrosgarabottolo.session3.useful
		 */
		Print.printn("A simpler way to print");
		/*
		 * We can construct an object of this class because we imported all the classes in
		 * java.util
		 */
		Random random = new Random();

		/*
		 * try to comment it out: there's a collision because Vector is contained in both
		 * the packages.
		 */
//		Vector v1 = new Vector(); 
		
		// what we can do to avoid ambiguity:
		
		java.util.Vector secondVector = new java.util.Vector(); 
		
		com.alessandrosgarabottolo.session3.useful.Vector thirdVector = new com.alessandrosgarabottolo.session3.useful.Vector(); 
	}

}