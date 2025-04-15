package com.alessandrosgarabottolo.session4.composition.binomialmodel;

/**
 * This class tests the features of the class BinomialModelSimulator, which is an example of the use of
 * composition and delegation.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class TestClass {

	public static void main(String[] args) {
		double initialValue = 100;
		double increaseIfUp = 1.1;
		double decreaseIfDown = 0.98;
		double interestRate = 0.05;

		int seed = 1897;
		int lastTime = 10;
		int numberOfSimulations = 100000;
		int simulationIndex = 10;

		BinomialModelSimulator tester = new BinomialModelSimulator(initialValue, increaseIfUp, decreaseIfDown, interestRate, seed,
				lastTime, numberOfSimulations);

		System.out.println("The probability of a step up in this model is: " + tester.getRiskNeutralProbabilityUp());
		System.out.println("Path for simulation number " + simulationIndex + ":");
		tester.printPath(simulationIndex);

		System.out.println();
		
		double finalAverage = tester.getAverageAtGivenTime(lastTime);

		System.out.println("Average of the process at time " + lastTime + ": " + finalAverage);

		System.out.println();
		
		double discountFactor = Math.pow(1 + interestRate, -lastTime);
		double discountedAverage = discountFactor * finalAverage;
		System.out.println("Average of the discounted process at time " + lastTime + ": " + discountedAverage);
	}
}
