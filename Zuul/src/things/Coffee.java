package things;

import player.Player;

/**
 * @author Lisa Joanno & Jérémy Melchor
 * 
 *         Create an item coffee and associate it a use
 */
public class Coffee extends Thing {
	public Coffee() {
		super("coffe");
	}

	/**
	 * When you drink a coffee, it raises the energy level.
	 */
	@Override
	public void use(Player player) {
		player.raiseEnergy(10);
		System.out.println("You just drank a coffe. Energy +10.");
	}

}
