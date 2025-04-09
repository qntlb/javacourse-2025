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

		loansSum += amount; // the field is incremented, and will be the same for every Mortgage object
		// or loansSum = loansSum + amount;

		System.out.println("Sum of all the loans : " + loansSum);
		System.out.println();

		
		// We want to known when we have exceed the total amount of money we want to lend
		if (loansSum > 1E6) {// 1 million
			System.out.println("Enough!");
			/*
			 * We will see next time how to prevent the user to construct more objects of
			 * this type (for now we can just warn him/her)
			 */
		}
	}


}
