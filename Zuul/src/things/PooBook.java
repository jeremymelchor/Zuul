package things;

import main.Language;
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
		player.addAllLecture();
		System.out
				.println(Language.POO_BOOK);
	}
}