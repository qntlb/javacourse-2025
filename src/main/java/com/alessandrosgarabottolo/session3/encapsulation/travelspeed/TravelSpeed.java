package com.alessandrosgarabottolo.session3.encapsulation.travelspeed;

/**
 * This class illustrates an example of encapsulation. 
 * We imagine that a client gives us a distance that he/she traveled and the
 * time needed to travel that distance, and we have to give back the average
 * speed.
 * Suppose that our first version had everything in km, but that for some reasons
 * we have now to move to miles. However, we don't want that our client has to
 * change the own code.
 * Therefore we need to implement a transformation method that translates from
 * km to miles and vice versa. Moreover, we have to prevent the user to directly
 * access the fields of the class, because we want them to always be in miles.
 * We then make them private, and write getters and setters which use the
 * (private) transformation method. In this way, with respect to before we only
 * need to change getters, setters and the constructor, and to define the
 * conversion method, keeping the rest of the code as is.
 *
 * Original author: Andrea Mazzon
 * Modified by: Alessandro Sgarabottolo
 * 
 * @author Andrea Mazzon
 * @author Alessandro Sgarabottolo
 */
public class TravelSpeed {

	/*
	 * We don't want our client to be able to directly set the values of this
	 * fields, as we want it to be expressed in miles.
	 */
	private double distance; // in miles
	/*
	 * Time is also private, this is a general coding rule: make fields private as
	 * long as you can. For example: now we express time in minutes, but maybe in a
	 * future we change to fraction of hours. In this case, we still want to handle
	 * this change on the backstage of our code, so that the user does not have to
	 * change the own code.
	 */
	private double time; // in minutes
	
	// static: the same value is shared for every object, and final: cannot be changed
	private final static double conversion = 1.60934;

	TravelSpeed(double distance, double time) {
		// we immediately convert to miles
		this.distance = kmToMiles(distance);
		this.time = time;
	}

	// conversion from km to miles: private, the client doesn't need to see it
	private double kmToMiles(double distanceInKm) {
		return distanceInKm / conversion;
	}

	// conversion from miles to km: private, the client doesn't need to see it
	private double milesToKm(double distanceInMiles) {
		return distanceInMiles * conversion;
	}

	/*
	 * We want the user to be able to give us a new distance as well, replacing the
	 * one given in the constructor. But we want to have CONTROL on how the user
	 * does this.
	 */
	/**
	 * It sets the distance traveled
	 *
	 * @param distance, the distance traveled, in km
	 */
	public void setDistance(double distance) {
		// the client gives the distance in km, we take care of converting it
		this.distance = kmToMiles(distance);
	}

	/**
	 * It sets the time needed for the travel, in minutes
	 *
	 * @param time, the time needed for the travel
	 */
	public void setTime(double time) {
		this.time = time; // no conversion needed here
	}

	/*
	 * getter of the distance: for some reason, the user might want to retrieve the
	 * distance traveled. The conversion from miles to km has to be performed
	 *
	 */
	/**
	 * It returns the distance traveled
	 *
	 * @return the distance traveled, in km
	 */
	public double getDistance() {
		return milesToKm(distance);// the client expects to have back a distance in km
	}

	/**
	 * It returns the speed in km/h
	 *
	 * @return the speed in km/h
	 */
	public double getSpeed() {
		double distanceInKm = milesToKm(distance);
		double speedInKm = distanceInKm / time * 60;
		return speedInKm;
	}

}
