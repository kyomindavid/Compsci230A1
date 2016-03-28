package hucklebuckle;
/**
 * @author ctho065
 * @version 7.1: seek() doesn't move off-grid, and always finds the Hider.  2014-07-28 ctho065
 *
 */

import java.awt.Point;

class Seeker extends Player {

	Seeker( String n, Game g ) {
		super( new Point( 0, 0 ), n, g ); // a seeker starts at 0,0
	}

	void seek() {
		System.out.println( "Hi, I'm " + getName() + ", let's play now!  " );
		// I walk through the grid until I find the hidden object.
		boolean moveRight = true; // I move left-to-right on the first row (y==0)
		for( int y=0; y < game.gridSize; y++ ){
			for( int x=0; x < game.gridSize-1; x++ ){
				System.out.println( reportLocation() );
				if( game.myHider.revealTemperature( this ) == Temperature.HUCKLEBUCKLEBEANSTALK )
					return; // I found it, hooray!
				if( moveRight ) {
					this.move( 1, 0 ); // I move East (higher x-value)
				} else {
					this.move( -1, 0 ); // I move West (lower x-value)
				}
			}
			System.out.println( reportLocation() );
			if( game.myHider.revealTemperature( this ) == Temperature.HUCKLEBUCKLEBEANSTALK )
				return; // I found it, hooray!
			this.move( 0, 1 ); // I move North (higher y-value)
			moveRight = !moveRight; // I move in the opposite direction on each row of the grid.
			// My movement pattern is sometimes called the "snake-like row major ordering".
			// See also http://en.wikipedia.org/wiki/Boustrophedon.
		}
		System.out.println( "I give up.  I can't find you!" );
	}

}