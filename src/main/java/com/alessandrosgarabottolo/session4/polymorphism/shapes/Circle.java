package com.alessandrosgarabottolo.session4.polymorphism.shapes;

/**
 * Class implementing a circle, a particular kind of shape, for which we know how to compute the area, i.e.,
 * how to implement the method computeArea().
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	/*
	 * Note the @Override annotation: if we use it, we get an error if our method is
	 * not overriding a method of the parent class. This is useful to avoid mistakes
	 * (for example we are accidentally changing the name of the method)
	 */
	@Override
	public double computeArea() {
		System.out.println("Computing the area of the circle..");
		return Math.PI * radius * radius;
	}
	
}