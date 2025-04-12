package com.alessandrosgarabottolo.session4.overridingandoverloading.videogame;

/**
 * This class extends Warrior. In particular, it overrides and overload the
 * damage method, see the comments. It directly inherits the other method (we want no
 * changes) and the fields impactOnWarriors and healthPoints. Note that
 * healthPoints is private, but this is no problem because it gets not directly
 * accessed, but only through the method removeHealthPoints(double
 * howManyPointsRemoved), which is public.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class MorePowerfulWarrior extends Warrior {

	private final static double strengthening = 10;// it will cause more damages
	private final static double impactOnBuildings = 5;// new field!

	public MorePowerfulWarrior() {
		/*
		 * constructor of the derived class. The default constructor of the parent class
		 * is automatically called, see the messages from the constructors.
		 */
		System.out.println("A more powerful one"); // 
	}

	/**
	 * Causes damages to an enemy. Overridden because it causes more damages than an
	 * object of the base class.
	 *
	 * @param warrior, the enemy
	 */
	/*
	 * note the @Override annotation: if we use it, we get an error if our method is
	 * not overriding a method of the parent class. This is useful to avoid mistakes
	 * (for example we are accidentally changing the name of the method)
	 */
	@Override
	public void inflictDamage(Warrior warrior) {
		warrior.sufferDamage(impactOnWarriors + strengthening);
	}

	/**
	 * Causes damages to a building. Overloaded because objects of the derived class
	 * can also damage buildings, i.e., they can "implement the method in a
	 * different way".
	 *
	 * @param building, a Building of the enemy
	 */
	public void inflictDamage(Building building) {
		building.removeSolidityPoints(impactOnBuildings);
	}
}
