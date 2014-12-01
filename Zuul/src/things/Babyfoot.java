package things;

import player.Player;

/**
 * @author Lisa Joanno & Jérémy Melchor
 * 
 *         Define an action for the babyfoot
 */
public class Babyfoot extends Thing {
	public Babyfoot() {
		super("babyfoot");
	}

	/**
	 * When you play babyfoot, it lowers the energy level.
	 */
	@Override
	public void use(Player player) {
		player.forgetOneRandomLecture();
		player.lowEnergy(5);
		System.out
				.println("You just played babyfoot. You forgot a lecture ! Energy -5.");
	}
}
