package com.alessandrosgarabottolo.session5.inheritinginterfaces;

/**
 * Inheritance is also possible for interfaces. Moreover, multiple inheritance is also
 * possible. This is indeed an interface extending two interfaces.
 */
public interface InheritingInterface extends FirstInterface, SecondInterface {
	void thirdMethod();
}
