package com.alessandrosgarabottolo.session5.interfacesandpolymorphism.orchestra;

/**
 * This class extends Wind, so it implicitly implement Instrument.
 */
public class Woodwind extends Wind {
	/**
	 * It prints "Woodwind plays" plus the name of the Note given as argument.
	 * 
	 * @param n: a value of the enum type Note
	 */
	@Override
	public void play(Note n) {// it overrides the implementation of play(Note n) in Wind
		System.out.println("Woodwind plays " + n);
	}
	/*
	 * Note that you could avoid to give the implementation of the method, as it
	 * gets inherited from Wind. Here you are overriding the implementation of Wind
	 */
}