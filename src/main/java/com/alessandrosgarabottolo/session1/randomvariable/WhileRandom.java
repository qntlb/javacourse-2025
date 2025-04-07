package com.alessandrosgarabottolo.session1.randomvariable;

import java.util.Random;

/**
 * This class uses a do...while loop and a random number generator to
 * count how many times we flip a coin before getting tail.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class WhileRandom {

	public static void main(String[] args) {
		int numberOfFlips = 0; // no flips have been performed yet

		// create a reference to a new object of type Random: Java class
		Random randomNumberGenerator = new Random();
		/*
		 * If no seed is specified, the current time is used to generate a seed.
		 * The seed is an initialization value for the random number generator: the
		 * generator will always produce the same sequence for a particular seed value
		 */
		do {
			numberOfFlips++; // first you flip! Would it change if we wrote ++numberOfFlips?
			System.out.println("I flipped the coin " + numberOfFlips + " times");
		} while (randomNumberGenerator.nextInt(2) == 1); // 0 is tail, 1 is head
		
		// nextInt(n) produces a random natural number (0 included) smaller than n
		System.out.println("I got tail after " + numberOfFlips + " flips");
	}
}
