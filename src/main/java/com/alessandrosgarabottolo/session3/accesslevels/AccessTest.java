package com.alessandrosgarabottolo.session3.accesslevels;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * This class shows if and how private, package access and public methods can be accessed.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class AccessTest {
	
	public static void main(String[] args) {
		
		Access access = new Access();
		
		access.publicField = 1; // this field is public: it can be accessed from anywhere
		
		/*
		 * This field has no access modifier: it can be accessed from a method of a class
		 * inside the package of its class, as in this case.
		 */
		access.packageAccessField = 2;
		
//		access.privateField = 2; // this field is private! It's not possible to access it from outside the class

		access.publicMethod(); // fine, this method is public: it can be called from anywhere
		access.packageAccessMethod(); // fine, this method has no access modifier: it can be called from inside the package
//		access.privateMethod(); // this method is private! Not possible to call it from outside the class

		printn("The package access field is " + access.packageAccessField);
		printn("The public access field is " + access.publicField);
		//printn("The private access field is " + access.privateField); //private field not visible
		
		PackageAccessOnly packageAccessOnly = new PackageAccessOnly();//the package access class can be created
		/*
		 * but look what happens when we try to construct objects of this class from
		 * com.andreamazzon.session3.otherpackage.AccessTestOutside
		 */
	}
}

