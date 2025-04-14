package com.alessandrosgarabottolo.session4.polymorphism.shapes;

/**
 * Particular kind of shape, for which we know how to compute the area, i.e.,
 * how to implement the method computeArea().
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class Square extends Shape {
	
	private double side;

	public Square(double side) {
		this.side=side;
	}

	/*
	 * Note the @Override annotation: if we use it, we get an error if our method is not overriding a method
	 * of the parent class. This is useful to avoid mistakes (for example we are accidentally changing the name
	 * of the method)
	 */
	@Override
	public double computeArea() {
		System.out.println("Computing the area of the square..");
		return side*side;
	}

}
