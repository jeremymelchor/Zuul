package rooms;

import main.Language;
import player.*;

/**
 * @author Lisa Joanno & Jérémy Melchor
 * 
 *         Create Ali's Room with an action associate to it
 */
public class Ali extends Room {
	public Ali() {
		super(Language.ALI.toString());
	}

	/**
	 * Here the action is very limited...
	 */
	@Override
	public void action(Player player) {
		System.out.println(Language.MESSY);
	}
}