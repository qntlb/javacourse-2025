package com.alessandrosgarabottolo.session4.polymorphism.amphibians;

/**
 * This class tests overriding, upcasting and polimorphism, see the comments in Amphibian.
 */
public class TestClass {


	public static void main(String[] args) {

		Frog frog = new Frog();
		
		System.out.println();

		System.out.println("The frog can do the following actions:");
		frog.swimming(); // overridden version are called, that is those of Frog
		frog.walking();
		frog.croaking();
		
		System.out.println("\nAs an amphibian it still does the same due to late binding:");
		Amphibian.action(frog);
		
		System.out.println();
		
		frog.frogMethod();
		
		System.out.println();
		
		
		// we now create a Frog assigning the reference of an Amphibian
		Amphibian secondFrog = new Frog();

		System.out.println();

		Amphibian.action(secondFrog); // Upcasting and methods overridden! Returns a frog behaviour!!

		System.out.println();
		/*
		 * calling the specific frog method to an object with reference Amphibian doesn't work.
		 * However, if the object is generated as Frog, we can upcast
		 */
//		secondFrog.frogMethod()
		((Frog) secondFrog).frogMethod();
		
		System.out.println();
		
		// we create a Toad with the reference to an Amphibian
		Amphibian toad = new Toad();
		
		System.out.println();
				
		Amphibian.action(toad);
		
		/*
		 * Calling public methods directly from the object, note the late binding effect
		 */
		Amphibian anotherToad = new Toad();
		
		anotherToad.croaking();
		
		Amphibian amphibian = new Amphibian();
		
		amphibian.croaking();
		
	}
}