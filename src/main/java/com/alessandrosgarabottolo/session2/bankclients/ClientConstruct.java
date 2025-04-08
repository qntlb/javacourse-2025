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
//		Client schneiderDirect = new Client("00011100", "Schneider", "Smith", "German","Munich", 37, 0.4, 1E4, true);
		Client schneiderDirect = new Client("Schneider", "00011100", "Smith", "German","Munich", 37, 0.4, 1E4, true); // such a mistake in the initialization is very common
		Client schneiderBuildingPattern = Client.createNewClient("00011100").name("Schneider").advisor("Smith")
				.nationality("German").cityOfResidence("Munich").age(37).
				riskAversionIndex(0.4).sumInvested(1E4).hasInsurance(true);
//		Client schneiderBuildingPattern = Client.createNewClient("00011100").advisor("Smith")
//				.nationality("German").cityOfResidence("Munich").age(37).
//				riskAversionIndex(0.4).sumInvested(1E4).hasInsurance(true).name("Schneider"); // changing the order in the building pattern does not affect the final object

		schneiderDirect.printName();
		schneiderDirect.printNationality();
		
		schneiderBuildingPattern.printName();
		schneiderBuildingPattern.printNationality();	
	}
}
