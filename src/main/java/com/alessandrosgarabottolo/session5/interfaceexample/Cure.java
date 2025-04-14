package com.alessandrosgarabottolo.session5.interfaceexample;

/**
 * This interface has two methods: diagnose() and cure(). They have to be implemented by whatever
 * class implementing this interface.
 */
public interface Cure {
	int field = 10; // it is implicitly static and final (does not make sense here, just to show)

	// these methods are implicitly public
	void diagnose();
	void heal();
}
