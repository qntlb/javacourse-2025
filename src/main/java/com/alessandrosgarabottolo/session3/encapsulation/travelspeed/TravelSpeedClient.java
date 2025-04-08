package com.alessandrosgarabottolo.session3.encapsulation.travelspeed;

import static com.alessandrosgarabottolo.session3.useful.Print.printn;

/**
 * This class illustrates the use of setters, getters and in general of
 * encapsulation: this is the way a client who works with kilometers would use
 * with our TravelTime class.
 *
 * @author Andrea Mazzon
 *
 */
public class TravelSpeedClient {
	public static void main(String[] args) {

		double distanceInKm = 50; // in km
		double timeInMinutes = 30;

		TravelSpeed myTravel = new TravelSpeed(distanceInKm, timeInMinutes);
		
		// we can modify the distance travelled
		myTravel.setDistance(40); //would be fine
		
		// we can retrieve the distance travelled
		double myDistance = myTravel.getDistance(); //would be fine
		printn("The distance travelled is " + myDistance);
		
		// with the setter we avoid the ambiguity arising from the following line of code:
		//myTravel.distance = 40; //in km! no that nice for us
		
		// with the getter we avoid the ambiguity arising from the following line of code:
		// printn("The distance is " + myTravel.distance);
		
		printn("Average speed: " + myTravel.getSpeed() + " km per hour");// use of getter

	}

}
