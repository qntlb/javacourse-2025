package com.alessandrosgarabottolo.session2.bankclients;

/**
 * This class provides an example of Builder pattern and multiple
 * methods calling. Calling a constructor for
 * an object with many fields might lead to mistakes.
 * Builder pattern is here possible due to the use of "this" to
 * return a reference to the same object calling a method. Also note the use of
 * the static method createNewClient.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class ClientConstruct {

	public static void main(String[] args) {

		/*
		 * note that the reference of the object calling all the methods is always the
		 * same! It is basically the one returned by the static method createNewClient.
		 * Then we can perform multiple calling.
		 */
		// TODO: initialize the client with the constructor with all the arguments
//		Client schneider = Client.createNewClient("00011100").name("Schneider").advisor("Smith")
//				.nationality("German").cityOfResidence("Munich").age(37).
//				riskAversionIndex(0.4).sumInvested(1E4).hasInsurance(true);
		Client schneider = Client.createNewClient("00011100").advisor("Smith")
				.nationality("German").cityOfResidence("Munich").age(37).
				riskAversionIndex(0.4).sumInvested(1E4).hasInsurance(true).name("Schneider"); // changing the order in the building pattern does not affect the final object
		
		schneider.printName();
		schneider.printNationality();	
	}
}
