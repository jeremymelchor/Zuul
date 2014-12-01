package rooms;

import player.Player;
import main.Language;
import main.Quiz;

/**
 * @author Lisa Joanno & Jérémy Melchor
 * 
 *         Create the exam room with an action associate to it
 */
public class Exam extends Room {
	public Exam() {
		super(Language.EXAM_ROOM.toString());
	}

	/**
	 * When the player enters this room, first, we check that he hasn't found
	 * the cheat sheet, then, we check that he is qualified enough and has
	 * enough energy to pass the exam. If all the conditions are here, we create
	 * the exam.
	 */
	@Override
	public void action(Player player) {
		if (!cheat(player)) {
			if (player.canTakeTheExam()) {
				new Quiz();
			} else {
				System.out.println("You can't take the exam yet !");
			}
		} else {
			System.out.println(Language.CHEAT);
		}
	}

	/**
	 * A method checking if you have read or not the sheet cheat.
	 * 
	 * @param player
	 * @return true if the player read the cheat sheet.
	 */
	boolean cheat(Player player) {
		return player.getTheCheatSheet();
	}
}