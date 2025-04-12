package com.alessandrosgarabottolo.session4.composition.car;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * Here the class BadImplementationOfCar extends Engine, so that it can call the method
 * startEngine() of the class Engine. This is not a good implementation of a car, think of
 * the relation between a car and an engine: you would not think that a car IS an engine,
 * you would rather think that a car HAS an engine.
 * However, this implementation still works...
 * 
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class BadImplementationOfCar extends Engine {

	private int age; // specific field of this class
	private int horsePower; // specific field of this class


	BadImplementationOfCar(int age, int horsePower) {
		super(horsePower);
		this.age = age;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}


	// specific method of Car
	public void turnRight() {
		printn("Turn right");
	}

	// specific method of Car
	public void turnLeft() {
		printn("Turn left");
	}

	// delegation: you start the engine which starts the car
	public void startCar() {
		printn("Insert the key..");
		startEngine();
	}
}
