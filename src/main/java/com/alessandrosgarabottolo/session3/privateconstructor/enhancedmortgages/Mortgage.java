package com.alessandrosgarabottolo.session3.privateconstructor.enhancedmortgages;

/**
 * This class is strictly related to com.alessandrosgarabottolo.session2.mortgages.Mortgage, that was an example of a
 * possible use of static fields in order to know the total amount of money we lend to clients. We had a static field
 * loansSum whose value was shared among all the objects of Mortgage and got incremented every time
 * such an object is created. We had printed a warning message as soon as the value of this field was bigger than
 * a maximum. However, we could not prevent the possibility to produce more object after that time.
 * A solution is now to have a private constructor, which is called only if loansSum <= budget.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class Mortgage {

	private static double loansSum = 0; // static: shared by all the objects. Initially zero.
	private static double budget = 1E6;
	private String name; // this field is not meant to be static: it must be able to vary for every customer
	private int age; // non static, for the same reason
	private double amount; // same thing

	
	/*
	 * TODO: write a private constructor Mortgage(String name, int age, double amount)
	 * and a public static method constructMortgage(...) which returns an object of type Mortgage if
	 * the total amount loaned is below the budget. For the constructor you can look at
	 * com.alessandrosgarabottolo.session2.mortgages.Mortgage
	 */

}
