package com.alessandrosgarabottolo.session4.overridingandoverloading.videogame;

/**
 * Class implementing a building. It can get damaged only by objects of type MorePowerfulWarrior
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class Building {

	/*
	 * This is the value of solidity points, when reaches zero the building ceases to exist.
	 * Here we give the initial value, but of course it might change over time.
	 */
	private double solidityPoints = 1000;// initial value of the solidity points.

	public Building(){
		System.out.println("New building created");
	}
	
	/**
	 * Removes solidity points to a building.
	 */
	public void removeSolidityPoints(double howManyPointsRemoved) {
		solidityPoints -= howManyPointsRemoved;
	}
	
	/**
	 * Checks if the building is destroyed
	 */
	public void checkIfDestroyed () {
		if (solidityPoints <= 0) {
			System.out.println("The building is destroyed");
		}
	}
	
	/**
	 * Returns the solidity points of the building
	 * @return the solidity points of the building
	 */
	public double getSolidityPoints() {
		return solidityPoints;
	}
	
}
