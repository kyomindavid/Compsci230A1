package hucklebuckle;

/**
 * @author ctho065
 * @version 7.1: prints "Playing HuckleBuckle..." message to System.out in the constructor.  2014-07-28 ctho065
 *
 */
class Game {

	Hider myHider;
	Seeker mySeeker;
	HumanSeeker myHumanSeeker;
	ComputerSeeker myComputerSeeker;
	int gridSize;
	boolean humanSeeker = false;

	Game( int gs, String name ) {
		gridSize = gs;
		System.out.println( "Playing HuckleBuckle on a " + gs + " by " + gs + " grid..." );
		myHider = new Hider( "Harry", this );

		if (name.equals("")){
			myComputerSeeker = new ComputerSeeker( "Sally", this );	
		} else {
			myHumanSeeker = new HumanSeeker(name, this);
			humanSeeker = true;
		}
	}

	void play() {
		if (!humanSeeker){
			myComputerSeeker.seek();
		} else {
			myHumanSeeker.seek();
		}
	}
}