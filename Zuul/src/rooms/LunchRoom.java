package rooms;

import main.Language;
import things.*;

/**
 * @author Lisa Joanno & Jérémy Melchor
 * 
 *         Create the Lunch room
 */
public class LunchRoom extends Room {
	private Coffee coffee;
	private Babyfoot babyfoot;

	/**
	 * In the lunch room, you can drink coffee and play babyfoot.
	 */
	public LunchRoom() {
		super(Language.LUNCH_ROOM.toString());
		coffee = new Coffee();
		babyfoot = new Babyfoot();
		listOfThings.add(coffee);
		listOfThings.add(babyfoot);
	}
}