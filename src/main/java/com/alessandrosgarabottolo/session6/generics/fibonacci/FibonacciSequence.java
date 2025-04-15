package com.alessandrosgarabottolo.session6.generics.fibonacci;

import com.alessandrosgarabottolo.session6.generics.genericinterfaces.GenericNext;

/**
 * This class implements the generic interface GenericNext for type Long. Therefore, for objects of this class,
 * the next() method returns a Long.
 * When called iteratively, this method returns the next number of a Fibonacci sequence.
 */
public class FibonacciSequence implements GenericNext<Long> { // The type returned in next() must be Long
	
	private Long firstFibonacciNumber = 1L;
	private Long secondFibonacciNumber = 1L;
	
	private int count = 1;

	private Long fibonacciSum;
	
	/**
	 * It returns the Fibonacci number F_k = F_{k-1} + F_{k-2}, k=count where count is a field of the
	 * class, and set count = count + 1. Recall F_1 = F_2 = 1.
	 */
	@Override
	public Long next() {
		/*
		 * TODO: write the implementation of the method
		 */
		return fibonacciSum;
	}
	
	/**
	 * Allows to know at which iteration of the Fibonacci sequence the object is set
	 * @return iteration number of the Fibonacci sequence
	 */
	public int getCount() {
		return count;
	}
	


}
