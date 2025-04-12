package com.alessandrosgarabottolo.session4.inheritanceandconstructors.basicexample;
/**
 * Parent class with the parent constructor: this constructor will be called when the
 * constructor of the derived class is called.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class ParentClass{
	ParentClass(){
		System.out.println("Calling the constructor of the parent class");
	}
}
