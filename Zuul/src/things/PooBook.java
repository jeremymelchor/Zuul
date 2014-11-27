package things;

import player.Player;

public class PooBook extends Thing {
	public PooBook() {
		super("POO book");
	}

	/**
	 * When you read a POO book, it like you attended a lecture.
	 */
	@Override
	public void use(Player player) {
		// here the method adding a lecture
		System.out.println("You just read a POO book !");
	}
}