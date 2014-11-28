package rooms;
import main.Language;
import player.*;

public class Corridor extends Room {
	public Corridor() {
		super("in a corridor");
	}

	void printDescription() {
		System.out.println(this.getLongDescription());
		System.out
				.println(Language.AMAZING);
	}
}
