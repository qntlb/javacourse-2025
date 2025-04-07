package com.alessandrosgarabottolo.session2.triangleperimeter;

/**
 * In this class we see an example of how methods overloading can help us making
 * the life of the user easier: we write a method to compute the perimeter of a triangle.
 * The general formula would of course
 * ask us to sum the length of the three sides. However, we maybe don't want somebody 
 * to give the length of all the three sides if we know they have equal length!
 * On the other hand, it would not make sense to call the method differently if it does
 * the same thing, i.e., compute a perimeter. So, here methods overloading comes into play.
 * Same thing if two sides have same length.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class PerimeterCalculator {

	/*
	 * Most "general" implementation: case where the sides have all different
	 * length
	 */
	// TODO: write the method computePerimeter in the case where three arguments of type double are passed

	/*
	 * isosceles triangle: you see that it would not make sense to call this method
	 * in another way: it does compute a perimeter
	 */
	double computePerimeter(double equalSidesLength, double differentSideLength) {
		double perimeter = equalSidesLength * 2 + differentSideLength;
		return perimeter;
	}

	// equilateral triangle
	// TODO: write the overloading method where only one side is passed, which implicitly means that the triangle is equilateral.

}
