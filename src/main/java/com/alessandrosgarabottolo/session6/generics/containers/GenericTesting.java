package com.alessandrosgarabottolo.session6.generics.containers;

/**
 * This class has a main method which tests generics: you can see that you can construct
 * different objects of type GenericClass, giving them different types.
 * However, and here is the difference with using Object, once you have created an object
 * of type GenericClass you cannot set its field to be of different types.
 */
public class GenericTesting {

	public static void main(String[] args) {

		/*
		 * Look at ObjectTypeClass: the field whateverTypeField of the same object can
		 * be set first to be an int, then a double, then a string, and finally a ComplexNumber.
		 * Sometimes you want to prevent this.
		 */
		ObjectTypeClass anObjectType = new ObjectTypeClass();
		
		anObjectType.setField(10);
		System.out.println("The type of the private field is now: " + anObjectType.getField().getClass());
		
		anObjectType.setField(21.0);
		System.out.println("The type of the private field is now: " + anObjectType.getField().getClass());
		
		anObjectType.setField("string");
		System.out.println("The type of the private field is now: " + anObjectType.getField().getClass());

		anObjectType.setField(new ComplexNumber(2, 3));
		System.out.println("The type of the private field is now: " + anObjectType.getField().getClass());

		ObjectTypeClass anotherObject = new ObjectTypeClass();
		anotherObject.setField(new ComplexNumber(3, 4));

		// THEN YOU USE GENERICS:
		System.out.println();
		/*
		 * You specify Double in angle brackets, and then you call the constructor of
		 * GenericClass. Note: Double (like Float, Integer, Long, Character, Boolean) is
		 * a wrapper class: it wraps the primitive type double into an object on the
		 * heap. It also provides some methods and fields (for example Double.MAX_VALUE).
		 * Generics only accept wrapper classes.
		 */
		GenericClass<Double> aDoubleContainer = new GenericClass<Double>();
		aDoubleContainer.setField(10.0);// aDoubleContainer is a container of Doubles.
		System.out.println("The type of the private field is now: " + aDoubleContainer.getField().getClass());
		// We can store the field as Double (or double)
		Double x = aDoubleContainer.getField();
		System.out.println("Double type instantiation of the generic class. Field returns: " + x);
		aDoubleContainer.setField(9.0);
		// you cannot set the field (for this same object) to be of another type!
//		aDoubleContainer.setField("string");

		System.out.println();
		
		// You specify ComplexNumber in angle brackets, and then you call the constructor of GenericClass
		GenericClass<ComplexNumber> aComplexContainer = new GenericClass<ComplexNumber>();
		aComplexContainer.setField(new ComplexNumber(2, 3));// you set the field to be a complex number
		System.out.println("The type of the private field is now: " + anObjectType.getField().getClass());
		ComplexNumber aComplex = aComplexContainer.getField();// you get this complex number
		System.out.println("Complex number type instantiation of the generic class.");
		System.out.println("Real part: " + aComplex.getRealPart());
		System.out.println("Imaginary part: " + aComplex.getImaginaryPart());
		
		// you cannot set the field (for this same object) to be of another type!
		//aComplexContainer.setField(10.0);
		

	}
}
