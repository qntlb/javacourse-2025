package com.alessandrosgarabottolo.session5.multipleinterfaceimplementation.animals;

/**
 * Interface with two methods, swim() and eat(). The eat() method is also a
 * method of AnimalThatFlies.
 */
public interface AnimalThatSwims {

	void swim();

	void eat(); // since the method is not implemented it is possible to implements both AnimalThatFlies and AnimalThatSwims

//	double interfaceField = 11;
}
