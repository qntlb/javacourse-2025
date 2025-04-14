package com.alessandrosgarabottolo.session5.multipleinterfaceimplementation.animals;

/**
 * Interface with two methods, fly() and eat(). The eat() method is also a
 * method of AnimalThatSwims.
 */
public interface AnimalThatFlies {

	void fly();

	void eat(); // since the method is not implemented it is possible to implements both AnimalThatFlies and AnimalThatSwims

	double interfaceField = 10;
}
