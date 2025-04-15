package com.alessandrosgarabottolo.session6.generics.genericinterfaces;

/**
 * All classes implementing this interface must implement a generic method
 * next(), which returns an object. We do not specify now the type of the object
 * returned, but it has to be the same for a specific object calling the method.
 *
 * @param <T> the type of the object returned by the next() method.
 */
public interface GenericNext<T> {
	/*
	 * The type can be whatever, but always the same for a given object of a class
	 * implementing the method
	 */
	T next();
}
