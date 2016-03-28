package hucklebuckle;

/**
 * @author ctho065
 * @version 7.1: prints "Playing HuckleBuckle..." message to System.out in the constructor.  2014-07-28 ctho065
 *
 */
class Game {

	Hider myHider;
	Seeker mySeeker;
	int gridSize;

	Game( int gs ) {
		gridSize = gs;
		System.out.println( "Playing HuckleBuckle on a " + gs + " by " + gs + " grid..." );
		myHider = new Hider( "Harry", this );
		mySeeker = new Seeker( "Sally", this );
	}

	void play() {
		mySeeker.seek();
	}
}