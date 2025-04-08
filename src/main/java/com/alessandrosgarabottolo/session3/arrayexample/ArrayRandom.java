package com.alessandrosgarabottolo.session3.arrayexample;

import java.util.Arrays;
import java.util.Random;

/**
 * This class illustrates some features of arrays in Java by creating an array
 * of random length and filling it with random numbers between 1 and 500
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class ArrayRandom {
	
	public static void main(String[] args){

		Random randomProducer = new Random(); //random numbers generator

		int length = randomProducer.nextInt(20) + 1; //(pseudo)random integer between 1 and 20

		int[] arrayToBeFilled = new int[length];
		//or:
		//int arrayToBeFilled[] = new int[length]; //the same
		/*
		 * Note that we have created an array reference (it is an object) and we have initialized
		 * the array, through new int[length]. The array creation happens at run time
		 * (length is random, so the compiler cannot know it)
		 */
		System.out.println("The array arrauToBeFilled is " + arrayToBeFilled); //not so nice!
		// It is initialized with all zeros
		System.out.println("The array is " + Arrays.toString(arrayToBeFilled));//a nice way to print the values of an array
		/*
		 * toString(Array arrayToBeFilled) is a static method of the class Arrays. Note: this is not a method called by the
		 * array (object) arrayToBeFilled, in fact arrayToBeFilled is its argument
		 */

		System.out.println();
		// every array has a field called length, which gives the length of the array
		System.out.println("The length of the array is "+ arrayToBeFilled.length);
		System.out.println();
		
		// note: int i=0; i<arrayToBeFilled.length: the first element is arrayToBeFilled[0]
		for(int i = 0; i < arrayToBeFilled.length; i++) {
			//you cannot go out of bounds: you would get a runtime error
			arrayToBeFilled[i] = randomProducer.nextInt(500);  // (pseudo)random integer between 0 and 499
		}

		System.out.println("The array is now " + Arrays.toString(arrayToBeFilled));
		System.out.println();
		
		int[] otherArray; // Creation of the array reference (declaration)	
		otherArray = new int[10]; //..and then initialization

		int[] firstArray = {1, 2, 3, 4, 5, 6, 7};//another way to initialize an array

		int[] secondArray = firstArray; //pay attention at this assignment!

		System.out.println("firstArray is " + Arrays.toString(firstArray));
		System.out.println("secondArray is " + Arrays.toString(secondArray));
		System.out.println();
		firstArray[2]=7;//I modify firstArray. Note: firstArray[2] is the THIRD element of the array!
//
//		//arrays are not primitives! when we write firstArray = secondArray they have the same reference
		System.out.println("firstArray is now " + Arrays.toString(firstArray));
		System.out.println("secondArray is now " + Arrays.toString(secondArray));
		System.out.println();
		/*
		 * clone() method: creates and returns a copy of the object (same class, same values for the fields),
		 * therefore it also returns a new reference
		 */
		int[] thirdArray = firstArray.clone();
		System.out.println("thirdArray is " + Arrays.toString(thirdArray));
		firstArray[2]=10;
		System.out.println("firstArray is now " + Arrays.toString(firstArray));
		System.out.println("thirdArray is still " + Arrays.toString(thirdArray));
		
		/*
		 * method sort() of the class Arrays. It sorts an array in ascending order. Note that it modifies the
		 * array and returns void.
		 */
		Arrays.sort(firstArray);
		System.out.println();
		System.out.println("firstArray sorted is: " + Arrays.toString(firstArray));
	}
}

