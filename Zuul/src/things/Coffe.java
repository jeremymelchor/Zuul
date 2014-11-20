package things;

import player.Player;

public class Coffe extends Thing {
    public Coffe() {
        super("coffe");
    }
    
    public void isUsed(Player pl) {
        modifEnergy(pl);
    }
    
    public void modifEnergy(Player pl) {
        pl.lvlEnergy--;
    }
}
