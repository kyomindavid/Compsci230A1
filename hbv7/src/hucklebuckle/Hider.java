package hucklebuckle;

import java.awt.Point;

class Hider extends Player {

	Hider( String n, Game g ) { // a hider chooses a location at random
		super( new Point ( (int) (Math.random() * g.gridSize), 
							(int) (Math.random() * g.gridSize) ), 
				n,
				g
				);
		System.out.println( 
				"  Hi, I'm " + getName() + ".  Want to play Huckle Buckle Beanstalk with me?" );
	}

	Temperature revealTemperature( Seeker s ) {

		double r = getLocation().distance( s.getLocation() ) 
				/ (double) game.gridSize;

		System.out.print( "  " + getName() + " says to " + s.getName() + ": " );
		if(r == 0.0) {
			System.out.println("Huckle buckle beanstalk!");
			return Temperature.HUCKLEBUCKLEBEANSTALK;
		} else if(r <= 0.2) {
			System.out.println("You're boiling!");
			return Temperature.BOILING;
		} else if(r <= 0.4) {
			System.out.println("You're hot.");
			return Temperature.HOT;
		} else if(r <= 0.6) {
			System.out.println("You're warm.");
			return Temperature.WARM;
		} else if(r <= 0.8) {
			System.out.println("You're cool.");
			return Temperature.COOL;
		} else if(r <= 1.0) {
			System.out.println("You're cold.");
			return Temperature.COLD;
		} else 
			System.out.println("You're freezing!");
		return Temperature.FREEZING;
	}

}