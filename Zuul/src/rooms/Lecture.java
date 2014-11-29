package rooms;

import main.Language;
import main.Parser;
import main.Randomize;
import player.*;

public class Lecture extends Room {
	Randomize random;

	public Lecture() {
		super(Language.IN_A_LECTURE.toString());
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
			System.out.println(Language.NOT_OOP_COURSE);
			Parser pa = new Parser();
			String ans = pa.getCommand();
			if (ans.equals(Language.YES_WORD.toString())) {
				player.lowEnergy(10);
				System.out.println(Language.FOLLOW_COURSE);
				return true;
			} else {
				System.out.println(Language.KICKED_ROOM);
				return false;
			}
		} else if (choice == 1) { // we are in an OOP class (we must follow it)
			System.out.println(Language.THIS_IS_OOP_LECTURE);
			if (player.whatLectureToAttend() != null) {
				System.out.println(Language.YOU_FOLLOW_IT);
				player.addLecture();
				player.lowEnergy(10);			
			} else {
				System.out.println(Language.NO_LECTURE_LEFT);
			}
			return true;	
		} else { // the room is empty (we can do whatever we want)
			System.out.println(Language.EMPTY_ROOM);
			return true;
		}
	}
}