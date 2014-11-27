package things;

import player.Player;

public class Babyfoot extends Thing {
	public Babyfoot() {
		super("babyfoot");
	}

	/**
	 * When you play babyfoot, it lowers the energy level.
	 */
	@Override
	public void use(Player player) {		
		System.out.println("You just played babyfoot. You forgot a lecture !");
	}
}
