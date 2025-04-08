package com.alessandrosgarabottolo.session3.encapsulation.gas;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * This class shows the use of encapsulation in order to manage access control:
 * imagine we have an American client who only understands degrees Fahrenheit.
 * However, we work with Kelvin. We have therefore to let him/her give and read
 * degrees Fahrenheit, through public getters and setters, and then perform a
 * conversion from Fahrenheit to Kelvin, and vice versa. These methods to
 * perform conversions should be private: the client is only interested on
 * Fahrenheit.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 *
 */
public class Gas {

	private double temperatureKelvin; // it should be Kelvin: private, the client does not see it
	private double pressure; // Pascal
	
	private final static double gayLussacConstant = 8.3145; // final keyword: the value of this field cannot be modified

	/*
	 * TODO: write the private method kelvinToFahreneit recalling the formula
	 * F = C * 9/5 + 32, where F is Fahreneit and C is celsius. Also remember that C = K - 273.15
	 */
	
	/*
	 * TODO: write the private method fahreneitToKelvin
	 */

	/*
	 * getter of the temperature: the conversion from Kelvin to Fahreneit has to be
	 * performed (we work with Kelvin, the client wants to read Fahreneit)
	 */
	public double getTemperature() {
		// TODO: implement the method
	}

	/*
	 * setter of the temperature: the conversion from Fahreneit to Kelvin has to be
	 * performed (we work with Kelvin, the client wants to set Fahreneit)
	 */
	public void setTemperature(double temperature) {
		// TODO: implement the method so that a message with the new temperature in Kelvin is printed
	}

	// Calculates pressure- Gay Lussac Law. The temperature has to be in Kelvin
	private void calculatePressure() {
		pressure = temperatureKelvin * gayLussacConstant;
	}

	// getter of the pressure: of course public
	public double getPressure() {
		calculatePressure();
		// we could also write:
		// double pressure = temperatureKelvin * gayLussacConstant;
		return pressure;
	}
}
