package com.alessandrosgarabottolo.session5.enumtype.currencies;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * This class contains a main method that illustrates some uses of enum types
 */
public class CurrencyTester {
	public static void main(String[] args) {

		DescribeCurrency currencyDescribe = new DescribeCurrency();

		/*
		 * You refer to a value of an enum type like to a static field of a class:
		 * NameOfTheEnumType.NAMEOFTHEVALUE
		 */
		currencyDescribe.setDescribedCurrency(Currency.DOLLAR);
		currencyDescribe.describe();
		printn();

		/*
		 * Let's have a look now at some specific, pre-implemented methods that an
		 * object of an enum type can call.
		 */
		printn();
		printn("The name of the enum constant Currency.EURO is " + Currency.EURO.name());
		printn();
		printn("The position of EURO is " + Currency.EURO.ordinal());
		printn("The position of DOLLAR with respect to EURO: " + Currency.DOLLAR.compareTo(Currency.EURO));
		printn("The position of DOLLAR with respect to YEN: " + Currency.DOLLAR.compareTo(Currency.YEN));
	
		printn("EURO is the same that DOLLAR: " + Currency.EURO.equals(Currency.DOLLAR));

		printn();
		/*
		 * values() is a method of enum types that produces the array of all the values
		 * of the enum constant We go through that array in the for loop.
		 */
		Currency[] currencyValues = Currency.values();
		for (Currency currency : currencyValues) {// look at the foreach syntax!
			currencyDescribe.setDescribedCurrency(currency);
			currencyDescribe.describe();
		}
	}
}