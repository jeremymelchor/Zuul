package rooms;
import main.Language;
import main.Parser;
import main.Randomize;
import player.*;

public class Lab  extends Room {
	Randomize random;

	public Lab() {
		super("in a lab");
		random = new Randomize();
	}

	@Override
	public void action(Player player) {
		/** Nothing (never called) */
	}

	/**
	 * A method deciding what is in the lab. In case it's not an OOP class,
	 * it asks if you want to follow it.
	 */
	@Override
	public boolean specialAction(Player player) {
		// first, let's see what lecture is in the classroom.
		int choice = random.isItOOP();
		if (choice == 0) { // we are in not in an OOP class (we may follow it)
			System.out
					.println(Language.NOT_OOP_LAB);
			Parser pa = new Parser();
			String ans = pa.getCommand();
			if (ans.equals(Language.YES)) {
				player.lowEnergy(10);
				System.out.println(Language.FOLLOW_LAB);
				return true;
			} else {
				System.out.println(Language.KICKED_ROOM);
				return false;
			}
		} else if (choice == 1) { // we are in an OOP class (we must follow it)
			System.out
					.println(Language.OOP_LAB);
			player.addLab();
			player.lowEnergy(10);
		} else { // the room is empty (we can do whatever we want)
			System.out.println(Language.EMPTY_ROOM);
			return true;
		}
		return false;
	}
}