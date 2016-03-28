package hucklebuckle;
/**
 * @author ctho065
 * @version 7.1: move() returns void.  2014-07-28 ctho065
 *
 */

import java.awt.Point;

abstract class Player {
	
	private Point location;
	private String name;
	Game game;

	Player( Point p, String n, Game g ) {
		location = p; 
		name = n;
		game = g;
	}
	
	String getName(){
		return name;
	}

	void setLocation( Point p ) {
		location = p; 
	}
	
	Point getLocation(){
		return location;
	}
	
	String reportLocation() {
		return( name + " is at (" + 
				(int) location.getX() + ", " + (int) location.getY() + ")." 
				);
	}
	
	// warning: no error-checking, could move off the grid!!!
	void move( int dx, int dy ){
		location.translate( dx, dy );
	}

}