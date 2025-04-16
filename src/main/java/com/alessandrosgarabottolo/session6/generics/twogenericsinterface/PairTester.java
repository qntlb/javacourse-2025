package com.alessandrosgarabottolo.session6.generics.twogenericsinterface;

/**
 * A simple test class that demonstrates the usage of the Pair interface and
 * the StringIntegerPair implementation.
 */
public class PairTester {

	public static void main(String[] args) {
		Pair<String, Integer> myPair = new StringIntegerPair("age", 30);
		System.out.println("Key: " + myPair.getKey());
        System.out.println("Value: " + myPair.getValue());

	}

}
