package com.alessandrosgarabottolo.session2.mortgages;

/**
 * This class serves as an example of a possible use of static fields.
 * It represent a record corresponding to a Mortgage. Here we
 * want to know the total amount of money we lend to our customers for
 * mortgages: we are a small bank, so we don't like to be too exposed. Thus we
 * need the total amount of loaned money to be shared across all objects of the class Mortgage.
 * This is what we get with a static field. Note that the value of the static field is stored
 * in a shared location only once for all objects of the class.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class Mortgage {

	static double loansSum = 0; // static: shared by all the objects. First equal to zero, for the first object.
	
	String name; // this field is not meant to be static, each customer has a different name
	int age; // non static, for the same reason
	double amount; // same thing

	//constructor
	Mortgage(String name, int age, double amount) {
		this.name = name; // note the use of this
		this.age = age; // note the use of this
		this.amount = amount;

		System.out.println("The name of our new customer is " + name + ". He is " + age + " years old."
				+ " We lend him/her " + amount + " euros.");

		// TODO: complete the method to give a warning when the total amount loaned passes 1E6

		}
	}


}
