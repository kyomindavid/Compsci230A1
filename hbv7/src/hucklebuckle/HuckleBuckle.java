package hucklebuckle;

/** Description of HuckleBuckle
 * 
 * @author Clark Thomborson
 * @version 7.0 of 2014-07-25 14:20
 */

public class HuckleBuckle {

	/**
	 * @param args
	 *   String from command-line: if empty, play on a 3x3 grid
	 */
	public static void main(String[] args) {
		
		int gridSize = 3; // default value, if no args
		
		// first arg: gridSize
		if (args.length > 0) { 
			try {
				gridSize = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Usage: hbv7 [gridSize]");
				System.exit(1);
			}
			if(gridSize < 1 || gridSize > 40) {
				System.err.println("Error: gridSize must be in the range 1..40.  ");
				System.exit(1);
			}
		}

		if( args.length > 1) {
			System.err.println("Usage: hbv7 [gridSize]");
			System.exit(1);
		}

		Game myGame = new Game( gridSize );
		myGame.play();
	}


}