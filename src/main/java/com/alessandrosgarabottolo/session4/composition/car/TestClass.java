package com.alessandrosgarabottolo.session4.composition.car;

/**
 * This class tests composition and delegation; it is possible to call the
 * start() method of car, that calls itself the one of Engine.
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
		int age = 2;
		int horsePower = 100;
		
		Car car = new Car(age, horsePower);
		car.startCar();
		
		System.out.println();
		System.out.println("Using the less elegant implementation:");
		
		BadImplementationOfCar anotherCar = new BadImplementationOfCar(age, horsePower);
		anotherCar.startCar();
	}
}