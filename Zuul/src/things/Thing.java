package things;

import player.Player;

public class Thing {
	private String description;

	public Thing(String description) {
		this.description = description;
	}

	public void printEnergy(Player pl) {
		System.out.println(pl.getLvlEnergy());
	}

}
