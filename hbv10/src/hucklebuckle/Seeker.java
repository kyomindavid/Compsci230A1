package hucklebuckle;
/**
 * @author ctho065
 * @version 7.1: seek() doesn't move off-grid, and always finds the Hider.  2014-07-28 ctho065
 *
 */

import java.awt.Point;

abstract class Seeker extends Player {

	Seeker( String n, Game g ) {
		super( new Point( 0, 0 ), n, g ); // a seeker starts at 0,0
	}

}