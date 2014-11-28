package rooms;

import main.Parser;
import main.Randomize;
import player.*;

public class Lecture extends Room {
	Randomize random;

	public Lecture() {
		super("in a lecture");
		random = new Randomize();
	}

	@Override
	public void action(Player player) {
		/** Nothing (never called) */
	}

	/**
	 * A method deciding what is in the lecture. In case it's not an OOP class,
	 * it asks if you want to follow it.
	 */
	@Override
	public boolean specialAction(Player player) {
		// first, let's see what lecture is in the classroom.
		int choice = random.isItOOP();
		if (choice == 0) { // we are in not in an OOP class (we may follow it)
			System.out
					.println("This is not an OOP class. Would you like to follow it ?");
			Parser pa = new Parser();
			String ans = pa.getCommand();
			if (ans.equals("yes")) {
				player.lowEnergy(10);
				System.out.println("You followed the class. Energy -10");
				return true;
			} else {
				System.out.println("You were kicked out of the room.");
				return false;
			}
		} else if (choice == 1) { // we are in an OOP class (we must follow it)
			System.out
					.println("This is an OOP class. You follow it. You learned a new lecture. Energy -10");
			player.addLecture();
			player.lowEnergy(10);
		} else { // the room is empty (we can do whatever we want)
			System.out.println("The room is empty.");
			return true;
		}
		return false;
	}
}
