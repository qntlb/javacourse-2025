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

	private static double kelvinToFahrenheit(double temperatureKelvin) { // Transformations for outputs
		return (temperatureKelvin - 273.15) * 9 / 5 + 32;
	}

	private static double fahrenheitToKelvin(double temperatureFahrenheit) { // Transformation for inputs
		return (temperatureFahrenheit - 32) * 5 / 9 + 273.15;
	}

	/*
	 * getter of the temperature: the conversion from Kelvin to Fahreneit has to be
	 * performed (we work with Kelvin, the client wants to read Fahreneit)
	 */
	public double getTemperature() {
		double temperatureFahrenheit = kelvinToFahrenheit(temperatureKelvin);
		return temperatureFahrenheit;
	}

	/*
	 * setter of the temperature: the conversion from Fahreneit to Kelvin has to be
	 * performed (we work with Kelvin, the client wants to set Fahreneit)
	 */
	public void setTemperature(double temperature) {
		temperatureKelvin = fahrenheitToKelvin(temperature);
		printn("The temperature in Kelvin is now " + temperatureKelvin);
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
