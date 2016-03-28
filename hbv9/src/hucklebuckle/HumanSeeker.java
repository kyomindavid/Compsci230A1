package hucklebuckle;

import java.awt.Point;
import java.util.Scanner;

class HumanSeeker extends Player{

	Scanner input;

	HumanSeeker(String n, Game g){
		super(new Point(0,0), n, g);
		input = new Scanner(System.in); 
	}
	
	void seek() {
		System.out.println( "Hi, I'm " + getName() + ", I'm ready to play!  " );
		System.out.println(reportLocation());
		
		while (game.myHider.revealTemperature(this) != Temperature.HUCKLEBUCKLEBEANSTALK){
			System.out.print("Please type a directional character (n, s, e, w) OR type q to give up: ");
			String userInput = input.next();
			char c = userInput.charAt(0);
			if (c == 'n'){
				this.move(0, 1);
			} else if (c == 's'){
				this.move(0, -1);
			} else if (c == 'e'){
				this.move(1, 0);
			} else if (c == 'w'){
				this.move(-1, 0);
			} else if (c == 'q'){
				System.out.println("I give up. I can't find you!");
				System.exit(0);
			}
		}
	}

}
