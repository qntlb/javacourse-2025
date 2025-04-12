package com.alessandrosgarabottolo.session4.polymorphism.amphibians;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * This class inherits from Amphibian (a toad is an amphibian) and overrides the three methods swimming(),
 * walking() and croaking().
 *
 * @author Andrea Mazzon
 *
 */
public class Toad extends Amphibian{

	public Toad(){
		printn("I am a toad");}

	
	@Override
	public void swimming(){// the access modifier cannot be more restrictive than the one of the method of the base class
		printn("Toad swimming");
	}

	@Override
	public void walking(){
		printn("Toad walking");
	}

	@Override
	public void croaking(){
		printn("Toad croaking");
	}

}
