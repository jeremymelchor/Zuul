package things;

import player.Player;

public class Coffee extends Thing {
	public Coffee() {
		super("coffe");
	}

	public void isUsed(Player pl) {
		modifEnergy(pl);
	}

	public void modifEnergy(Player pl) {
		pl.lvlEnergy--;
	}
}
