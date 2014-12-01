package rooms;

import main.Language;
import player.*;

/**
 * @author Lisa Joanno & Jérémy Melchor
 * 
 *         Create the secretariat room with an action associate to it
 */
public class Secretariat extends Room {
	public Secretariat() {
		super(Language.SECRETARIAT.toString());
	}

	/**
	 * Here the action is very limited...
	 */
	@Override
	public void action(Player player) {
		System.out.println(Language.PEOPLE_HERE);
	}
}