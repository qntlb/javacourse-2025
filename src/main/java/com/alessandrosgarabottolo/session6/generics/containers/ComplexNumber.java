package com.alessandrosgarabottolo.session6.generics.containers;

/**
 * Class of complex numbers in Cartesian form. This will just serve as an example for generics.
 */
public class ComplexNumber { // Defining custom type

	private double realPart;
	private double imaginaryPart;

	ComplexNumber(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public double getRealPart() {
		return realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}
}
