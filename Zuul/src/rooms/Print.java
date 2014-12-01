package rooms;

import player.Player;
import main.Language;
import main.Randomize;

/**
 * @author Lisa Joanno & Jérémy Melchor
 * 
 *         Create the print room with an action associate to it
 */
public class Print extends Room {
	private Randomize random;

	public Print() {
		super(Language.PRINT_ROOM.toString());
		random = new Randomize();
	}

	/**
	 * A method called when the player enters the print room. It gives, with a
	 * certain probability, a cheat sheet making you finishing the game (because
	 * you have the answers to all questions, you just have to pass the exam)
	 */
	@Override
	public void action(Player player) {
		if (random.creatingTheCheatSheet()) {
			player.setTheCheatSheet(true);
			System.out.println(Language.FOUND_CHEAT);
		}
	}

}