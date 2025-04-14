package com.alessandrosgarabottolo.session5.interfaceexample;

/**
 * The only method of this class illustrates how upcasting and polymorphism work
 * also with interfaces. It takes as an argument an object of any class
 * implementing Cure: the specific implementation of the method is called at
 * running time via late binding.
 */
public class Healing {

	public static void someHealing(Cure ourCure) {// object of any class implementing Cure
		ourCure.diagnose();// the right implementation of the method is called at running time
		ourCure.heal();
		//ourCure.aDoctorMethod();//it is not a method common to every class implementing Cure
		/*
		 * I can downcast, it does not complain at compilation time. But it's dangerous:
		 * see what happens when I call the method for an object of type Antivirus. This is
		 * also a use not conform to Polymorphism
		 */
//		((Doctor) ourCure).aDoctorMethod();
	}

}
