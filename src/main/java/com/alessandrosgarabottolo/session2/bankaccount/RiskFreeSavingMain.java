package com.alessandrosgarabottolo.session2.bankaccount;

/**
 * In the main method of this class we construct two objects of type
 * RiskFreeSaving: one giving a commission, the other one without giving the
 * commission: this is an example of constructor overloading
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class RiskFreeSavingMain {

	public static void main(String[] strings) {

		double annualRiskFreeRate = 0.03;
		double commission = 0.02;

		double initialInvestment = 100;
		int numberOfYears = 10;

		// one version of the constructor, where we give the commission
		RiskFreeSaving savingWithCommission = new RiskFreeSaving(annualRiskFreeRate, commission);
		// the overloaded version, where we don't
		RiskFreeSaving savingWithoutCommission = new RiskFreeSaving(annualRiskFreeRate);
		
		System.out.println();
		/*
		 * Note that here you have two methods with same value of the arguments, but
		 * they give different results depending on the object calling them.
		 */
		double valueWithCommission = savingWithCommission.getMoney(initialInvestment, numberOfYears);
		double valueWithoutCommission = savingWithoutCommission.getMoney(initialInvestment, numberOfYears);
		System.out.println("The value of the money after " + numberOfYears + " years when there is a commission of "
				+ commission + " is " + valueWithCommission);
		System.out.println("The value of the money after " + numberOfYears + " years when there is no commission is "
				+ valueWithoutCommission);

		
		

	}
}