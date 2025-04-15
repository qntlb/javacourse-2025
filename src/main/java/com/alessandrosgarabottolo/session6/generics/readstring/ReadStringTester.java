package com.alessandrosgarabottolo.session6.generics.readstring;

/**
 * The main method of this class uses the next() method of CharactersOfString in order to print all
 * the characters of a string, one by one, with new line.
 */
public class ReadStringTester {

	public static void main(String[] args) {
		CharactersOfString readString = new CharactersOfString("This is my string");
		while (readString.checkIfNotAtTheEnd()/* boolean, true as long as we are not at the end of the string */) {
			System.out.println(readString.next());
		}
//		System.out.println(readString.next()); // note which error you get if you ask for one more character
	}
}
