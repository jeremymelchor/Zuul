package things;

import player.Player;

/**
 * @author Lisa Joanno & Jérémy Melchor
 * 
 *         Define an item, with a description with a use
 */
public class Thing {
	private String description;

	public Thing(String description) {
		this.description = description;
	}

	public void printEnergy(Player pl) {
		System.out.println(pl.getLvlEnergy());
	}

	/**
	 * A method that will be completed in each kind of things. When used, it
	 * will do what the object is supposed to do (lowering energy, etc...)
	 * 
	 * @param player
	 */
	public void use(Player player) {
		/** Nothing */
	}

	/**
	 * A method returning the description of the object.
	 * 
	 * @return String description
	 */
	public String getDescription() {
		return this.description;
	}
}
