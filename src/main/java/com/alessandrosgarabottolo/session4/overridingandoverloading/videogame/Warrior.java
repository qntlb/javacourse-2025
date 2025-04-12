package com.alessandrosgarabottolo.session4.overridingandoverloading.videogame;

/**
 * This class will be extended by MorePowerfulWarrior.
 * Note that, in the derived class, the method inflictDamage(Warrior warrior) will
 * be overridden (because more damages will be caused) and also overloaded.
 * All the other methods will be simply inherited.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */

public class Warrior {
	
	/*
	 * This is the value of health points, when it reaches zero the warrior dies. Here
	 * we give the initial value, but of course it might change over time.
	 */
	private double healthPoints = 1000;

	/*
	 * It is protected because it will be used also by the derived class. Final and static
	 * because it is the same for all objects of type Warrior and it must not change
	 * during the game. Note that it could also be package access in this specific
	 * example, but this is done to stress the fact that it's protected because we
	 * want it to be accessed from a class which extends this class.
	 */
	protected final static int impactOnWarriors = 10;


	public Warrior() {
		System.out.println("New warrior created");
	}

	/*
	 * It is protected because it can also been accessed from MorePowerfulWarrior.
	 * Note that it could also be package access in this specific example, but this
	 * is done to stress the fact that it's protected because we want it to be
	 * accessed from a class which extends this class.
	 */
	protected void sufferDamage(double damagePoints) {
		healthPoints -= damagePoints;
	}

	/**
	 * Causes damages to an enemy.
	 *
	 * @param warrior, the enemy
	 */
	public void inflictDamage(Warrior warrior) {
		warrior.sufferDamage(impactOnWarriors);
		//or also
		//warrior.healthPoints -= impactOnWarriors;
	}

	/**
	 * Moves the warrior
	 *
	 * @param x first coordinate
	 * @param y second coordinate
	 */
	public void move(double x, double y) {
		System.out.println("Warrior moving towards (" + x + ", " + y + ")");
	}

	/**
	 * Checks if a warrior has no life points left
	 */
	public void checkIfDead() {
		if (healthPoints <= 0) {
			System.out.println("Dead");
		}
	}

	/**
	 * Returns the health points of the warrior
	 *
	 * @return health points of the warrior
	 */
	public double getHealthPoints() {
		return healthPoints;
	}

}
