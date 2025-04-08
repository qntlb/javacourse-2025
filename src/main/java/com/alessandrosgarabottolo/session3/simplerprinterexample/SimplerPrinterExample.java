package com.alessandrosgarabottolo.session3.simplerprinterexample;

import com.alessandrosgarabottolo.session3.useful.Print;

/*
 * import static: allows members (fields and methods) which have been "defined" as public static,
 * to be used without specifying the class in which the field has been defined. It is useful when
 * you have to call these methods several times (so in this simple, specific example it's not
 * that useful).
 */

//import static com.alessandrosgarabottolo.session3.useful.Print.printn;


/**
 * This class illustrates how we can use classes imported from other packages. One thing to
 * note: through "import static" you can avoid to specify the name of a class for a static
 * method or field.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */


public class SimplerPrinterExample {
	public static void main(String[] args) {
		Print.printn("Printing is now much simpler");
		
		Print.print("Printing is now much simpler. ");
		
		Print.print("We can do that because we imported the relevant classes.");
		
//		Print.printn();
//		printn("This message is printed by a method imported with import static");
	}
}
