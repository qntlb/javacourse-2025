package com.alessandrosgarabottolo.session4.polymorphism.shapes;

/**
 * Class implementing a triangle, a particular kind of shape, for which we know how to compute the area,
 * i.e., how to implement the method computeArea().
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class Triangle extends Shape {
	
	private double basis;
	private double height;

	public Triangle(double basis, double height){
		this.basis=basis;
		this.height=height;
	}

	/*
	 * note the @Override annotation: if we use it, we get an error if our method is not overriding a method
	 * of the parent class. This is useful to avoid mistakes (for example we are accidentally changing the name
	 * of the method)
	 */
	@Override
	public double computeArea() {
		System.out.println("Computing the area of the triangle..");
		return basis * height / 2;
	}

}

