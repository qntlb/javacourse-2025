package com.alessandrosgarabottolo.session5.interfacesandpolymorphism.orchestra;

/**
 * This class has a static method that makes a specific type of Instrument
 * playing a note, and a main method that makes all the instruments playing some
 * notes. Note that all the objects get upcasted to the interface they are
 * implementing when tune is called.
 */
public class Orchestra {
	/*
	 * Polymorphism: at compilation time, this method doesn’t care about the type of
	 * the instrument, so we can give it directly an Instrument reference. In this
	 * way, when we add new types to the system it still works right, without any
	 * need to change the code.
	 */
	/**
	 * It makes an Instrument playing a Note in its specific way
	 */
	public static void tune(Instrument i, Note n) {
		i.play(n);
	}

	public static void main(String[] args) {
		/*
		 * The reference is always the one to the interface, but the specific type
		 * changes. As in the example with shapes!
		 */
		Instrument[] orchestra = { new Wind(), new Woodwind(), new Violin() }; // note the initialization of the array
		Note[] chord = { Note.C, Note.E, Note.G };

		System.out.println("The orchestra is tuning:");
		orchestra[0].play(Note.A);
		System.out.println();

		// cannot do it, even if it is a Wind(): the reference is to Instrument!
//		orchestra[0].specificWind(); // error, this Wind is treated as an Instrument
		((Wind) orchestra[0]).specificWind(); // with downcasting it works

		// Let them play a C major chord
		for (int i = 0; i < orchestra.length; i++) {
			tune(orchestra[i], chord[i]);
		}
		System.out.println();
		
		// They are a bit out of tune, let them rehearse each note of the chord!
		System.out.println("Orchestra rehearsing:");
		for (Instrument i : orchestra) {// look at the use of the foreach syntax!
			for (Note n : chord) {
				tune(i, n);
			}
			System.out.println();
		}
	}
}
