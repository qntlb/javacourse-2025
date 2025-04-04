package com.alessandrosgarabottolo.session1.elevator;

/**
 * This class gives a very simple example of for loop, where the stepping reduces the number by one
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class Elevator {

	public static void main(String[] args) {
		
		for (int floor = 10 /* initialization */; floor > 0 /* Boolean expression */; floor-- /* step */) {
			System.out.println("The elevator is at floor number " + floor);
		}

		// System.out.println(floor);//ERROR!
		System.out.println();
		
		System.out.println("The elevator is at ground level");
		System.out.println();
		// you could also write:
		int i = 10;
		while (i > 0) {
			System.out.println("The elevator is at floor number " + i);
			i--;
		}
		
		System.out.println();
		
		System.out.println("i is equal to " + i + " after the end of the while loop");
		/*
		 * The difference is that since i is initialized before the while loop it remains in the memory.
		 * If you create a variable inside the while loop, it gets deleted after the while.
		 * For for loops, the scope of the variable is limited to the loop.
		 */
	}
}