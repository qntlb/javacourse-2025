package com.alessandrosgarabottolo.session5.interfacesandpolymorphism.band;

/**
 * Class implementing the interface Instrument: it must implement the method
 * play(Note n)
 */
public class Violin implements Instrument {
	/**
	 * It prints "Violin plays" plus the type of the Note given as argument.
	 * 
	 * @param n: a value of the enum type Note
	 */
	@Override
	public void play(Note n) {// a method that take as argument the value of the enum type Note
		System.out.println("Violin plays " + n);
	}
}
